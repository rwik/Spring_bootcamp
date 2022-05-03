package io.github.rwik.location.service;

import io.github.rwik.location.entities.Location;
import io.github.rwik.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationServiceImpl implements LocationServices {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepository.delete(location);
    }

    @Override
    public Location getLocationbyID(int id) {
        return locationRepository.findById(id).get();
    }

    @Override
    public List<Location> getLocations() {
        return locationRepository.findAll();
    }
}
