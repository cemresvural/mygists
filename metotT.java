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
	 public int topla(int x,int y) {
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
	
	System.out.println(sonuc);
}
}