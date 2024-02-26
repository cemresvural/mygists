import java.util.Scanner;

public class ıfBlok {
	 public static void main(String[] args) {
		/* int number =10;
//		 
//		 if (number>0) {
//			 System.out.println("Number pozitif bir sayıdır.");
//			 System.out.println("2. ");
//		 }
		 boolean result =number<0;
		 if(result) {
			 System.out.println("Number pozitif bir sayıdır.");
      		 System.out.println("2. ");
			 }else {
				 System.out.println("Number negatif bir sayıdır."); 
			 }
		 System.out.println("Burası her zaman calısacak.");*/
		 
		/*Scanner scanner=new Scanner(System.in);
		 System.out.print("Bir sayı giriniz: ");
		 int number=scanner.nextInt();
		 if(number % 2==0) {
			 System.out.println("Çift bir sayı girdiniz.");
			 
		 }else {
			 System.out.println("Tek bir sayı girdiniz.");
		 }*/
		 
		 /*int number =75;//and for int number=10;
		 if(number <100) {
			 System.out.println("sayı 100 den kucuk");
			 if(number>50) {
				 System.out.println("sayı 50 den buyuk");
			 }
		 }*/
		 /*Scanner scanner=new Scanner(System.in);
		 System.out.print("Bir sayı girin :");
		 int number=scanner.nextInt();
		 if(number <100 && number>=1) {
			 System.out.println("Girilen sayi iki basamakli");
			
		 }else if(number <1000 && number>=100) {
			 System.out.println("Girilen sayi üc basamakli");
		 }else if(number <10000 && number>=1000) {
			 System.out.println("Girilen sayi dört basamakli");
		 }else {
			 System.out.println("Girilen sayi 1 ve 9999 arasında degil");
		 }*/
		 
		 Scanner scanner=new Scanner(System.in);
		 System.out.print("Sınav notu :");
		 int score=scanner.nextInt();
		 
		 if (score >=90 && score <=100) {
			 System.out.println("AA");
		 }else if(score >=85 && score<90) {
			 System.out.println("BA");
		 }else if(score >=80 && score<85) {
			 System.out.println("BB");
		 }else if(score >=75 && score<80) {
			 System.out.println("CB");
		 }else if(score >=70 && score<75) {
			 System.out.println("CC");
		 }else if(score >=65 && score<70) {
			 System.out.println("DC");
		 }else if(score >=60 && score<65) {
			 System.out.println("DD");
		 }else if(score >=50 && score<60) {
			 System.out.println("FD");
		 }else if(score >=0 && score<50) {
			 System.out.println("FF");
		 }else {
			 System.out.println("0-100 arasında bir sayı giriniz.");
		 }
		 //debug mode use also.
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
}
