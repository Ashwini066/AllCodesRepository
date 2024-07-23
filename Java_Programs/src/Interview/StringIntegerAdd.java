package Interview;

import java.util.ArrayList;
import java.util.List;

public class StringIntegerAdd {

	public static void main(String[] args) {
		String s="Hello123Madam";
		int len=s.length();
		char  newString;
		int sum=0;
		int temp=0;
		int i=0;
		List l= new ArrayList();
		for( i=0;i<len;i++)
		{
			newString=s.charAt(i);
			if(Character.isDigit(newString))
			{
			l.add(newString);
			}
		}
 for(int j=0;j<=l.size();j++)
 {
	 sum+=j;
 }
	System.out.println(sum);	
	}
}