package com.example.demo.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	
	@Autowired
	private LocationService locServ;
	
	
	@GetMapping("/getLocations")
	public List<Location> getLocations(){
		return locServ.getAllLocations();
	}
	
	@GetMapping("/location/{id}")
	public Location getLocById(@PathVariable String id) {
		return locServ.getLocById(id);
	}

}
