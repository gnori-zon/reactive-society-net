package org.gnori.reactivesocietynet.person.core.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.gnori.reactivesocietynet.base.domain.audit.AuditableEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.gnori.reactivesocietynet.person.core.domain.Person.PERSON_TABLE;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(PERSON_TABLE)
@EqualsAndHashCode(of = "id")
@FieldDefaults(level = AccessLevel.PRIVATE)
public final class Person implements AuditableEntity {

    static final String PERSON_TABLE = "persons";

    @Id
    UUID id;

    String username;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;
}
