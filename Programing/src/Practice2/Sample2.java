package Practice2;

import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
		for(int j=2;j<=100;j++)
		{
			int no=j;
		 boolean flag=true;
		 for (int i = 2; i<no; i++) {
			 if(no%i==0){
			flag=false;
			 }
		}
		 if (flag==true) {
			System.out.println(no+" It is a prime number");
		} else {
            System.out.println(no+" It is not a prime number");
		}
		}
	}
}
