package org.gnori.reactivesocietynet.post.core.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.gnori.reactivesocietynet.base.domain.audit.AuditableEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.gnori.reactivesocietynet.post.core.domain.Post.POST_TABLE;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(POST_TABLE)
@EqualsAndHashCode(of = "id")
@FieldDefaults(level = AccessLevel.PRIVATE)
public final class Post implements AuditableEntity {

    static final String POST_TABLE = "posts";

    @Id
    UUID id;

    String title;

    String content;

    UUID authorUd;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;
}
