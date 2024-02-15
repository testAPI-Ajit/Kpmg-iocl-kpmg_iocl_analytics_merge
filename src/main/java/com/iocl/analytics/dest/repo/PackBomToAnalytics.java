package com.iocl.analytics.dest.repo;

import com.iocl.analytics.dest.entity.PackBomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackBomToAnalytics extends JpaRepository<PackBomEntity,Long> {
}
