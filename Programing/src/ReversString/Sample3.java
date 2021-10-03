package ReversString;

public class Sample3 {
     public static void main(String[] args) {
		String s1="Sudarshan";
		int a1=s1.length()/2;
		String s2=s1.substring(a1);
		String rev="";
		for (int i =s2.length()-1; i>=0; i--) {
              rev=rev+s2.charAt(i);
              
		}
		System.out.println(rev);
	}
}
