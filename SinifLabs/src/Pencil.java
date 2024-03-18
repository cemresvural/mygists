
public class Pencil {
	
	String marka;
	String tip;
	boolean doldurulabilir;
	boolean silinebilir;
	
	
	void yaz(String metin) {
		System.out.println(metin);
		
	}
	
	void tekrarDoldur() {
		if(doldurulabilir) {
			System.out.println("Kalem dolduruldu.");
		}else {
			System.out.println("Bu kalem doldurulamaz");
		}
	}
	
	void sil() {
		if(silinebilir) {
			System.out.println("Yazı silinir.");
		}else {
			System.out.println("Yazı silinemez");
		}
	}

}
