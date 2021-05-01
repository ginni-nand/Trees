package treequestions;

public class printatgivenlevel {
   public static void printat(node root,int l)
   {
	   if(root==null)
	   {
		   return;
	   }
	   if(l==1)
	   {
		 System.out.print(root.data+" ");  
		 return;
	   }
	   printat(root.left,l-1);
	   printat(root.right,l-1);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub//complexity:O(n)
		node root=new node(2);
		root.left=new node(7);
		root.right=new node(5);
		root.left.left=new node(2);
		root.left.right=new node(6);
		root.left.right.left=new node(5);
		root.left.right.right=new node(11);
		root.right.right=new node(9);
		root.right.right.left=new node(4);
		printat(root,3);
	}

}
