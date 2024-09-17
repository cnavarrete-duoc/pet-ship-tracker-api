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
public class Location {
    private int id;
    private int latitude;
    private int longitude;
    private Date lastUpdate;
}
