package treequestions;

public class revlevelorder {

	public static void rev(node root)
	{
		if(root==null)
			return;
		for(int i=getheight.height(root);i>=0;i--)
		{
			printatgivenlevel.printat(root,i+1);
			System.out.println();
		}
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
		rev(root);

	}

}
