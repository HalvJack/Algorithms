package org.example.MergeTwoSortedList21;

public class Main {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        while(list1.next!=null && list2.next!=null){
            if(list1.next == null){
                mergedList.val = list2.val;
                mergedList.next = list2.next;
                list2 = list2.next;
            }
            else if(list2.next == null){
                mergedList.val = list1.val;
                mergedList.next = list1.next;
                list1 = list1.next;
            } else{
               if(list1.val> list2.val)
               {
                   mergedList.val = list1.val;
                   mergedList.next = list1.next;
               }
               else if(list2.val> list1.val){
                   mergedList.val = list2.val;
                   mergedList.next = list2.next;
               }
            }

        }
     return mergedList;
    }

}
