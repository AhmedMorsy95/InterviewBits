package LinkedLists;

public class removeNthFromEnd {
	public ListNode removeNthFromEnd(ListNode a, int b) {
	   	if(a==null)return null;
		int counter=0;
		ListNode tempo=a;
		while(tempo!=null){
			counter++;
			tempo=tempo.next;
		}
		b=counter-b;
		tempo=null;
		ListNode head=null;
		counter=0;
		while(counter++<b){
			if(tempo==null){
				tempo=new ListNode(a.val);
				head=tempo;
			}
			else{
				tempo.next=new ListNode(a.val);
				tempo=tempo.next;
			}
			a=a.next;
		}
		a=a.next;
		while(a!=null){
			if(tempo==null){
				tempo=new ListNode(a.val);
				head=tempo;
			}
			else{
				tempo.next=new ListNode(a.val);
				tempo=tempo.next;
			}
			a=a.next;
		}
		return head;
	}
}
