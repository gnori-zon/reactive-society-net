package org.gnori.reactivesocietynet.base.domain.audit;

import java.time.LocalDateTime;

public interface HasCreatedAt {

    LocalDateTime getCreatedAt();

    void setCreatedAt(LocalDateTime createdAt);
}
