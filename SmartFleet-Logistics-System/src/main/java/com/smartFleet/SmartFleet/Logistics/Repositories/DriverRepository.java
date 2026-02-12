package com.smartFleet.SmartFleet.Logistics.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartFleet.SmartFleet.Logistics.Entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    
}
