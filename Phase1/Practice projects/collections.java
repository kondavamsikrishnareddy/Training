import java.util.*;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		         //creating arraylist
				System.out.println("ArrayList");
				ArrayList<String> city=new ArrayList<String>();   
			      city.add("guntur");//
			      city.add("Macharla");    	   
			      System.out.println(city); 

			      //creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vec = new Vector();
			      vec.addElement(60); 
			      vec.addElement(70); 
			      System.out.println(vec);

			      //creating linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("Mahendar");  
			      names.add("Govind");  	      
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  

			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(132);  
			       set.add(150);  
			       set.add(260);
			       set.add(530);
			       System.out.println(set);

			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(110);  
			       set2.add(180);  
			       set2.add(150);
			       set2.add(220);	       
			       System.out.println(set2);

			      }

			}

		}