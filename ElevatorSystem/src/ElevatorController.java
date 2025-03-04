import java.util.PriorityQueue;

public class ElevatorController {
    public ElevatorCar elevatorCar;
    PriorityQueue<Integer>upMinHeap ;
    PriorityQueue<Integer>downMaxHeap ;
    public ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar=elevatorCar;
        upMinHeap = new PriorityQueue<>();
        downMaxHeap = new PriorityQueue<>((a,b) -> b-a);
        elevatorCar.elevatorStatus=Status.IDLE;
    }
    public void submitExternalRequest(int floor,Direction direction){
        if(direction==Direction.DOWN)
            downMaxHeap.add(floor);
        else
            upMinHeap.add(floor);
    }
    public void submitInternalRequest(int destinationFloor){
        System.out.println("Request received:"+destinationFloor);
        if(elevatorCar.currFloor>destinationFloor)
            downMaxHeap.add(destinationFloor);
        else
            upMinHeap.add(destinationFloor);
    }
    //Look algorithm
    public void controlElevator() {
        while(!upMinHeap.isEmpty()||!downMaxHeap.isEmpty())
        {   System.out.println("Processing Elevator Request");
            processElevatorRequest();
        }
        elevatorCar.elevatorStatus=Status.IDLE;
    }
    private void processElevatorRequest(){
        if(elevatorCar.currDirection==Direction.UP || elevatorCar.elevatorStatus==Status.IDLE) {
            processUpwardElevatorRequest();
            System.out.println("Processing Upward Elevator Request");
            if (upMinHeap.isEmpty()) {
                elevatorCar.currDirection = Direction.DOWN;
            }
        }
        if (elevatorCar.currDirection == Direction.DOWN || elevatorCar.elevatorStatus == Status.IDLE) {

            processDownwardElevatorRequests();
            System.out.println("Processing Downward Elevator Request");
            if (downMaxHeap.isEmpty()) {
                elevatorCar.currDirection = Direction.UP;
            }
        }
    }
    private void processUpwardElevatorRequest(){
        while (!upMinHeap.isEmpty() && upMinHeap.peek() >= elevatorCar.currFloor) {
            int nextFloor = upMinHeap.poll();
            System.out.println("Processing Upward Elevator Request nextfloor:"+nextFloor);
            elevatorCar.moveElevator(Direction.UP, nextFloor);
        }
    }

    private void processDownwardElevatorRequests(){
        while (!downMaxHeap.isEmpty() && downMaxHeap.peek() >= elevatorCar.currFloor) {
            int nextFloor = downMaxHeap.poll();
            System.out.println("Processing Downward Elevator Request nextfloor:"+nextFloor);
            elevatorCar.moveElevator(Direction.DOWN, nextFloor);
        }
    }
    }


