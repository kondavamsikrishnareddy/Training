public class stringbuilder {

	public static void main(String[] args) {
		 String str="dani";
	        StringBuilder str1=new StringBuilder(str);
	        str1.append( " vani");
	        str1.replace(0,5, "dani");
	        System.out.println(str1);
	}

}