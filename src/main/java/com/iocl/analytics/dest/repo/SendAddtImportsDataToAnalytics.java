package com.iocl.analytics.dest.repo;

import com.iocl.analytics.dest.entity.CostAddTImport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SendAddtImportsDataToAnalytics extends JpaRepository<CostAddTImport, Long>{

}
