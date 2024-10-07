package com.duoc.pet_ship_tracker_api.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_shipment")
public class ProductShipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull(message = "productId is required")
    @NotBlank(message = "productId is required")
    @Column(name = "productId")
    private int productId;

    @NotNull(message = "productName is required")
    @NotBlank(message = "productName is required")
    @Column(name = "productName")
    private String productName;

    @NotNull(message = "customerId is required")
    @NotBlank(message = "customerId is required")
    @Column(name = "customerId")
    private int customerId;

    @NotNull(message = "customerName is required")
    @NotBlank(message = "customerName is required")
    @Column(name = "customerName")
    private String customerName;

    @NotNull(message = "status is required")
    @NotBlank(message = "status is required")
    @Column(name = "status")
    private String status;

    @NotNull(message = "currentLocation is required")
    @NotBlank(message = "currentLocation is required")
    @Column(name = "currentLocation")
    private Location currentLocation;

    @NotNull(message = "createAt is required")
    @NotBlank(message = "createAt is required")
    @Column(name = "createAt")
    private Date createAt;

    @NotNull(message = "expectedDeliveryDate is required")
    @NotBlank(message = "expectedDeliveryDate is required")
    @Column(name = "expectedDeliveryDate")
    private String expectedDeliveryDate;
}
