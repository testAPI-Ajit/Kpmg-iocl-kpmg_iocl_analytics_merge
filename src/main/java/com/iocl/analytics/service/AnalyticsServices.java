package com.iocl.analytics.service;

import java.util.List;

import com.iocl.analytics.dest.entity.*;
import com.iocl.analytics.dto.*;

public interface AnalyticsServices {

	public List<AnalyticsDataDto> getDataFromHois();

	public List<CostAddTDomestic> insertResultToAnalytics(List<AnalyticsDataDto> dataFromHois);

	public List<PackagingCostDto> getPackagingCostFromHois();

	public List<PackagingCost> insertCostResultToAnalytics(List<PackagingCostDto> costDataList);

	public List<PoImportsDto> getPoImportsCostFromHois();

	public List<PoImport> insertPoiCostResultToAnalytics(List<PoImportsDto> poCostDataList);

	public List<PoCompetitorsDto> getPoCompititorsacostDataFromHois();

	public List<PoCompetitors> insertPocCostResultToAnalytics(List<PoCompetitorsDto> pocCostDataList);

	public List<AddtPoImportsDto> getAddtPoImportsFromHois();

	public List<CostAddTImport> insertAddtPoiImportResultToAnalytics(List<AddtPoImportsDto> poCostDataList);

	
	public List<MatPacBomDto> getMatBomFrmHois();

	public List<MatPacBomDto> getPacBomFrmHois();

	public List<MaterialBomEntity> insertMatBomDataToAnalytics(List<MatPacBomDto> materialBomList);

	public List<PackBomEntity> insertPackBomDataToAnalytics(List<MatPacBomDto> packBomDataList);
}
