package treequestions;

public class sumofall {
	public static int sumofallnodes(node root)
	{
		if(root==null)
			return 0;
		return root.data+sumofallnodes(root.left)+sumofallnodes(root.right);
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
		int ans=sumofallnodes(root);
		System.out.println(ans);
	}

}
