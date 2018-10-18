
import java.util.*;

/**
 * @author srikarrampally
 *
 */



public class FamilyTree{

	HashMap<Integer, ArrayList<String>> items;
	//default constructor
	FamilyTree()
	{
		items = new HashMap<Integer, ArrayList<String>>();
		
	}
	// parameterized constructor
	FamilyTree(HashMap<Integer, ArrayList<String>> items)
	{
		this.items=items;
	}	
	
	public static void main(String[] args) {
		
		
		FamilyTree family = new FamilyTree();
		FamilyTree family1= new FamilyTree(null);
		Scanner scan = new Scanner(System.in);
		
		family.computes();
		
		
		
	}
	
		public void computes()
		{
			boolean flag= true;
			while(flag)
			{
				System.out.println("choose an option:");
				System.out.println("1: post the Tree");
				System.out.println("2: get the Tree");
				System.out.println("3: update the value in a level");
				System.out.println("4: delete a value in a level");
				System.out.println("5: exit");
				Scanner scan = new Scanner(System.in);
				int num= scan.nextInt();
				switch(num)
				{
				case 1:
					System.out.print("enter the level in which you wish to add:");
					int n= scan.nextInt();
//					System.out.println(n);
					items.put(n, posts());
//					get(items);
					break;
				case 2:
					get();
					break;
				case 3:
					System.out.print("enter the level in which you wish to add or update a name:");
					int level= scan.nextInt();
//					System.out.println(level);
//					System.out.println(items.get(level));
					update(level);
					break;
				case 4:
					System.out.print("enter the level in which you wish to delete:");
					int l= scan.nextInt();
					System.out.println(l);
					delete(l);
					get();
					break;
				case 5:
					System.out.println("Exiting....");
					flag=false;
					break;
				default:
					System.out.println("invalid option");
					flag= true;
					
				}
			
			
			}
		}
	//Delete Function
		public void delete(int level)
		{
			
			ArrayList<String> temp = new ArrayList<String>();
			System.out.println("values in the list:"+items.get(level));
			temp =  items.get(level);
			System.out.println("enter the value which you wish to delete:");
			Scanner scan = new Scanner(System.in);
			String oldValue= scan.next();
			int i =temp.indexOf(oldValue);
			temp.remove(i);
			System.out.println(temp);
			items.replace(level, temp, temp);
		}
		
		// UPDATE Function
		public void update(int level)
		{
			ArrayList<String> temp = new ArrayList<String>();
			System.out.println("values in the list:"+items.get(level));
			temp =  items.get(level);
			System.out.println("enter the value which you wish to update:");
			Scanner scan = new Scanner(System.in);
			String oldValue= scan.next();
			int i =temp.indexOf(oldValue);
			if(i!=-1)
			{
				temp.remove(i);
				System.out.print("enter the updated value :");
//				Scanner scan = new Scanner(System.in);
				String newValue= scan.next();
				System.out.println(newValue);
				temp.add(newValue);
				
			}
			else
			{
				temp.add(oldValue);
			}
			
			items.replace(level, temp, temp);
			System.out.println(items.get(level));
			
			
		}
		
		// get function
		public void get()  
	    { 
	        if (items.isEmpty())  
	        { 
	            System.out.println("No items in the Tree"); 
	        } 
	          
	        else
	        { 
	            System.out.println(items); 
	        } 
		}
		
		//post function
		public ArrayList<String> posts()
		{
			ArrayList<String> list = new ArrayList<String>();
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the number of names you wish to add:");
			int number = scan.nextInt();
			for(int i=0; i<number;i++)
			{
				String s = scan.next();
				list.add(s);
			}
			return list;
			
			
		}
		
	

	

}

