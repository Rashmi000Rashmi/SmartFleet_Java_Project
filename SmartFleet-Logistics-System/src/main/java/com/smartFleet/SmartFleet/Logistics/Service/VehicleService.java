package com.smartFleet.SmartFleet.Logistics.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartFleet.SmartFleet.Logistics.Entity.Vehicle;
import com.smartFleet.SmartFleet.Logistics.Repositories.VehicleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    // save new truck
    public Vehicle addVehicle(Vehicle vehicle) {
        vehicle.getLicensePlate().toUpperCase();
        
        return vehicleRepository.save(vehicle);
    }

    // get all vehicles
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // get vehicles by id

    public Vehicle getVehicle(Long id){
        return vehicleRepository.findById(id).orElse(null);
    }
    
}
