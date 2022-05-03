package io.github.rwik.location.repos;

import io.github.rwik.location.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
