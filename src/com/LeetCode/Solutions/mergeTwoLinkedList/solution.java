package com.LeetCode.Solutions.mergeTwoLinkedList;

public class solution {

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            var pointerOne = list1;
            var pointerTwo = list2;
            ListNode newHead, prev;
            if(pointerOne==null && pointerTwo==null)
                return null;
            else if(pointerOne==null && pointerTwo!=null)
                return pointerTwo;
            else if(pointerTwo==null && pointerOne!=null)
                return pointerOne;
            else{
                if(pointerOne.val <= pointerTwo.val){
                    newHead = new ListNode(pointerOne.val);
                    pointerOne = pointerOne.next;
                }
                else{
                     newHead = new ListNode(pointerTwo.val);
                    pointerTwo = pointerTwo.next;
                }
                prev = newHead;
            }
            while(pointerOne != null || pointerTwo != null){
                ListNode tempNode=null;
                if(pointerOne==null && pointerTwo!=null){
                    tempNode = new ListNode(pointerTwo.val);
                    pointerTwo = pointerTwo.next;
                }
                else if(pointerTwo==null && pointerOne!=null){
                    tempNode = new ListNode(pointerOne.val);
                    pointerOne = pointerOne.next;
                }
                else if(pointerOne.val <= pointerTwo.val){
                    tempNode = new ListNode(pointerOne.val);
                    pointerOne = pointerOne.next;

                }
                else if(pointerTwo.val <= pointerOne.val){
                    tempNode = new ListNode(pointerTwo.val);
                    pointerTwo = pointerTwo.next;
                }
                prev.next = tempNode;
                prev = tempNode;
            }
            return newHead;
        }

        /** Recursive Call*/
        public static ListNode Recursive_mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1 == null){
                return list2;
            }
            if(list2==null){
                return list1;
            }
            if(list1.val<list2.val){
                list1.next = Recursive_mergeTwoLists(list1.next , list2);
                return list1;
            }
            else{
                list2.next = Recursive_mergeTwoLists(list2.next , list1);
            }
            return list2;
        }

        public static void main(String[] args){
        ListNode node1 = new ListNode(5,null);
        ListNode node2 = new ListNode(4,node1);
        ListNode node3 = new ListNode(2,node2);
        ListNode node4 = new ListNode(1,node3);

        ListNode node11 = new ListNode(4,null);
        ListNode node12 = new ListNode(3,node11);
        ListNode node13 = new ListNode(2,node12);
        ListNode node14 = new ListNode(1,node13);

            Recursive_mergeTwoLists(node4,node14);
    }
}
