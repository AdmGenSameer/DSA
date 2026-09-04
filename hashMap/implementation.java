package hashMap;

import java.util.LinkedList;

public class implementation{
    static class HashMap(K,V){//generic
        private class Node{
            K key;
            V value;
            public class Node(k key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int size;
        private LinkedList<Node> buckets[];
    }
}