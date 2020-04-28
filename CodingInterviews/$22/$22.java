package $22;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/27 23:48
 *
 * 链表中倒数第k个结点
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class $22 {
    public ListNode FindKthToTail(ListNode head,int k) {
        //如果头节点为空就直接return
        if (head == null) {
            return null;
        }
        //定义快慢节点
        ListNode fast = head;
        ListNode slow = head;
        //快的走n-1步
        while (k-1 != 0) {
            //还没走n-1步呢，就是空，那就是不存在
            if (fast.next != null) {
                //fast先走k-1步
                fast = fast.next;
                k--;
            }else {
                return  null;//这个节点不存在
            }
        }
        //此时fast和slow一起走，fast.next == null的时候，slow就是倒数第k个节点
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}