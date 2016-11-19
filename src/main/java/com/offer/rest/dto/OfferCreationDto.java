package com.offer.rest.dto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vladislav Diachenko on 19.11.16.
 */

public class OfferCreationDto {


	private String title;
	private String description;
	private Double price;

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Double getPrice() {
		return price;
	}
}
