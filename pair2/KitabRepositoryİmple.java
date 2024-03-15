package Repository;

import entity.Kitap;

public class KitabRepositoryİmple implements KitapRepository {

	@Override
	public void add(Kitap kitap) {
		System.out.println("Veritabanına kayıt edildi.");

	}

	@Override
	public void cezaİslem() {
		System.out.println("Ceza verildi.");

	}

}
