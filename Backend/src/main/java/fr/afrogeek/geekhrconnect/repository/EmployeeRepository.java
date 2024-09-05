package fr.afrogeek.geekhrconnect.repository;

import fr.afrogeek.geekhrconnect.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(exported = false)// desactive les methode CRUD
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}
