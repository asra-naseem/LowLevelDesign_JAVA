public class MyHashMap<K,V> {

    private static final int INITIAL_SIZE=16;
    private static final int MAXIMUM_SIZE=1<<30;
    private EntryTable [] entryTable;

    public MyHashMap() {
        this.entryTable = new EntryTable[INITIAL_SIZE];
    }
    public MyHashMap(int size){

      this.entryTable=new EntryTable[this.decideSize(size)];
    }
    public int decideSize(int cap){
        int n= cap-1;
        n|= n>>>1;
        n|= n>>>2;
        n|= n>>>4;
        n|= n>>>8;
        n|= n>>>16;
        return  n<1 ? 1: (n >= MAXIMUM_SIZE) ? MAXIMUM_SIZE : n + 1;
    }

   public void put (K key ,V value){
        int hashCode = key.hashCode()% entryTable.length;
        EntryTable node = entryTable[hashCode];

        if(node==null){
            EntryTable newNode =new EntryTable();
            System.out.println("lets add key with value:"+ key+value);
            newNode.setValue(value);
            newNode.setKey(key);
            newNode.setNext(null);
            entryTable[hashCode] = newNode;

        }
        else{
            EntryTable it = node;
            while(node!=null){
               if(it.getKey()==key)
               {
                   System.out.println("Already key exists ,lets add key with value:"+ key+" "+value);
                   it.setValue(value);
                   return;
               }
               it=node;
               node =node.next;
            }
            EntryTable node2 = new EntryTable();
            System.out.println("Collision occurs,lets add key with value:"+ key+" "+value);
            node2.setNext(null);
            node2.setKey(key);
            node2.setValue(value);
            it.next=node2;

        }
   }

   public V get (K key){
       int hashCode = key.hashCode()% entryTable.length;
       EntryTable node = entryTable[hashCode];
       while(node!=null){
           if(node.getKey()==key)
           {
               return (V)node.getValue();
           }
           node=node.next;
       }
       return null;
   }
}
