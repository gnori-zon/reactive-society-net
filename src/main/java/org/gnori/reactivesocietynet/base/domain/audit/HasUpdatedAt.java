package org.gnori.reactivesocietynet.base.domain.audit;

import java.time.LocalDateTime;

public interface HasUpdatedAt {

    LocalDateTime getUpdatedAt();

    void setUpdatedAt(LocalDateTime updatedAt);
}
