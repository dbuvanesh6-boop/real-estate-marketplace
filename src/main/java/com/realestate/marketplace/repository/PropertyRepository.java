package com.realestate.marketplace.repository;

import com.realestate.marketplace.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
