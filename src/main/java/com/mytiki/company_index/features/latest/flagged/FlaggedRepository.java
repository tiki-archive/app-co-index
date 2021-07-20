package com.mytiki.company_index.features.latest.flagged;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlaggedRepository extends JpaRepository<FlaggedDO, Long> {
}
