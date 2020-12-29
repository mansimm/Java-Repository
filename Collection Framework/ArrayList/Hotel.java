import java.util.List;
import java.util.ArrayList;

class Hotel
{

	public static void main(String args[])
	{
		List<String> menu = new ArrayList<String>();

		menu.add("Pizza");
		menu.add("Burger");	
		menu.add("Nudels");	
		menu.add("Pasta");

		System.out.println(menu);

		menu.add(1,"Ice Creem");
		System.out.println(menu);
	
		menu.set(4,"White sauce pasta");
		System.out.println(menu);

		menu.remove(4);
		System.out.println(menu);

		
		System.out.println(menu.contains("Butterscotch Ice Creem"));
		System.out.println(menu.contains("Ice Creem"));

		System.out.println("Index of Ice Creem is : "+menu.indexOf("Ice Creem"));

		System.out.println("\n Size of the list : "+menu.size());

		for(int i=0;i<menu.size();i++)
		{
			System.out.println(menu.get(i));
		}

		System.out.println("\n After deleting third element....");
		menu.remove(3);
		System.out.println(menu);

		System.out.println("\n Check if empty : "+menu.isEmpty());

		List<String> newmenu = new ArrayList<String>();

		newmenu.add("Paneer Tikka");
		newmenu.add("Paratha");	
		
		menu.addAll(newmenu);
		System.out.println(menu);

		menu.removeAll(newmenu);
		System.out.println(menu);

		menu.clear();

		System.out.println("\n Check if empty : "+menu.isEmpty());

		
	}

}
/*
[Pizza, Burger, Nudels, Pasta]
[Pizza, Ice Creem, Burger, Nudels, Pasta]
[Pizza, Ice Creem, Burger, Nudels, White sauce pasta]
[Pizza, Ice Creem, Burger, Nudels]
false
true
Index of Ice Creem is : 1

 Size of the list : 4
Pizza
Ice Creem
Burger
Nudels

 After deleting third element....
[Pizza, Ice Creem, Burger]

 Check if empty : false
[Pizza, Ice Creem, Burger, Paneer Tikka, Paratha]
[Pizza, Ice Creem, Burger]

 Check if empty : true

*/
