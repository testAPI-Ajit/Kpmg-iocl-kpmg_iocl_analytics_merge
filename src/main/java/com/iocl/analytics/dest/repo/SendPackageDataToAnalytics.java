package com.iocl.analytics.dest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iocl.analytics.dest.entity.PackagingCost;

public interface SendPackageDataToAnalytics extends JpaRepository<PackagingCost, Long> {

}
