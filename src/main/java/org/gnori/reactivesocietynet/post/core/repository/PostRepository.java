package org.gnori.reactivesocietynet.post.core.repository;

import org.gnori.reactivesocietynet.post.core.domain.Post;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostRepository extends R2dbcRepository<Post, UUID> {
}
