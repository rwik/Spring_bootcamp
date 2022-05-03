package io.github.rwik.location.service;

import io.github.rwik.location.entities.Location;

import java.util.List;

public interface LocationServices {
    Location saveLocation(Location location);
    Location updateLocation(Location location);
    void deleteLocation(Location location);
    Location getLocationbyID(int id);
    List<Location> getLocations();
}
