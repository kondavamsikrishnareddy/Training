import java.util.*;
		public class EmailValidation {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				System.out.println("Enter the email to search: ");
				Scanner scan = new Scanner(System.in);
				String name = scan.next(); 
				
				ArrayList <String> list = new ArrayList<String>();
				list.add("saikumar@gmail.com");
			    list.add("rajyalakshmi@gmail.com");
			    list.add("raghava@domain.com");
			    list.add("vamsireddy@domain.com");
			    list.add("venky@gmail.com");
			    
			    System.out.println("Search Results: ");
			    for (String element : list) {
			       if (element.contains(name)) {
			             System.out.println(element + " " + "is present in the array!");
			              }  
			        }
			    scan.close();
			     }
			}