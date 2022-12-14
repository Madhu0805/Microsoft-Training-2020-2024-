class MyCircularQueue {
 List<Integer> list=new ArrayList<>();
    int size;
    public MyCircularQueue(int k) {
        size=k;
    }
    
    public boolean enQueue(int value) {
       if(list.size()!=size){    
           list.add(list.size(),value);
           return true;
       }
        System.out.println(list);
        return false;
        
    }
    
    public boolean deQueue() {
       if(list.isEmpty())
           return false;
        list.remove(0);
        return true;
    }
    
    public int Rear() {
        if(list.isEmpty())
            return -1;
        return list.get(list.size()-1);
    }
    
    public int Front() {
        if(list.isEmpty())
            return -1;
        return list.get(0);
        
    }
    
    public boolean isEmpty() {
        return list.size()==0;
    }
    
    public boolean isFull() {
        return list.size()==size;
    }
}
