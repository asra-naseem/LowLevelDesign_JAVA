package Observer;
import ObservablePattern.StockObservable;

public class MsgAlertNotification implements NotificationAlertObserver {
    long phnoNumber;
    StockObservable stockObservable;

    public MsgAlertNotification(long phnoNumber, StockObservable stockObservable) {
        this.phnoNumber = phnoNumber;
        this.stockObservable = stockObservable;
    }

    public void update() {
        this.sendMsg(this.phnoNumber, "Product is available");
    }

    public void sendMsg(long phnoNumber, String msg) {
        System.out.println("Message sent to " + phnoNumber);
    }
}
