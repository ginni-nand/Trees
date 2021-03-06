package treequestions;
class node {
	int data;
	node left;
	node right;
	node(int d){
		data=d;
		left=null;
		right=null;
		
	}
}
public class Binarytreecreation {
	public static void inorder(node root)
	{//inorder
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	public static void preorder(node root)
	{//inorder
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		
		preorder(root.right);
		
	}
	public static void postorder(node root)
	{//inorder
		if(root==null)
			return;
		
		postorder(root.left);
		
		postorder(root.right);
		System.out.print(root.data+" ");
		
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
		
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);

	}

}
