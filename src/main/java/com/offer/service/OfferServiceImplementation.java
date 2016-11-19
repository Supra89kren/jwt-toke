package com.offer.service;

import com.offer.entity.Offer;
import com.offer.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vladislav Diachenko on 19.11.16.
 */
@Service
public class OfferServiceImplementation implements OfferService {

	@Autowired
	OfferRepository offerRepository;

	@Override
	public List<Offer> getServices() {
		return offerRepository.findAll();
	}

	@Override
	public Offer saveOffer(Offer offer) {
		return offerRepository.save(offer);
	}
}
