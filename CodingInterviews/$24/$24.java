package $24;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/28 12:07
 *
 * 24.反转链表
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class $24 {
    public ListNode ReverseList(ListNode head) {
        ListNode prev = null;//定义前驱
        ListNode cur = head;//定义要反转的节点
        ListNode newHead = null;//定义反转后新的头节点
        while (cur != null) {
            //当cur不为空的时候才定义curNext，否则空指针异常
            ListNode curNext = cur.next;
            //当cur.next == null的时候就说明是最后一个节点了，记得保存新的头节点
            if (cur.next == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur =curNext;
        }
        return newHead;
    }
}
