package fr.ranaivoson.votingsystem.repositories;

import fr.ranaivoson.votingsystem.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends CrudRepository<Citizen, Long> {
}
