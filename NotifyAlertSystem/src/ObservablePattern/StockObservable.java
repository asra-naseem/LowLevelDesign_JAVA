package ObservablePattern;

import Observer.NotificationAlertObserver;

public interface StockObservable {
    void addSubscriber(NotificationAlertObserver var1);

    void removeItem(NotificationAlertObserver var1);

    void notifySubscribers();

    void setStock(int var1);

    int getStock();
}
