package com.iocl.analytics.dest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iocl.analytics.dest.entity.CostAddTDomestic;

public interface SendDataToAnalytics extends JpaRepository<CostAddTDomestic, Long>{

}
