package com.offer.rest.controller;

import com.offer.entity.Offer;
import com.offer.rest.dto.OfferCreationDto;
import com.offer.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Vladislav Diachenko on 19.11.16.
 */
@RestController
public class OfferController {

	@Autowired
	OfferService offerService;

	@RequestMapping(value = "/offer",method = RequestMethod.GET)
	public ResponseEntity<List<Offer>> getOffers(){
		List<Offer> services = offerService.getServices();
		return new ResponseEntity<>(services, HttpStatus.OK);
	}


	@RequestMapping(value = "/offer" ,method = RequestMethod.POST)
	public ResponseEntity<Offer> createOffer(@RequestBody OfferCreationDto creationDto){
		Offer offer = new Offer();
		offer.setTitle(creationDto.getTitle());
		offer.setDescription(creationDto.getDescription());
		offer.setPrice(creationDto.getPrice());
		return new ResponseEntity<>(offerService.saveOffer(offer), HttpStatus.CREATED);

	}


}
