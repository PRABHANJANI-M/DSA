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
        PriorityQueue<Integer> minHeap =new PriorityQueue<>();
        int i;
        for(i=0;i<lists.length;i++)
        {
            while(lists[i]!=null)
            {
              minHeap.add(lists[i].val);
              lists[i]=lists[i].next;
            }
        }
        ListNode tempList = new ListNode();
        ListNode returnList=tempList;
        while(!minHeap.isEmpty())
        {
            tempList.next=new ListNode(minHeap.poll());
            tempList=tempList.next;
        }
        return returnList.next;
    }
}