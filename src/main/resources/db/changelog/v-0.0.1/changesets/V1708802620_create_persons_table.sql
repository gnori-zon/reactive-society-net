-- liquibase formatted sql
-- changeset gnori:V1708802620_create_persons_table

CREATE TABLE persons
(
    id         UUID PRIMARY KEY                  DEFAULT gen_random_uuid(),
    username   VARCHAR(200)             NOT NULL UNIQUE,
    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT now(),
    updated_at TIMESTAMP WITH TIME ZONE
)