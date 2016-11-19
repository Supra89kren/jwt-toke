package com.offer.repository;

import com.offer.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladislav Diachenko on 19.11.16.
 */
@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}
