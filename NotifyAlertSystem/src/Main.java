import ObservablePattern.IphoneObservable;
import ObservablePattern.StockObservable;
import Observer.EmailAlertNotification;
import Observer.MsgAlertNotification;
import Observer.NotificationAlertObserver;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        StockObservable observable1 = new IphoneObservable(0);
        System.out.println("Hey");
        NotificationAlertObserver observer1 = new MsgAlertNotification(1234567890L, observable1);
        NotificationAlertObserver observer2 = new EmailAlertNotification("xyz@gmail.com", observable1);
        observable1.addSubscriber(observer1);
        observable1.addSubscriber(observer2);
        observable1.setStock(10);
    }
}
