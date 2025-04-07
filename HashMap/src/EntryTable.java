public class EntryTable <K,V>{

    K key;
    V value;
    EntryTable next;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public EntryTable getNext() {
        return next;
    }

    public void setNext(EntryTable next) {
        this.next = next;
    }
}
