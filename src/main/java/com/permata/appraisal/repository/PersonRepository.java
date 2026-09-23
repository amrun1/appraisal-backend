package com.permata.appraisal.repository;

import com.permata.appraisal.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, String> {

    @Query("select p from Person p left join fetch p.roles where p.userId = :userId")
    Optional<Person> findWithRolesByUserId(@Param("userId") String userId);
}