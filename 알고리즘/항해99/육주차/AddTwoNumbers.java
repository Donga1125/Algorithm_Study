package 알고리즘.항해99.육주차;

public class AddTwoNumbers {

    public static void main(String[] args) {

    }



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0);
        ListNode result = node;
        int sum = 0;

        while (l1 != null || l2 != null || sum > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            node.next = new ListNode(sum % 10);
            sum /= 10;

            node = node.next;
        }

        return result.next;
    }

    }


    }
