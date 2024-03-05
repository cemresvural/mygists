
public class metotprmtrs {
	//abstract,static,final,synchronized
	
	public metotprmtrs() {
		System.out.println("ctor");
	}
	
    public static void main(String[] args) {
	//metotprmtrs Metotprmtrs=new metotprmtrs();
    	

Ogrenci ogrenci=new Ogrenci();
System.out.println(ogrenci.ad);
System.out.println(ogrenci.soyad);
System.out.println(ogrenci.yas);


Ogrenci ogrenci2=new Ogrenci("Göktug","Çalışkan",24);
System.out.println(ogrenci2.ad);
System.out.println(ogrenci2.soyad);
System.out.println(ogrenci2.yas);
 }
}
//constructor  Ogrenci.java
//
//public class Ogrenci {
//String ad;
//String soyad;
//int yas;
//
//Ogrenci(){
//	ad="Bilinmeyen";
//	soyad="Bilinmeyen";
//	yas=-1;
//}
//
//Ogrenci(String a,String b,int y){
//	ad=a;
//	soyad=b;
//	yas=y;
//}
//}

