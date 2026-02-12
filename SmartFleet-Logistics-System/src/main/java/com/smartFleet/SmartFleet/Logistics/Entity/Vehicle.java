package com.smartFleet.SmartFleet.Logistics.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;
    private int year;

    @Column(unique = true)
    private String licensePlate;
    private String status; // e.g., "available", "assigned", "maintenance"

    // What is mappedBy? This is a "No-Entry" sign for the database. It tells Spring: "Hey, the relationship is already being managed by the 'assignedVehicle' field in the Driver class. Don't create a new table or column here; just look over there for the data!"
    @OneToMany(mappedBy = "assignedVehicle")
    @JsonManagedReference
    private List<Driver> assignedDrivers;

}
