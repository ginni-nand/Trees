package treequestions;
import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Map<Character,Integer>h=new HashMap<>();
  String str="This is a Hello world";
  
  for(int i=0;i<str.length();i++)
  {
	  h.put(str.charAt(i), h.getOrDefault(str.charAt(i), 0)+1);
  }
	}*/
		String s="hello";
		String s1=new String("hello");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		s=s.concat("world");
		
		System.out.println(s);
		int arr[]={1,5,2,4,3,2,5,6,6};
		PriorityQueue<Integer> min=new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			min.add(arr[i]);
		}
		System.out.println(min);
		for(int i=0;i<arr.length-2;i++)
		min.remove();
		System.out.println(min.peek());
		
		
		
		

}
}
/*
 * WAP to get the count of each charater in given string
String str = "This is a Hello world"
Output-
T - 1
H - 2
I - 2 and so on

 */
