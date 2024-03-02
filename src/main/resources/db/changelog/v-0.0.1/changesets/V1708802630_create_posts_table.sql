-- liquibase formatted sql
-- changeset gnori:V1708802630_create_posts_table

CREATE TABLE posts
(
    id         UUID PRIMARY KEY                  DEFAULT gen_random_uuid(),
    title      VARCHAR(300),
    content    TEXT,
    author_id  UUID                     NOT NULL REFERENCES persons (id),
    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT now(),
    updated_at TIMESTAMP WITH TIME ZONE
)