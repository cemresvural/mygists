import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Lab101 {
public static void main(String[] args) {
	//Lab1
	/*Scanner scanner=new Scanner(System.in);
	int toplam=0;
	int input=0;
	do {
		System.out.print("Bir sayi giriniz: ");
		input =scanner.nextInt();
		toplam +=input;
	}while(input!=0);
	System.out.println("Girilen sayıların toplamı= "+ toplam);
	*/
	//
	/*Scanner scanner=new Scanner(System.in);
	String parola="";
	do {
		System.out.print("Parola:");
		parola=scanner.nextLine();
	}while(!parola.equals("1234"));
	System.out.println("Hoşgeldiniz.");
*/
	//ortalama
	/*Random random=new Random();
	//System.out.println(random.nextInt(100));
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("kac adet sayı üretilecek:");
	int sayi=scanner.nextInt();
	int[] sayilar=new int[sayi];
	
	for(int i=0; i< sayilar.length; i++) {
		sayilar[i]=random.nextInt(100);
		
	}
	  System.out.println(Arrays.toString(sayilar));
	  
	  float toplam=0.0f;
	  for(int i=0; i<sayilar.length;i++) {
		  toplam += sayilar[i];
	  }
	  System.out.print("Ortala:");
	  float ortalama =toplam/sayi;
	  System.out.println(ortalama);
	  */
	//Lab2
      /*Scanner scanner=new Scanner(System.in);
	  System.out.print("Vize notu:");
	  int vizeNotu=scanner.nextInt();
	  System.out.print("Final notu:");
	  int finalNotu=scanner.nextInt();
	  
	  float ortalama=(vizeNotu *0.4f)+ (finalNotu * 0.6f);
	  if(ortalama >= 50 && finalNotu >=50) {
		  System.out.println("Tebrikler,gectiniz");
	  }else {
		  System.out.println("Kaldınız"); 
	  }*/
	//Lab3
	  /*Scanner scanner=new Scanner(System.in);
	  System.out.print("Bir yazı girin:");
	  String text=scanner.nextLine();
	  
	  for(int i=text.length() -1; i >=0; i--) {
		  System.out.print(text.charAt(i));
	  }*/
	//Lab4
	  Scanner scanner=new Scanner(System.in);
	  System.out.print("Yarıcapı giriniz: ");
	  int yaricap=scanner.nextInt();
	  float alan=(float)(Math.PI*Math.pow(yaricap, 2));
	  float cevre=(float)(2*Math.PI*yaricap);
	  
	  System.out.println(alan);
	  System.out.println(cevre);
	
	  
}
}
