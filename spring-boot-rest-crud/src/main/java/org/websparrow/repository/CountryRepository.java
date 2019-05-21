package org.websparrow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.websparrow.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
