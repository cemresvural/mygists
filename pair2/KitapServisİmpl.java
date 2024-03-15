package Servis;

import Log.Logger;
import Repository.KitapRepository;
import entity.Kitap;

public class KitapServisİmpl implements KitapServisİnterface {

	private KitapRepository kitapRepository;
	private Logger logger;

	public KitapServisİmpl(KitapRepository kitapRepository, Logger logger) {
		super();
		this.kitapRepository = kitapRepository;
		this.logger = logger;
	}

	@Override
	public void oduncAlis(Kitap kitap) {
		logger.log("Vertabanına kayıt edildi.");
		kitapRepository.add(kitap);

	}

	@Override
	public void oduncVeris(Kitap kitap) {
		logger.log("Odunc verildi.");

		if (kitap.getTeslimTarih() + 5 < kitap.getOduncTarih()) {
			kitapRepository.cezaİslem();
		} else {

			kitapRepository.add(kitap);
		}

	}

}
