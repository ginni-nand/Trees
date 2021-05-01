package treequestions;

public class diffofoddandeven {
	public static int dif(node root)
	{
		if(root==null)
			return 0;
		return root.data-dif(root.left)-dif(root.right);
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
		int diff=dif(root);
		System.out.println("diff between odd and even is:"+diff);

	}

}
