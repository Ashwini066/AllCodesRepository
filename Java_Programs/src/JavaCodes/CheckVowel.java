package JavaCodes;
import java.util.*;
class CheckVowel
	{
		public static void main (String args[])
			{
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the alphabet :");
				char c= sc.next().charAt(0);
				switch(c)
				{
					case 'a':
						System.out.println("Its a vowel");
						break;
					case 'e':
						System.out.println("Its a vowel");
						break;
					case 'i':
						System.out.println("Its a vowel");
						break;
					case 'o':
						System.out.println("Its a vowel");
						break;
					case 'u':
						System.out.println("Its a vowel");
						break;
					default:
						System.out.println("Not a vowel");
				}
			}
	}			
