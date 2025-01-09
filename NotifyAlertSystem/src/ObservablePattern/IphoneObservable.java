//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ObservablePattern;

import Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IphoneObservable implements StockObservable {
    List<NotificationAlertObserver> subscribers = new ArrayList();
    public int stockCount;

    public IphoneObservable(int stockCount) {
        this.stockCount = stockCount;
    }

    public void addSubscriber(NotificationAlertObserver notificationObserver) {
        this.subscribers.add(notificationObserver);
    }

    public void removeItem(NotificationAlertObserver notificationObservers) {
        this.subscribers.remove(notificationObservers);
    }

    public void notifySubscribers() {
        Iterator var1 = this.subscribers.iterator();

        while(var1.hasNext()) {
            NotificationAlertObserver subscriber = (NotificationAlertObserver)var1.next();
            subscriber.update();
        }

    }

    public void setStock(int itemCount) {
        if (this.stockCount == 0) {
            this.notifySubscribers();
        }

        this.stockCount += itemCount;
    }

    public int getStock() {
        return this.stockCount;
    }
}
