package com.smartFleet.SmartFleet.Logistics.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartFleet.SmartFleet.Logistics.Entity.Vehicle;

@Repository
public interface VehicleRepository  extends JpaRepository<Vehicle, Long> {

    
}
