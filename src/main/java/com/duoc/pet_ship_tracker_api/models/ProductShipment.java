package com.duoc.pet_ship_tracker_api.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductShipment {

    private int id;
    private int productId;
    private String productName;
    private int customerId;
    private String customerName;
    private String status;
    private Location currentLocation;
    private Date createAt;
    private String expectedDeliveryDate;
}
