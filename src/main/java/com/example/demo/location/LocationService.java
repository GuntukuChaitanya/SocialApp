package com.example.demo.location;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {
	Location loc1 = new Location("l1","Texas");
	Location loc2 = new Location("l2","New York");
	List<Location> locations = Arrays.asList(loc1,loc2);
	public List<Location> getAllLocations(){
		return locations;
	}
	public Location getLocById(String id){
		Location requestedLoc = locations.stream().filter(loc->id.equals(loc.getId())).findFirst().orElse(null);
		return requestedLoc;
	}
	
}
