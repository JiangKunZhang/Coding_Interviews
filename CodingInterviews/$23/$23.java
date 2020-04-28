package $23;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/27 23:51
 *
 * 链表中环的入口结点
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class $23 {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast = pHead;
        ListNode slow = pHead;
        //先找到环
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast ==slow) {
                break;
            }
        }
        //判断循环结束的条件
        if (fast == null || fast.next == null) {
            return null;
        }
        //slow从头走，两个相遇就是环的入口节点
        slow = pHead;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
