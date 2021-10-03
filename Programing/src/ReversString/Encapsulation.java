package ReversString;
class Facebook
{
	private int pwd=234;
	public int getPwd()
	{
		return pwd;
	}
	public void setPwd(int pwd)
	{
		this.pwd=pwd;
	}
}


public class Encapsulation {
      public static void main(String[] args) {
		Facebook f1=new Facebook();
		System.out.println(f1.getPwd());
		f1.setPwd(123);
		System.out.println(f1.getPwd());
	}
}
