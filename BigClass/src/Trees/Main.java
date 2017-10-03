package Trees;

import java.util.ArrayList;
public class Main {
    
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	   ArrayList<Integer> A= new ArrayList<Integer>();
	   ArrayList<Integer> B= new ArrayList<Integer>();
	   A.add(1);A.add(2);A.add(2);
	   B.add(1);B.add(2);B.add(2);
	   ArrayList<Integer> C = TreeMap_BST.N_max_pair_combinations.class.newInstance().solve(A, B);
	   for(int i=0;i<C.size();i++){
		   System.out.print(C.get(i));
	   }
	}
}
