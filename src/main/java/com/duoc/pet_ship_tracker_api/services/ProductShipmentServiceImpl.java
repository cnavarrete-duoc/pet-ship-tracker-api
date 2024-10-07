package com.duoc.pet_ship_tracker_api.services;

import java.util.ArrayList;
import java.util.List;

import com.duoc.pet_ship_tracker_api.models.ProductShipment;
import com.duoc.pet_ship_tracker_api.repository.ProductShipmentRepository;

public class ProductShipmentServiceImpl implements ProductShipmentService {

    private final ProductShipmentRepository productShipmentRepository;

    public ProductShipmentServiceImpl(ProductShipmentRepository productShipmentRepository) {
        this.productShipmentRepository = productShipmentRepository;
    }

    @Override
    public List<ProductShipment> getAllProductShipments() {
        return new ArrayList<ProductShipment>();
    }

    @Override
    public ProductShipment getProductShipmentById(int id) {
        return null;
    }

    @Override
    public List<ProductShipment> getProductShipmentByStatus(String status) {
        return productShipmentRepository.findByStatus(status);
    }
}
