package com.duoc.pet_ship_tracker_api.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.pet_ship_tracker_api.models.Location;
import com.duoc.pet_ship_tracker_api.models.ProductShipment;

@Service
public class ProductShipmentService {

    private List<ProductShipment> productShipments = new ArrayList<>();

    public ProductShipmentService() {
        productShipments.add(
                new ProductShipment(1, 101, "Dog Food", 1001, "John Doe", "En camino",
                        new Location(1, -33, -70, new Date()), new Date(), "2024-09-01"));

        productShipments.add(new ProductShipment(2, 102, "Cat Toy", 1002, "Jane Smith", "Pendiente",
                new Location(2, -33, -71, new Date()), new Date(), "2024-09-03"));

        productShipments.add(new ProductShipment(3, 103, "Bird Cage", 1003, "Robert Brown", "Entregado",
                new Location(3, -36, -73, new Date()), new Date(), "2024-08-29"));

        productShipments.add(new ProductShipment(4, 104, "Fish Tank", 1004, "Emily White", "En camino",
                new Location(4, -29, -71, new Date()), new Date(), "2024-09-02"));

        productShipments.add(new ProductShipment(5, 105, "Hamster Wheel", 1005, "Michael Green", "Pendiente",
                new Location(5, -23, -70, new Date()), new Date(), "2024-09-05"));
    }

    public List<ProductShipment> getAllProductShipments() {
        return productShipments;
    }

    public ProductShipment getProductShipmentById(int id) {
        return productShipments.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public List<ProductShipment> getProductShipmentByStatus(String status) {
        return productShipments.stream().filter(p -> p.getStatus().equals(status)).toList();
    }
}
