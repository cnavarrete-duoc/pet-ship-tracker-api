package com.duoc.pet_ship_tracker_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duoc.pet_ship_tracker_api.models.ProductShipment;

public interface ProductShipmentRepository extends JpaRepository<ProductShipmentRepository, Integer> {

    List<ProductShipment> findByStatus(String status);
}
