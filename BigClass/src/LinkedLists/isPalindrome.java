package LinkedLists;

import java.util.ArrayList;

public class isPalindrome {
	 public int lPalin(ListNode A) {
	     ArrayList<Integer>a = new ArrayList<Integer>();
		 while(A!=null){
	    	 a.add(A.val);
	    	 A=A.next;
	     }
		 int sz=a.size();
		 for(int i=0;i<sz/2;i++){
			 if(a.get(i).equals(a.get(sz-i-1)))continue;
			 return 0;	 
		 }
		 return 1;
	 }
}
