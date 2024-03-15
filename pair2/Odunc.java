package entity;

import java.util.Date;

public class Odunc {

	private String id;
	private int alımTarih;
	private int teslimTarih;
	private int oduncTarih;

	public Odunc(String id, int alımTarih, int oduncTarih) {
		super();
		this.id = id;
		this.alımTarih = alımTarih;
		this.oduncTarih = oduncTarih;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAlımTarih() {
		return alımTarih;
	}

	public void setAlımTarih(int alımTarih) {
		this.alımTarih = alımTarih;
	}

	public int getTeslimTarih() {

		return this.teslimTarih = alımTarih + 5;

	}

	public void setTeslimTarih(int teslimTarih) {
		this.teslimTarih = teslimTarih;
	}

	public int getOduncTarih() {
		return oduncTarih;
	}

	public void setOduncTarih(int oduncTarih) {
		this.oduncTarih = oduncTarih;
	}

}
