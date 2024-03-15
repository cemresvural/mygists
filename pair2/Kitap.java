package entity;

import java.util.Date;

public class Kitap extends Odunc {
	private int kitapId;
	private String kitapAd;

	public Kitap(String id, int alım_tarih, int oduncTarih) {
		super(id, alım_tarih, oduncTarih);

	}

	public int getKitapId() {
		return kitapId;
	}

	public void setKitapId(int kitapId) {
		this.kitapId = kitapId;
	}

	public String getKitapAd() {
		return kitapAd;
	}

	public void setKitapAd(String kitapAd) {
		this.kitapAd = kitapAd;
	}

}
