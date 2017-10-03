package LinkedLists;

public class rotate {
	public ListNode rotateRight(ListNode a, int b) {
	    ListNode head=null;
		int counter=0;
		ListNode tempo=a;
		while(tempo!=null){
			counter++;
			tempo=tempo.next;
		}
		b=b%counter;
		if(b==0)return a;
		tempo=a;
		for(int i=0;i<counter-b;i++){
			tempo=tempo.next;
		}
		ListNode k=new ListNode(tempo.val);
		tempo=tempo.next;
		head=k;
		while(tempo!=null){
			k.next= new ListNode(tempo.val);
			tempo=tempo.next;
			k=k.next;
		}
		k.next=a;
		tempo=a;
		for(int i=0;i<counter-b-1;i++){
			tempo=tempo.next;
		}
	   if(tempo!=null)	
		tempo.next=null;
		return head;
	}
}
