 class MyHashMap {
    public class Node{
        int key;
        int value;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    ArrayList<Node>[] arr;
    public MyHashMap() {
        arr=new ArrayList[10001];
    }
    
    public void put(int key, int value) {
        int i = key/100;
        if(arr[i]==null){
            arr[i]=new ArrayList<Node>();
            arr[i].add(new Node(key,value));
            return;
        }else{
            for(Node n: arr[i]){
                if(n.key==key){
                    n.value=value;
                    return;
                }
            }
            arr[i].add(new Node(key,value));
        }
    }
    
    public int get(int key) {
        int i = key/100;
        if(arr[i]==null){
            return -1;
        }
        for(Node n: arr[i]){
            if(n.key==key){
                return n.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int i = key/100;
        if(arr[i]==null){
            return;
        }
        for(Node n: arr[i]){
            if(n.key==key){
                arr[i].remove(n);
                return;
            }
        }
    }
}
