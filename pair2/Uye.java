package entity;

public class Uye extends BaseUser {
	private String uyeKayitTarihi;

	public Uye(int id, String ad, String soyad, String uyeKayitTarihi) {
		super(id, ad, soyad);
		this.uyeKayitTarihi = uyeKayitTarihi;

	}

	public String getUyeKayitTarihi() {
		return uyeKayitTarihi;
	}

	public void setUyeKayitTarihi(String uyeKayitTarihi) {
		this.uyeKayitTarihi = uyeKayitTarihi;
	}

}
