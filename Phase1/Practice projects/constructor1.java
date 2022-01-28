class Student {
	int id;
	String name;

	Student(int i,String n) {
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}
public class constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   

            Student s1=new Student(70,"ramesh");
			Student s2=new Student(130,"mani");
			s1.display();
			s2.display();
		}
}