package dersturkcel;

import Log.Dblog;
import Log.Logger;
import Log.SmsLogger;
import Repository.KitabRepositoryİmple;
import Repository.KitapRepository;
import Servis.KitapServisİmpl;
import Servis.KitapServisİnterface;
import entity.Kitap;

public class Main {

	public static void main(String[] args) {

		Logger smsLogger = new SmsLogger();
		smsLogger.log("SMS Log Start");

		Logger dblog = new Dblog();
		dblog.log("DB Log Start");

		KitapServisİnterface kitapServis = new KitapServisİmpl(new KitabRepositoryİmple(), new SmsLogger());
		KitapServisİnterface kitapServis2 = new KitapServisİmpl(new KitabRepositoryİmple(), new Dblog());
		kitapServis.oduncVeris(new Kitap("1", 2, 18));
		kitapServis2.oduncAlis(new Kitap("1", 8, 18));

	}

}
