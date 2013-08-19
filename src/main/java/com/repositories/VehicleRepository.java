package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.repositories.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
