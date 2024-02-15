package com.iocl.analytics.dest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iocl.analytics.dest.entity.PoImport;

public interface SendPoImportDataToAnalytics extends JpaRepository<PoImport, Long> {

}
