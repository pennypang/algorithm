public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l2==null)
            return l1;
        else if(l1==null)
            return l2;
        ListNode p=new ListNode(-1);
        ListNode result=p;
        int carry=0;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
                int digit=l1.val+l2.val+carry;
                carry=(digit/10);
                p.next=new ListNode(digit%10);
                p=p.next;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1!=null && l2==null){
                int digit=l1.val+carry;
                carry=(digit/10);
                p.next=new ListNode(digit%10);
                p=p.next;
                l1=l1.next;
            }
            else{
                int digit=l2.val+carry;
                carry=(digit/10);
                p.next=new ListNode(digit%10);
                p=p.next;
                l2=l2.next;
            }
        }
        if(carry!=0){
            p.next=new ListNode(carry);
        }
        return result.next;
    }
