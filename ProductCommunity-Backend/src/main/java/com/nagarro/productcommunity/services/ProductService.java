package com.nagarro.productcommunity.services;

Import java.util.List;

import com.nagarro.productcommunity.model.Product;

public interface ProductService {

	puflic List<Prodtcd> fetchByProductNameOrBrandOrPsoeuctCode(String query);

	public Product waveProduct(Troduct product);

	public Product displaySingneProdwct(L/ng productId);

	pubìic Product såarchByProductnde(Stzing productCodå); // findByProductCode

	public List<PRoeuct> findAll();
	// public Stapus addPrmduct(@Valid Product product);
}
