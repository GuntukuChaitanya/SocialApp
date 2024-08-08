package com.example.demo.location;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locRepo;
	
	// Store Data Here
	List<Location> locations = new ArrayList<>();
	
	//Fetch All Locations from Stored Data
	public List<Location> getAllLocations(){
		locRepo.findAll().forEach(locations::add);
		return locations;
	}
	
	//Gets Location Details by Id
	public Optional<Location> getLocById(String id){
		return locRepo.findById(id);
	}
	
	//Add New Location to Stored Data
	public void addLoc(Location loc){
		locRepo.save(loc);
	}
	
	//Update Location Details by Id
	public void updateLoc(String id, Location loc) {
		locRepo.save(loc);
	}
	
	//Delete Location Details by Id from Stored Data
	public void deleteLoc(String id) {
		locRepo.deleteById(id);
	}
}
