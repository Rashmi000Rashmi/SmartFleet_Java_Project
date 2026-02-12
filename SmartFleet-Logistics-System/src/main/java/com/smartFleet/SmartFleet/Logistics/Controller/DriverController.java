package com.smartFleet.SmartFleet.Logistics.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartFleet.SmartFleet.Logistics.Entity.Driver;
import com.smartFleet.SmartFleet.Logistics.Service.DriverService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;
    
    @PostMapping("/driver")
    public Driver postDriver(@RequestBody Driver driver) {
        //TODO: process POST request
        
        return driverService.addDriver(driver);
    }

    @PutMapping("/{driverId}/assignVehicle/{vehicleId}")
    public ResponseEntity<Driver> assignDriverToVehicle(@PathVariable Long driverId, @PathVariable Long vehicleId) {
        Driver updatedDriver = driverService.assignDriverToVehicle(driverId, vehicleId);
        return ResponseEntity.ok(updatedDriver);
        }
}
    
    

