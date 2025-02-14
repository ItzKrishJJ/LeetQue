/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
         for(ListNode list : lists)
         {
            ListNode temp = list;
            while(temp!=null)
            {
                minHeap.add(temp.val);
                temp = temp.next;
            }
         }
         ListNode newList = new ListNode(-1);
         ListNode temp = newList;
         while(!minHeap.isEmpty())
         {
            ListNode newnode = new ListNode();


            temp.next = new ListNode(minHeap.poll());
            temp  =temp.next;

         }
         return newList.next;
    }
}