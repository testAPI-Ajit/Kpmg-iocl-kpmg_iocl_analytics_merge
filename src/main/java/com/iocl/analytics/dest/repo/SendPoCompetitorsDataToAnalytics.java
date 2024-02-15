package com.iocl.analytics.dest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iocl.analytics.dest.entity.PoCompetitors;

public interface SendPoCompetitorsDataToAnalytics extends JpaRepository<PoCompetitors, Long> {

}
