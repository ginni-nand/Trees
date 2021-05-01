package treequestions;

public class leftview {
	int max;
public  void lv(node root,int l)
{
	if(root==null)
		return;
	if(l>=max)
	{
		System.out.print(root.data);
		max++;
	}
	lv(root.left,l+1);
	lv(root.right,l+1);
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
		leftview l=new leftview();
		l.lv(root,0);
	}

}
