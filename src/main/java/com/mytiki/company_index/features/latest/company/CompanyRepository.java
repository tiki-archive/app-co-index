package com.mytiki.company_index.features.latest.company;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<CompanyDO, Long> {
    Optional<CompanyDO> findByDomain(String domain);
}
