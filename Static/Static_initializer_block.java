/*
	Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created.
The initialization of the instance variable can be done directly but there can be performed extra operations while initializing the instance variable in the instance initializer block.
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Static_initializer_block 
{

	static int B,H;
	static Boolean flag;
	//Write your code here
	static{
	    Scanner sc = new Scanner(System.in);
	    B = sc.nextInt();sc.nextLine();
	    H = sc.nextInt();
	    if(B<=0 || H<=0)
	    {
		flag = false;
		System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	    else
	    {
		flag = true;
	    }

	}

	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main

}//end of class


/*

Output =

(base) mansi@mansi-Vostro-15-3568:~$ javac Static_initializer_block.java
(base) mansi@mansi-Vostro-15-3568:~$ java Static_initializer_block
3
6
18(base) mansi@mansi-Vostro-15-3568:~$ java Static_initializer_block
-10
22
java.lang.Exception: Breadth and height must be positive
(base) mansi@mansi-Vostro-15-3568:~$ 


*/
