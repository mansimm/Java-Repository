public class StringToAscii
{
	public static void main(String argc[])
	{
		// First method
		String s1 = "ABCDEFG";
		System.out.println("  	First method :");
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(" Ascii of "+s1.charAt(i)+" :"+(int)s1.charAt(i));
		}
		// Second method
		System.out.println(" 	Second  method :");
		byte barr[] = s1.getBytes();
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(" Ascii of "+s1.charAt(i)+" :"+barr[i]);
		}
	}

}

/*
	Output-

(base) mansi@mansi-Vostro-15-3568:~$ javac StringToAscii.java
(base) mansi@mansi-Vostro-15-3568:~$ java StringToAscii
  	First method :
 Ascii of A :65
 Ascii of B :66
 Ascii of C :67
 Ascii of D :68
 Ascii of E :69
 Ascii of F :70
 Ascii of G :71
 	Second  method :
 Ascii of A :65
 Ascii of B :66
 Ascii of C :67
 Ascii of D :68
 Ascii of E :69
 Ascii of F :70
 Ascii of G :71
(base) mansi@mansi-Vostro-15-3568:~$ 


*/
