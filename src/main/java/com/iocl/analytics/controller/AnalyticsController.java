package com.iocl.analytics.controller;

import java.util.List;

import com.iocl.analytics.dest.entity.*;
import com.iocl.analytics.dto.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iocl.analytics.service.AnalyticsServices;

@RestController
public class AnalyticsController {
//dest 10.146.111.161 schema 
	private static final Logger logger = LogManager.getLogger(AnalyticsController.class);
	@Autowired
	AnalyticsServices analyticsServices;

	@GetMapping("/addtpo")
	private void insertAddtPoDataAnalytics() {
		List<AnalyticsDataDto> analyticsDataList = analyticsServices.getDataFromHois();
		List<CostAddTDomestic> returnAnlyticDataList = null;

		if (analyticsDataList != null && analyticsDataList.size() > 0) {
			returnAnlyticDataList = analyticsServices.insertResultToAnalytics(analyticsDataList);
			if (analyticsDataList.size() == returnAnlyticDataList.size()) {
				logger.info("Data is saved to analutics successfully");
			} else {
				logger.info("Data can not be saved to analytics");
			}
		}

	}

	@GetMapping("/packagingcost")
	private void insertPackagingCostToAnalytics() {
		List<PackagingCostDto> packageCostDataList = analyticsServices.getPackagingCostFromHois();
		List<PackagingCost> returnpackCostDataList = null;

		if (packageCostDataList != null && packageCostDataList.size() > 0) {
			returnpackCostDataList = analyticsServices.insertCostResultToAnalytics(packageCostDataList);

			if (packageCostDataList.size() == returnpackCostDataList.size()) {
				logger.info("Data is saved to analutics successfully");
			} else {
				logger.info("Data can not be saved to analytics");
			}
		}

	}

	// For BO (Imports) - PO
	@GetMapping("/poi")
	private void insertPoImportsToAnalytics() {
		List<PoImportsDto> poiCostDataList = analyticsServices.getPoImportsCostFromHois();
		List<PoImport> returnpoiCostDataList = null;

		if (poiCostDataList != null && poiCostDataList.size() > 0) {
			returnpoiCostDataList = analyticsServices.insertPoiCostResultToAnalytics(poiCostDataList);

			if (poiCostDataList.size() == returnpoiCostDataList.size()) {
				logger.info("Data is saved to analutics successfully");
			} else {
				logger.info("Data can not be saved to analytics");
			}
		}

	}

	// for po -copetitors
	@GetMapping("/poc")
	private void insertPoCompititorsToAnalytics() {
		List<PoCompetitorsDto> pocCostDataList = analyticsServices.getPoCompititorsacostDataFromHois();
		List<PoCompetitors> returnpocCostDataList = null;

		if (pocCostDataList != null && pocCostDataList.size() > 0) {
			returnpocCostDataList = analyticsServices.insertPocCostResultToAnalytics(pocCostDataList);

			if (pocCostDataList.size() == returnpocCostDataList.size()) {
				logger.info("Data is saved to analutics successfully");
			} else {
				logger.info("Data can not be saved to analytics");
			}
		}

	}

	// For ADDT (Imports) - PO
	@GetMapping("/addimportstpo")
	private void insertAddtImportsPoDataAnalytics() {
		List<AddtPoImportsDto> poiCostDataList = analyticsServices.getAddtPoImportsFromHois();
		List<CostAddTImport> returnpoiCostDataList = null;

		if (poiCostDataList != null && poiCostDataList.size() > 0) {
			returnpoiCostDataList = analyticsServices.insertAddtPoiImportResultToAnalytics(poiCostDataList);

			if (poiCostDataList.size() == returnpoiCostDataList.size()) {
				logger.info("Data is saved to analytics successfully");
			} else {
				logger.info("Data can not be saved to analytics");
			}
		}

	}
	
	//For Material&Pack BOM
	@GetMapping("/materialPackBom")
	private void insertMatPacBomData() {

		List<MatPacBomDto> matBomDtoList = analyticsServices.getMatBomFrmHois();
		List<MaterialBomEntity> returnMaterialBomList = null;

		if (matBomDtoList != null && matBomDtoList.size() > 0) {
			returnMaterialBomList = analyticsServices.insertMatBomDataToAnalytics(matBomDtoList);

			if (matBomDtoList.size() == matBomDtoList.size()) {
				logger.info("MAT Data is saved to analytics successfully");
			} else {
				logger.info("Data can not be saved to analytics");
			}
		}

		List<MatPacBomDto> pckBomDtoList = analyticsServices.getPacBomFrmHois();
		List<PackBomEntity> returnPackBomDataList = null;

	if (pckBomDtoList != null && pckBomDtoList.size() > 0) {
	returnPackBomDataList = analyticsServices.insertPackBomDataToAnalytics(pckBomDtoList);

		if (pckBomDtoList.size() == pckBomDtoList.size()) {
		logger.info("Pack Data is saved to analytics successfully");
		} else {
			logger.info("Pack Data can not be saved to analytics");
		}

			}

	}
}


