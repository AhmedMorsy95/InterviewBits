package TreeMap_BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

import javafx.util.Pair;
public class N_max_pair_combinations {
	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		Collections.sort(A);
		Collections.sort(B);
		Collections.reverse(A);
		Collections.reverse(B);
	    
		PriorityQueue<Pair<Integer, Pair<Integer,Integer> > >q = new PriorityQueue<Pair<Integer,Pair<Integer,Integer>>>();
	    ArrayList<Integer>ret=new ArrayList<Integer>();
	    int n=(int)(A.size());
	    Pair<Integer,Integer>idx = new Pair<Integer, Integer>(n-1, n-1);
	    q.add(new Pair<Integer, Pair<Integer,Integer> >(A.get(n-1)+B.get(n-1),idx));
        for(int i=0;i<n;i++){
        	
        }
		return ret;
    }
}
