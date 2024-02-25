package statements;
/*
public class statement {
	public static void main(String[] args) {
		int i;//expression
		int x=10;//decleration
		System.out.println("red");
		double pow=Math.pow(2, 3);
		System.out.println(pow);
		
		for(int j=0;j<10;j++) {
			System.out.println(j);
		}
	}
}*/
public class statement {
	public static void main(String[] args) {
//		int x=10;
//		int y=20;
//		int z=x+y;
//		System.out.println(x+y);
//		System.out.println(z);
//		
//		
//		//Lab1
//		System.out.println(x-y);//unsigned!
//		System.out.println(x*y);
//		System.out.println(x/y);
//		System.out.println(5%2);
//		
//		
//		
//		int a=10;
//		//a=a+2;
//		a+=2;
//		System.out.println(a);
		
		
		//Lab2
		
		
		
		
		int i=10;//00000000 00000000 00000000 00001010
		         
		int x=4;//00000000 00000000 00000000 00000100
		System.out.println(~i);//11111111 11111111 11111111 11110101
		System.out.println(i & x);//00000000 00000000 00000000 00000000
		System.out.println(i | x);
		System.out.println(x>>1);//When I shift the number to the right once, I actually divide the number by 2.
		System.out.println(x<<1);//when  I shift the number to the left once,the leftmost bit is discarded and a "0" is added to the end.

	}
}