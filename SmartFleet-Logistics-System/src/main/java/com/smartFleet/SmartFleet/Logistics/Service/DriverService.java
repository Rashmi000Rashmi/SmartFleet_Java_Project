package com.smartFleet.SmartFleet.Logistics.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.smartFleet.SmartFleet.Logistics.Entity.Driver;
import com.smartFleet.SmartFleet.Logistics.Entity.Vehicle;
import com.smartFleet.SmartFleet.Logistics.Repositories.DriverRepository;
import com.smartFleet.SmartFleet.Logistics.Repositories.VehicleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DriverService {

    private final DriverRepository driverRepository;
    private final VehicleRepository vehicleRepository;

    // add driver
    
    public Driver addDriver(Driver driver) {
        return driverRepository.save(driver);
    }   

    // assign driver to vehicle
    
    public Driver assignDriverToVehicle(Long driverId, Long vehicleId) {
        Driver driver = driverRepository.findById(driverId)
                .orElseThrow(() -> new RuntimeException("Driver not found with id: " + driverId));
        
        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new RuntimeException("Vehicle not found with id: " + vehicleId));
        
        driver.setAssignedVehicle(vehicle);
        driver.setAssignmentDate(java.time.LocalDate.now());
        return driverRepository.save(driver);
    }
}