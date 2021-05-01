package treequestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class revlevelwithoutwithoutrecursion {
public static void revl(node root)
{
	System.out.println("hey");
	if(root==null)
		return ;
	Queue<node> q=new LinkedList<node>();
    Stack<node> s=new Stack<>();
    q.add(root);
    while(q.size()>0)
    {
    	node t=q.remove();
    	//System.out.print(t.data+" ");
    	s.push(t);
    	if(t.left!=null)
    		q.add(root.left);
    	if(t.right!=null)
    		q.add(root.right);
    	s.push(t);
    }
    System.out.println("rev me ");
    while(s.size()>0)
    {
    	System.out.print(s.pop().data+" ");
    }
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		node ro=new node(2);
		ro.left=new node(7);
		ro.right=new node(5);
		ro.left.left=new node(2);
		ro.left.right=new node(6);
		ro.left.right.left=new node(5);
		ro.left.right.right=new node(11);
		ro.right.right=new node(9);
		ro.right.right.left=new node(4);
		revl(ro);
	}

}
