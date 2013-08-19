package com.repositories;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.repositories.VehicleRepository;
import com.repositories.entity.Vehicle;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
public class VehicleRepositoryTest {

	@Autowired
	VehicleRepository vehicleRepository;
	
	@Test
	public void test() {
		Vehicle car = new Vehicle();
		//car.setId(1);
		car.setName("Merceteze");
		car.setType("Luxery");
		vehicleRepository.save(car);
		System.out.println(car);
		
		Vehicle fcar = vehicleRepository.findOne(car.getId());
		assertEquals("Merceteze",fcar.getName());
		assertNotNull(fcar);
		System.out.println(fcar);
		
	}

}
