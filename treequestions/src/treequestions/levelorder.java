package treequestions;

public class levelorder {
public static void level(node root)
{
	if(root==null)
		return;
     int h=getheight.height(root);
     for(int i=0;i<=h;i++)
     {
    	 printatgivenlevel.printat(root,i+1);
    	 System.out.println();
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
		level(root);
	}

}
