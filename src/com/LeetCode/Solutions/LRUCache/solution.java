package com.LeetCode.Solutions.LRUCache;
import java.util.*;

public class solution {

    static class LRUCache {

        HashMap<Integer,cacheNode> map;
        LinkedList<cacheNode> ll;
        int capacity;
        class cacheNode{
            int key,data;
            cacheNode next;
            public cacheNode(){

            }
            public cacheNode(int key, int data){
                this.key = key; this.data = data;
            }

        }

        public LRUCache(int capacity) {
            map = new HashMap<>(capacity);
            ll = new LinkedList<>();
            this.capacity = capacity;
        }

        public int get(int key) {
            cacheNode value = map.get(key);
            if(value!=null)
            {
                ll.remove(ll.indexOf(value));
                ll.offerFirst(value);
            }
            else{return -1;}
            return value.data;
        }

        public void put(int key, int value) {
            cacheNode node = new cacheNode(key,value);

            if(map.size()>=capacity && map.size()>0){
                if(map.containsKey(key)){

                    ll.remove(ll.indexOf(map.get(key)));
                    map.put(key,node);
                }
                else{
                    cacheNode noderem = ll.removeLast();
                    map.remove(noderem.key);
                }

            }
            ll.offerFirst(node);
            map.put(key,node);
        }
    }

    public static void main(String[] args){
        LRUCache cacheStore = new LRUCache(2);
        System.out.println(cacheStore.get(2));
        cacheStore.put(2,6);
        System.out.println(cacheStore.get(1));
        cacheStore.put(1,5);
        cacheStore.put(1,2);
        System.out.println(cacheStore.get(1));
        System.out.println(cacheStore.get(2));

    }
}
