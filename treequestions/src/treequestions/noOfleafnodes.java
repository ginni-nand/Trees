package treequestions;

public class noOfleafnodes {
public static int leaf(node root)
{
	if(root==null)
		return 0;
	if(root.left==null && root.right==null)
		return 1;
	return leaf(root.left)+leaf(root.right);
	
}
	public static void main(String[] args) {
		node root=new node(2);
		root.left=new node(7);
		root.right=new node(5);
		root.left.left=new node(2);
		root.left.right=new node(6);
		root.left.right.left=new node(5);
		root.left.right.right=new node(11);
		root.right.right=new node(9);
		root.right.right.left=new node(4);
		int n=leaf(root);
		System.out.println(n);
	}

}
