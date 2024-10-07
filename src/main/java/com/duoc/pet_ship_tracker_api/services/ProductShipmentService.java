package com.duoc.pet_ship_tracker_api.services;

import java.util.List;

import com.duoc.pet_ship_tracker_api.models.ProductShipment;

public interface ProductShipmentService {

    public List<ProductShipment> getAllProductShipments();

    public ProductShipment getProductShipmentById(int id);

    public List<ProductShipment> getProductShipmentByStatus(String status);
}
