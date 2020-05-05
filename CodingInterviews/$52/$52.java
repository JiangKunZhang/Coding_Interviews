package $52;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/28 12:29
 *
 * 52.两个链表的第一个公共结点
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class $52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        //先定义两个节点，假设pL为长的，pS为短的
        ListNode pL = pHead1;
        ListNode pS = pHead2;
        int lenA = 0;
        int lenB = 0;
        ListNode cur = pL;//cur用来保存每个头节点
        //计算pL长度
        while (cur != null) {
            lenA++;
            cur = cur.next;
        }
        cur = pS;//cur用来保存每个头节点
        //计算pL长度
        while (cur != null) {
            lenB++;
            cur = cur.next;
        }
        //判断之前假设的长短是否正确，不正确就进行调换
        int len = lenA - lenB;//计算长的长多少
        if (len < 0) {
            len = lenB - lenA;//计算长的长多少
            pL = pHead2;
            pS = pHead1;
        }
        //让长的链表先往后走，走到一样长
        while (len != 0) {
            pL = pL.next;
            len--;
        }
        //此时在同一起跑线，一起往后走
        while (pL != pS && pL != null && pS != null) {
            pL = pL.next;
            pS = pS.next;
        }
        //判断上一个循环结束是因为什么，如果两个都不为空，就是说明两个相等，返回;
        if (pL != null && pS != null) {
            return pL;
        }
        //否则就是两个链表不相交
        return null;
    }
}
