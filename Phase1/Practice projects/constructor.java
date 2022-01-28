public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class EmpInfo {
			int id;
			String name;
			void display() {
				System.out.println(id+" "+name);
			}
		}
		        EmpInfo emp1=new EmpInfo();
				EmpInfo emp2=new EmpInfo();

				emp1.display();
				emp2.display();
			}

		}