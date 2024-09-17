package com.duoc.pet_ship_tracker_api.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.pet_ship_tracker_api.models.ProductShipment;
import com.duoc.pet_ship_tracker_api.services.ProductShipmentService;

@RestController
@RequestMapping("/api/v1/product-shipment")
public class ProductShipmentController {

    private static final Logger logger = LoggerFactory.getLogger(ProductShipmentController.class);
    private final ProductShipmentService productShipmentService;

    public ProductShipmentController(ProductShipmentService productShipmentService) {
        this.productShipmentService = productShipmentService;
    }

    @GetMapping
    public ResponseEntity<List<ProductShipment>> getProductShipments() {
        logger.info("Fetching all product shipments");
        return new ResponseEntity<>(productShipmentService.getAllProductShipments(), HttpStatus.OK);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<ProductShipment>> getProductShipmentsByStatus(@PathVariable String status) {
        logger.info("Fetching product shipments by status: {}", status);
        return new ResponseEntity<>(productShipmentService.getProductShipmentByStatus(status), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<ProductShipment> getProductShipmentsByStatus(@PathVariable int id) {
        logger.info("Fetching product shipments by id: {}", id);

        ProductShipment productShipment = productShipmentService.getProductShipmentById(id);

        if (productShipment == null) {
            logger.error("Product shipment with id {} not found", id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(productShipment, HttpStatus.OK);
    }

}
