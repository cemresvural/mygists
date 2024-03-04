import java.util.Scanner;
public class metotT {
//   private void helloWorld() {
//	   System.out.println("Hello World");   }

//    private int topla(int x,int y) {
//	int toplam=x+y;
//	return toplam;
//}
//private float topla(float x,int y) {
//	float toplam=x+y;
//	return(float)toplam;
//}
//private float topla(float x,float y) {
//	float toplam=x+y;
//	return(float)toplam;
//}
//private int topla(byte x,byte y) {
//	int toplam=x+y;
//	return toplam;
//}
	/* public int topla(int x,int y) {
		int toplam=x+y;
		return toplam;
	 }
public static void main(String[] args) {
	//new metotT().helloWorld();
	
	metotT MetotT=new metotT();
	
	Scanner scanner=new Scanner(System.in);
	int x=scanner.nextInt();
	int y=scanner.nextInt();
	int sonuc=MetotT.topla(x, y);
	
	System.out.println(sonuc);*/
	
	//
	public float topla(float x,float y) {
		return x+y;
	}
	public float cikar(float x,float y) {
		return x-y;
	}
	public float carp(float x,float y) {
		return x*y;
	}
	public float bol(float x,float y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		metotT MetotT=new metotT();
		float toplama= MetotT.topla(4.0f,6.0f);
		System.out.println(toplama);
		System.out.println(MetotT.cikar(6.0f,2.0f));
		System.out.println(MetotT.carp(6.0f,2.0f));
		System.out.println(MetotT.bol(6.0f,2.0f));
	}
	
}
