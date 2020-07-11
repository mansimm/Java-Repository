//String operations
import java.util.*;

public class StringOperations
{
	public StringOperations()
	{

	}
	public static void CharAtEx(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}
	public static void Length(String s)
	{
		System.out.println(" Length : "+s.length());
	}
	public static void CompareTo(String s1,String s2)
	{
		System.out.println(" Comparision of "+s1+" with "+s2+" : "+s1.compareTo(s2));
		//compare s1 with s2
		//if s1 > s2, it returns positive number  
    		//if s1 < s2, it returns negative number  
    		//if s1 == s2, it returns 0  

	}
	public static void Concat(String s1,String s2)
	{
		System.out.println(" Concatanation of "+s1+" with "+s2+" : "+s1.concat(s2));
	}	
	public static void Contains(String s1,String s2)
	{
		if(s1.contains(s2))
		{
			System.out.println(" "+s1+" contains "+s2+"  ");
		}
		else
		{
			System.out.println(" "+s1+" does not contains "+s2+"  ");
		}

	}
	public static void EndWith(String s1,String s2)
	{
		if(s1.endsWith(s2))
		{
			System.out.println(" "+s1+" ends with "+s2+"  ");
		}
		else
		{
			System.out.println(" "+s1+" does not ends with "+s2+"  ");
		}

	}
	public static void Equals(String s1,String s2)
	{
		if(s1.equals(s2))
		{
			System.out.println(" "+s1+" is equals to "+s2+"  ");
		}
		else
		{
			System.out.println(" "+s1+" is not equals to "+s2+"  ");
		}

	}
	public static void EqualsIgnoreCase(String s1,String s2)
	{
		//compare by ignoring case
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println(" "+s1+" is equals to "+s2+"  ");
		}
		else
		{
			System.out.println(" "+s1+" is not equals to "+s2+"  ");
		}

	}
	public static void Format()
	{
		String name="sonoo";  
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f",32.33434);  
		String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  

		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3);  
	}
	public static void GetBytes()
	{
		System.out.println("	Bytes conversion of ABCDEFG is :");
		String a = "ABCDEFG";	
		byte barr[] = a.getBytes();
		for(int i=0;i<barr.length;i++)
		{
			System.out.println(barr[i]);
		}
		String b = new String(barr);
		System.out.println("	Conversion of above bytes again in string : "+b);
	}
	public static void GetChars()
	{
		// public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)  
		String str = new String("hello jacky how r u");  
	        char[] ch = new char[10];  
	        try{  
			 str.getChars(6, 11, ch, 0);  
			 System.out.println("Actual String -hello jacky how r u, and its getchar(6, 11, ch, 0) is :"+ch);  
	        }catch(Exception ex){System.out.println(ex);}  
	}	
	public static void IndexOf()
	{  
  
		    String s1 = "This is indexOf method";         
		    // Passing Substring    
		    int index = s1.indexOf("method"); //Returns the index of this substring  
		    System.out.println("index of substring "+index);                
        }  

	public static void main(String args[])
	{
		String s1= "Fisherman";
		String s2= "Fisherman";
		String s3= "man";
		String s4= "ant";
		
		int choise=0;

		while(choise != 20)
		{
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("	1.charAt");
			System.out.println("	2.Length");
			System.out.println("	3.CompareTo");
			System.out.println("	4.Concate");
			System.out.println("	5.Contains");
			System.out.println("	6.Ends with");
			System.out.println("	7.Equals");
			System.out.println("	8.Equals Ignore Case");
			System.out.println("	9.Format");
			System.out.println("	10.Get Bytes");
			System.out.println("	11.Get chars");
			System.out.println("	12.Index OF");
			System.out.println("	20.Exit");
			System.out.println("	Enter your choice :");
			Scanner sc = new Scanner(System.in);
			choise = sc.nextInt();

			switch(choise)
			{
				case 1: CharAtEx(s1);
					break;

				case 2: Length(s1);
					break;

				case 3: CompareTo(s1,s2);
					break;

				case 4: Concat(s1,s4);
					break;

				case 5: Contains(s1,s3);
					Contains(s1,s4);
					break;

				case 6: EndWith(s1,s4);
					break;

				case 7: Equals(s1,s4);
					Equals(s1,s2);
					break;

				case 8: EqualsIgnoreCase(s1,s4);
					EqualsIgnoreCase(s1,s2);
					break;

				case 9: Format();
					break;

				case 10: GetBytes();
					break;

				case 11: GetChars();
					break;

				case 12: IndexOf();
					break;

				case 20: System.out.println(" Thank you!");
					 break;

				default:System.out.println("Invalide choise !");


			}
		}
	}
}
