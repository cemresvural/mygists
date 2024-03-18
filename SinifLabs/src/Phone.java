
public class Phone {
    PhoneType tip;
    String marka;
    String model;
    boolean wifi;
    boolean mobilVeri;
    
    boolean aramaVarmi;
    
    void aramaYap(String telefonNumarası) {
    	System.out.println(telefonNumarası);
    	aramaVarmi=true;
    }
    
    
    void aramayiSonlandır() {
    	if(aramaVarmi) {
    		System.out.println("Arama sonlandirildi.");
    	}
    }
	
    
    void mesajGonder(String mesaj) {
    	if(mobilVeri || wifi ) {
    		System.out.println("mesaj gonderildi.");
    	}
    }

}
