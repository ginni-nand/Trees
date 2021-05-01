package treequestions;

import java.util.LinkedList;
import java.util.Queue;

public class levelorderusingqueue {
	public static void lev(node root)
	{
		if(root==null)
			return;
		Queue<node> q=new LinkedList<node>();
		q.add(root);
		while(q.size()>0)
		{
			node curr=q.remove();
			System.out.print(curr.data+" ");
			if(root.left!=null)
				q.add(root.left);
			if(root.right!=null)
				q.add(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node root=new node(2);
		root.left=new node(7);
		root.right=new node(5);
		root.left.left=new node(2);
		root.left.right=new node(6);
		root.left.right.left=new node(5);
		root.left.right.right=new node(11);
		root.right.right=new node(9);
		root.right.right.left=new node(4);
		lev(root);
	}

}
