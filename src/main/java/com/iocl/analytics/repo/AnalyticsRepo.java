package com.iocl.analytics.repo;

import java.util.List;
import com.iocl.analytics.dto.MatPacBomDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.iocl.analytics.dto.AnalyticsDataDto;
import com.iocl.analytics.source.entity.AddtPoEntity;

@Repository
public interface AnalyticsRepo extends JpaRepository<AddtPoEntity, Integer> {

//	select ekko.matnr, ekko.werks, ekko.ebeln,ekko.ebelp from pricing_tool.ym_po_det_rfc_ho_lubes as ekko where ekko.mtart in ('ADDT')
//	and ekko.werks in (select plant from pricing_tool.zst_lu_plant_mattyp where material_type = 'ADDT') and ekko.bsart in ('WK', 'MK') 
//	and ekko.bstyp = 'K' and (ekko.aedat between '2022-03-10' and '2022-06-30') and ekko.loekz =''

	@Query(value = "select mt.plant from MaterialTable mt where mt.material_type = :matType")
	public List<String> getPlantsByMaterialType(@Param("matType") String material_type);

// and (ekko.loekz is null)
	@Query(value = "select new com.iocl.analytics.source.entity.AddtPoEntity(ekko.ebeln, ekko.ebelp, ekko.matnr, ekko.werks, ekko.loekz)"
			+ " from AddtPoEntity as ekko where ekko.mtart in (:materialType) and ekko.werks in (:plantlist) and ekko.bsart in (:bsart)"
			+ " and ekko.bstyp = :bstyp and (ekko.aedat between :start_date and :end_date) and (ekko.loekz is null or ekko.loekz = '')")
	public List<AddtPoEntity> getDataListFromHois(@Param("plantlist") List<String> plantList,
			@Param("materialType") String materialType, @Param("bsart") String[] bsart, @Param("bstyp") String bstyp,
			@Param("start_date") String start_date, @Param("end_date") String end_date);

	@Query(value = "select new com.iocl.analytics.source.entity.AddtPoEntity(ekko.ebeln, ekko.ebelp, ekko.matnr, ekko.werks, ekko.loekz)"
			+ " from AddtPoEntity as ekko where ekko.mtart in (:materialType) and ekko.werks in (:plantlist) and ekko.bsart in (:bsart)"
			+ " and (ekko.aedat between :start_date and :end_date) and (ekko.loekz is null or ekko.loekz = '')")
	public List<AddtPoEntity> getPoiDataListFromHois(@Param("plantlist") List<String> plantList,
			@Param("materialType") String materialType, @Param("bsart") String[] bsart,
			@Param("start_date") String start_date, @Param("end_date") String end_date);

	@Query(value = "select new com.iocl.analytics.source.entity.AddtPoEntity(ekko.ebeln, ekko.ebelp, ekko.matnr, ekko.werks, ekko.loekz)"
			+ " from AddtPoEntity as ekko where ekko.mtart in (:materialType) and ekko.werks in (:plantlist) and ekko.bsart in (:bsart)"
			+ " and ekko.bstyp = 'K' and ekko.matkl in(:materialGrp) and (ekko.aedat between :start_date and :end_date) and "
			+ "(ekko.loekz is null or ekko.loekz = '')")
	public List<AddtPoEntity> getPackageDataListFromHois(@Param("plantlist") List<String> plantList,
			@Param("materialType") String materialType, @Param("materialGrp") String materialGrp,
			@Param("bsart") String[] bsart, @Param("start_date") String start_date, @Param("end_date") String end_date);

//	@Query(value = "select new com.iocl.analytics.source.entity.AddtPoEntity( ekko.ebeln, ekko.ebelp, ekko.matnr, ekko.werks, ekko.loekz)"
//			+ " from AddtPoEntity as ekko where ekko.mtart in ('ADDT') and ekko.werks in (:plantlist) and ekko.bsart in ('WK', 'MK')"
//			+ " and ekko.bstyp = 'K' and (ekko.aedat between '2022-03-10' and '2022-06-30') and (ekko.loekz is null or ekko.loekz = '')")
//	public List<AddtPoEntity> getDataListFromHois(@Param("plantlist") List<String> plantList);

	// select ekko.ebeln,ekko.ebelp from pricing_tool.ym_po_det_rfc_ho_lubes as ekko
	// where ekko.konnr = '' and ekko.ktpnr = '' and and ekko.loekz =''

	@Query(value = "select new com.iocl.analytics.source.entity.AddtPoEntity(ekko.ebeln,ekko.ebelp) from AddtPoEntity as ekko where"
			+ " ekko.konnr = :doc_id and ekko.ktpnr = :item_id and ekko.loekz is null")
	public List<AddtPoEntity> getAgreement(@Param("doc_id") String doc_id, @Param("item_id") String item_id);

	@Query(value = "select ekko.waers from AddtPoEntity as ekko where ekko.ebeln = :doc_id")
	public List<String> currencyList(@Param("doc_id") String doc_id, Pageable pageable);

	// ekko.wrbtr is missing for now add it when its available in db
	@Query(value = "select new com.iocl.analytics.source.entity.AddtPoEntity(ekko.bstme, ekko.menge, ekko.wrbtr) from AddtPoEntity as ekko where"
			+ " ekko.ebeln = :doc_id and ekko.ebelp = :item_id and ekko.matnr = :material_id and ekko.werks = :plant_id")
	public List<AddtPoEntity> getUomQuantiyAmt(@Param("doc_id") String doc_id, @Param("item_id") String item_id,
			@Param("material_id") String material_id, @Param("plant_id") String plant_id);

	@Query(value = "select mt.plant from MaterialTable mt")
	public List<String> getALLPlants();

//  For Materils & Pac BOM Analtics part pckBomDtoList

	@Query(value = "select distinct new com.iocl.analytics.dto.MatPacBomDto(cast(mt.material_code as string) as " +
			" finish_product,pt.plant as plant)" +
			" from MaterialTable mt,MaterialTable pt where pt.plant is NOT NULL")
	public List<MatPacBomDto> getAllMaterials();


	@Query(value = "select new com.iocl.analytics.dto.MatPacBomDto('100' as BMENG,'L29' as BMEIN, mtpk.idnrk, mtpk.menge, mtpk.meins) from BomInputentity as" +
			" mtpk where mtpk.matnr in(:material_data) and mtpk.werks in(:plant_data) and mtpk.mtart in('PACK')")
	public List<MatPacBomDto> getMatPackBomDto(
			@Param("material_data") String material,
			@Param("plant_data") String plant,
			Pageable pageable
	);

	@Query(value = "select new com.iocl.analytics.dto.MatPacBomDto('100' as BMENG,'L29' as BMEIN, mtpk.idnrk, mtpk.menge, mtpk.meins) " +
			"from BomInputentity as mtpk where mtpk.matnr in(:material_details) and mtpk.werks in(:plant_details) and mtpk.mtart in('BASE','ADDT')")
	public List<MatPacBomDto> getMatPackBomDtoForMaterialEndsWithZero(
			@Param("material_details") String material,
			@Param("plant_details") String plant,
			Pageable pageable
	);
	
	
	
}
