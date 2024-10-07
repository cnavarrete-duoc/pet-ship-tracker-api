package com.duoc.pet_ship_tracker_api.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull(message = "latitude is required")
    @NotBlank(message = "latitude is required")
    @Column(name = "latitude")
    private int latitude;

    @NotNull(message = "longitude is required")
    @NotBlank(message = "longitude is required")
    @Column(name = "longitude")
    private int longitude;

    @NotNull(message = "lastUpdate is required")
    @NotBlank(message = "lastUpdate is required")
    @Column(name = "lastUpdate")
    private Date lastUpdate;
}
