package Practice2;

abstract class Sample3 {
    abstract void disp();
    abstract void call();
    void name()
    {
   	 System.out.println("Hello");
    }
}
  abstract class Demo  extends Sample3
{
	 void disp()
	 {
		 System.out.println("Hiiii");
	 }
}
 public class Demo1 extends Demo
  {
	   void call()
	   {
		   System.out.println("helooohelloo");
	   }
	   public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.disp();
		d1.call();
		d1.name();
	 
	}
  }
 

