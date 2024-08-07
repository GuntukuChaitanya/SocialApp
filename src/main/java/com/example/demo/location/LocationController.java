package com.example.demo.location;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	
	@RequestMapping(value="/getLocations")
	public List<Location> getAllLocations(){
		System.out.println("We are at locations");
		Location loc1 = new Location("l1","Texas");
		Location loc2 = new Location("l2","New York");
		return Arrays.asList(loc1,loc2);
	}

}
