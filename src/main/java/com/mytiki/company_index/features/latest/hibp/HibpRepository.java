package com.mytiki.company_index.features.latest.hibp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HibpRepository extends JpaRepository<HibpDO, String> {
    Optional<HibpDO> findFirstByOrderByCachedOnDesc();
}
