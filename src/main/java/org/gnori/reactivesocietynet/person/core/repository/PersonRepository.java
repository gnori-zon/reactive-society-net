package org.gnori.reactivesocietynet.person.core.repository;

import org.gnori.reactivesocietynet.person.core.domain.Person;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends R2dbcRepository<Person, UUID> {
}
