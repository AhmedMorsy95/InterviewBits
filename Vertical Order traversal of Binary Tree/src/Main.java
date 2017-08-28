
import java.util.ArrayList;
public class Main {
    
	public static void main(String[] args) {
        TreeNode a = new TreeNode(9799);
        
//        a.left=new TreeNode(8760);
//        a.left.left= new TreeNode(9026);
//        a.left.left.right=new TreeNode(6543);
//        a.left.right = new TreeNode(10);
        ArrayList<ArrayList<Integer> > ret = new Solution().verticalOrderTraversal(a);
        for(int i=0;i<ret.size();i++){
        	for(int j=0;j<ret.get(i).size();j++){
        		System.out.print(ret.get(i).get(j));
        	}
        	System.out.print("\n");
        }
	}

}
