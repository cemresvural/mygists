import java.util.Scanner;
public class forR {
	//initialization,condition,iteration
public static void main(String[] args) {
	/*
	//for(int i=0; i<10;i++) {
		//System.out.println(i);
	//}
	for(int i=9; i>=0;i--) {
		System.out.println(i);
	}
		*/
	//
	/*int [] numbers= {2,4,6,8,10,12};
	for(int i=0; i<numbers.length;i++) {
		System.out.println(numbers[i]);
	}*/
	//
	/*Scanner scanner=new Scanner(System.in);
	System.out.print("1.sayı: ");
	int x=scanner.nextInt();
	System.out.print("2.sayı: ");
	int y=scanner.nextInt();
	
	for(int i= x;i<y;i++) {
		//System.out.println(i);
		if(i % 2==0) {
			System.out.println(i);
		}
	}*/
	//
	/*
	String[] names;
	Scanner scanner=new Scanner(System.in);
	System.out.print("Kac kisi girilecek: ");
	names=new String[Integer.parseInt(scanner.nextLine())];
	
	for(int i=0; i<names.length; i++) {
		System.out.println((i+1) + ". Kişi: ");
		names[i]=scanner.nextLine();
	}
	for(int i=0; i<names.length; i++) {
		System.out.print(names[i]+ ", ");
		
	}*/
	//for each 
	/*int[] numbers= {1,2,3,4,5,6,7,8,9};
	for(int i:numbers) {
		System.out.println(i);
		}*/
	//
	Scanner scanner=new Scanner(System.in);
	System.out.println("10 adet sayi giriniz: ");
	int[] numbers=new int[10];
	for(int i=0; i<numbers.length; i++) {
		numbers[i]=scanner.nextInt();
	}
	for(int i: numbers) {
		if(i%2==1) {
	System.out.println(i);
	}
		if(i==5) {
			break;
		}
	}
	
	
	
}
}
