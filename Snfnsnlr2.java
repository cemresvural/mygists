
public class Snfnsnlr2 {
public static void main(String[] args) {
	Daire daire;
	daire=new Daire();
	daire.x=10.0;
	daire.y=20.0;
	daire.r=3.0;
	
	
	System.out.println(daire.x);
	System.out.println(daire.y);
	System.out.println(daire.r);
	
	
	double alan=daire.alanHesapla();
	double cevre=daire.cevreHesapla();
	
	
	System.out.println(alan);
	System.out.println(cevre);
	
	
	
	Daire daire2=new Daire();
	daire2.r=30;
	System.out.println(daire2.alanHesapla());
	System.out.println(daire2.cevreHesapla());
	
	
	
	Daire daire3=daire2;
	daire3.r=40;
	System.out.println(daire3.alanHesapla());
	System.out.println(daire3.cevreHesapla());
}
}
//abstraction
//Daire.java

//public class Daire {
//     double x;//8byte
//     double y;
//     double r;
//     
//     
//     
//     double cevreHesapla() {
//    	 return 2*3.14*r;
//     }
//     
//     double alanHesapla() {
//    	 return 3.14*r*r;
//     }
//}
