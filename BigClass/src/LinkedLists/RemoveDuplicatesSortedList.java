package LinkedLists;

public class RemoveDuplicatesSortedList {
	public ListNode deleteDuplicates(ListNode a) {
	  ListNode A,head=null;
	  if(a==null)return null;
	  else{
		  A=null;
		  boolean empty=true;
		  while(a!=null){
			  int last=a.val,cnt=0;
			    while(a.val==last){
			    	cnt++;
			    	a=a.next;
			    	if(a==null)
			    		break;
			    }
			    if(cnt==1){
			    	if(empty){
			    		A=new ListNode(last);
			    		head=A;
			    		empty=false;
			    	}
			    	else{
			    		A.next= new ListNode(last);
			    		A=A.next;
			    	}
			    }
		  }
	  }
	  return head;
	}
}
