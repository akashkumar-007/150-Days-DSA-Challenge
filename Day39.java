/* 
LeetCode 206 Reverse Linked List

class Solution {
    public ListNode reverseList(ListNode head) {

    //Approach 1
    //     ArrayList<Integer> arr = new ArrayList<>();

    //     ListNode temp = head;

    //     while(temp!=null){
    //         arr.add(temp.val);
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     for(int i = arr.size()-1 ; i>=0 ; i--){
    //         temp.val = arr.get(i);
    //         temp = temp.next;
    //     }
    //     return head;

     // Approach 2

       if(head == null || head.next == null){
           return head;
       }

       ListNode last = reverseList(head.next);

       head.next.next = head;
       head.next = null;

        return last;
     }
}
*/