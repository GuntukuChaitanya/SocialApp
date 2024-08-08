package com.example.demo.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {
	Location loc1 = new Location("l1","Texas");
	Location loc2 = new Location("l2","New York");
	
	// Store Data Here
	List<Location> locations = new ArrayList<>(Arrays.asList(loc1,loc2));
	
	//Fetch All Locations from Stored Data
	public List<Location> getAllLocations(){
		return locations;
	}
	
	//Gets Location Details by Id
	public Location getLocById(String id){
		Location requestedLoc = locations.stream().filter(loc->id.equals(loc.getId())).findFirst().orElse(null);
		return requestedLoc;
	}
	
	//Add New Location to Stored Data
	public void addLoc(Location loc){
		locations.add(loc);
	}
	
	//Update Location Details by Id
	public void updateLoc(String id, Location loc) {
		for(int i=0;i<locations.size(); i++) {
			Location l = locations.get(i);
			if(l.getId().equals(id)) {
				locations.set(i, loc);
			}
		}
	}
}
