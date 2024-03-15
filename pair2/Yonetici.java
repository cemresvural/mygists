package entity;

public class Yonetici extends BaseUser {

	private String userName;
	private String password;

	public Yonetici(int id, String ad, String soyad, String userName, String password) {
		super(id, ad, soyad);
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
