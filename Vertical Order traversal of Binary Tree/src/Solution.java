
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Queue;
public class Solution {
    ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	Map<Integer,ArrayList<Integer>> map = new TreeMap<Integer,ArrayList<Integer>>();
	void bfs(TreeNode A,Integer dep){
		Queue<TreeNode>q = new LinkedList<TreeNode>();
		Queue<Integer>z = new LinkedList<Integer>();
		q.add(A);
		z.add(0);
		while(q.size()>0){
			A = q.peek();//System.out.print(A.val+ "  "+ z.peek()+"\n");
			dep=z.peek();
			if(map.containsKey(dep))
				map.get(dep).add(A.val);
			else{
				map.put(dep, new ArrayList<Integer>());
				map.get(dep).add(A.val);
			}
			if(A.left!=null){
				q.add(A.left);
				z.add(z.peek()-1);
			}
			if(A.right!=null){
				q.add(A.right);
				z.add(z.peek()+1);
			}
			q.remove();
			z.remove();
		}
	}
	public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
		ArrayList<ArrayList<Integer>> cur = new ArrayList<ArrayList<Integer>>();
		if(A==null)return cur;
		bfs(A,0);
		for(Entry<Integer, ArrayList<Integer>> entry:map.entrySet()){
			ret.add(entry.getValue());	
		}
    	return ret;
    }

}
	