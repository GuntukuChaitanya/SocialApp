package com.example.demo.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/location/new")
	public List<Location> addLocation(@RequestBody Location location) {
		locServ.addLoc(location);
		return locServ.getAllLocations();
	}
	
	@PutMapping("location/update/{id}")
	public List<Location> updateLocation(@PathVariable String id, @RequestBody Location location){
		locServ.updateLoc(id, location);
		return locServ.getAllLocations();
	}
	
	@DeleteMapping("location/{id}")
	public List<Location> deleteLocation(@PathVariable String id){
		locServ.deleteLoc(id);
		return locServ.getAllLocations();
	}
}
