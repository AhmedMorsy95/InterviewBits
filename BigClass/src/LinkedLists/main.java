package LinkedLists;

public class main {
    public static void main(String[] args) {
		ListNode a = new ListNode(418);
		a.next=new ListNode(419);
		a.next.next=new ListNode(420);
		try {
			ListNode A=rotate.class.newInstance().rotateRight(a,2);
			 while(A!=null){
				 System.out.print(A.val);
				 A=A.next;
			 }
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
