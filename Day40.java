/* 
Leetcode 21. Merge Two Sorted Lists
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp1 = list1;
        ListNode temp2 = list2;
      
        while(temp1 != null){
            arr.add(temp1.val);
            temp1 = temp1.next;
        }

        while(temp2 != null){
            arr.add(temp2.val);
            temp2 = temp2.next;
        }

        if(arr.size() == 0){
            return null;
        }

            Collections.sort(arr);

            ListNode head = new ListNode(arr.get(0));
            ListNode mover = head;
            for(int i = 1 ; i<arr.size() ; i++){
              
              ListNode newNode = new ListNode(arr.get(i));
              mover.next = newNode;

              mover = mover.next;

             }
        

        
        return head;
    }
}
*/