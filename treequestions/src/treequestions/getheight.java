package treequestions;

public class getheight {
public static int height(node root)
{
	if(root==null)
		return -1;
	return max(height(root.left),height(root.right))+1;
}
public static int max(int a,int b)
{
	return a>b?a:b;
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
		int h=height(root);
		System.out.println("heigjht of tree is:"+h);
	}

}
