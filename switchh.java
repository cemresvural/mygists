import java.util.Scanner;
public class switchh {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	/*
	System.out.print("Haftanın gunu:");
	int day=scanner.nextInt();
	
	switch(day) {
	case 1:
		System.out.println("Pazartesi");
		break;
	case 2:
		System.out.println("Salı");
		break;
	case 3:
		System.out.println("Carsamba");
		break;
	case 4:
		System.out.println("Persembe");
		break;
	case 5:
		System.out.println("Cuma");
		break;
	case 6:
		System.out.println("Cumartesi");
		break;
	case 7:
		System.out.println("Pazar");
		break;
		default:
			System.out.println("Yanlıs deger girdiniz.");
			break;
	}*/
	
	//Lab
	/*System.out.print("1. sayı: ");
	float x=Float.parseFloat(scanner.nextLine());
	System.out.print("2. sayı: ");
	float y=Float.parseFloat(scanner.nextLine());
	System.out.print("İslem: ");
	char islem=scanner.nextLine().charAt(0);
	
	
	switch(islem) {//breakpoınt,debug mode!
	case '+':
		System.out.println("Sonuc: " + (x+y));
		break;
	case '-':
		System.out.println("Sonuc: " + (x-y));
		break;
	case '*':
		System.out.println("Sonuc: " + (x*y));
		break;
	case '/':
		System.out.println("Sonuc: " + (x/y));
		break;
		default:
			System.out.println("Bilinmeyen operator");
			break;
		
	}*/
	System.out.print("Haftanın gunu: ");
	int gun=scanner.nextInt();
	 switch(gun) {
	 case 1:
	 case 2:
	 case 3:
	 case 4:
	 case 5:
		 System.out.println("Hafta içi");
		 break;
	 case 6:
	 case 7:
		 System.out.println("Hatfa sonu");
		 break;
	 }
			
			
}
}
