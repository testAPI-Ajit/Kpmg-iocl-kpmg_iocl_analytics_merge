package com.iocl.analytics.dest.repo;

import com.iocl.analytics.dest.entity.MaterialBomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialBomToAnalytics extends JpaRepository<MaterialBomEntity,Long> {
}
