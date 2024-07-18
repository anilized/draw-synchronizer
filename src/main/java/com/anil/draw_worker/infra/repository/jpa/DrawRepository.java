package com.anil.draw_worker.infra.repository.jpa;

import com.anil.draw_worker.infra.repository.model.DrawEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrawRepository extends JpaRepository<DrawEntity, Long> {
}
