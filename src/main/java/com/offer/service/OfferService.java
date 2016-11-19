package com.offer.service;

import com.offer.entity.Offer;

import java.util.List;

/**
 * Created by Vladislav Diachenko on 19.11.16.
 */
public interface OfferService {
	List<Offer> getServices();

	Offer saveOffer(Offer offer);
}
