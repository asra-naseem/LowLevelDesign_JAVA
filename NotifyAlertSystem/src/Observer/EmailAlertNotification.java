package Observer;

import ObservablePattern.StockObservable;

public class EmailAlertNotification implements NotificationAlertObserver {
    String emailId;
    StockObservable stockObservable;

    public EmailAlertNotification(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    public void update() {
        this.sendemail(this.emailId, "Product is available");
    }

    public void sendemail(String emailId, String msg) {
        System.out.println("Email sent to " + emailId);
    }
}
