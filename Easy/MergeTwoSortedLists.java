package Easy;

class ListNode{
    int val;
    ListNode next;
    ListNode()
    {
        
    }
    ListNode(int x) 
    {
    val = x;
    next = null;
    }
}


public class MergeTwoSortedLists 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null)
        {
            return list1 == null ? list2 : list1;
        }
        ListNode head = new ListNode();
        if(list1.val < list2.val)
        {
            head = list1;
            head.next = mergeTwoLists(list1.next , list2);
        }

        else
        {
            head = list2;
            head.next = mergeTwoLists(list1, list2.next);
        }

        return head;
    }
}
