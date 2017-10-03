package LinkedLists;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
	    ListNode ret=null,head=null;
	    while(a!=null&&b!=null){
	        int v;
	        if(a.val<=b.val){
	            v=a.val;
	            a=a.next;
	        }
	        else{
	            v=b.val;
	            b=b.next;
	        }
	       if(ret==null){
	                ret=new ListNode(v);
	                head=ret;
	            }
	      else{
	               ret.next=new ListNode(v);
	               ret=ret.next;
	        }
	    }
	    while(a!=null){
	        if(ret==null){
	                ret=new ListNode(a.val);
	                head=ret;
	            }
	      else{
	               ret.next=new ListNode(a.val);
	               ret=ret.next;
	        }
	       a=a.next; 
	    }
	    
	    while(b!=null){
	        if(ret==null){
	                ret=new ListNode(b.val);
	                head=ret;
	            }
	      else{
	               ret.next=new ListNode(b.val);
	               ret=ret.next;
	        }
	       b=b.next; 
	    }
	    
	return head;
	}
}
