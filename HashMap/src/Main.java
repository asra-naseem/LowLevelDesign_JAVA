//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
     myHashMap.put(1,"Asra");
     myHashMap.put(2,"Lubna");
     myHashMap.put(3,"John");
     myHashMap.put(3,"derek");
     System.out.println(myHashMap.get(2));
     System.out.println(myHashMap.get(3));
     System.out.println(myHashMap.get(1));

        }
    }
