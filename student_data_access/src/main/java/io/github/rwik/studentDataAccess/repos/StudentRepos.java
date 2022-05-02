package io.github.rwik.studentDataAccess.repos;

import io.github.rwik.studentDataAccess.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepos extends CrudRepository<Student, Integer> {
}
