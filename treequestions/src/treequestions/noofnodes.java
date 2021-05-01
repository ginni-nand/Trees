package treequestions;

public class noofnodes {
public static int nodes(node root)
{
	if(root==null)
		return 0;
	return 1+nodes(root.left)+nodes(root.right);
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
		int n=nodes(root);
		System.out.println(n);
	}

}
