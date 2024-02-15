package com.iocl.analytics.util;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.iocl.analytics.constant.AnalyticsConstant;

public class GetDate {
	private static final Logger logger = LogManager.getLogger(GetDate.class);

	public Map<String, String> neaxtMonthDateMap() {
		// Get the current date
		Map<String, String> startAndEndDayMap = new HashMap<>();
		try {
			LocalDate currentDate = LocalDate.now();

			// Calculate the start date of the next month
			LocalDate nextMonthStartDate = currentDate.plusMonths(1).withDayOfMonth(1);

			// Calculate the end date of the next month
			LocalDate nextMonthEndDate = YearMonth.from(nextMonthStartDate).atEndOfMonth();

			// Print the results
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			startAndEndDayMap.put(AnalyticsConstant.START_DATE_OF_NEXT_MONTH, nextMonthStartDate.format(formatter));
			startAndEndDayMap.put(AnalyticsConstant.END_DATE_OF_NEXT_MONTH, nextMonthEndDate.format(formatter));
			startAndEndDayMap.put(AnalyticsConstant.CURRENT_DATE, currentDate.format(formatter));
			logger.info("Current Date: " + currentDate.format(formatter));
			logger.info("Start Date of Next Month: " + nextMonthStartDate.format(formatter));
			logger.info("End Date of Next Month: " + nextMonthEndDate.format(formatter));
		} catch (Exception e) {
			logger.error("can not get date of the next month :: ", e);
		}
		return startAndEndDayMap;
	}
	
	public Map<String, String> previuosMonthDateMap() {
		// Get the current date
		Map<String, String> startAndEndDayMap = new HashMap<>();
		try {
			LocalDate currentDate = LocalDate.now();

			// Calculate the start date of the next month
			LocalDate nextMonthStartDate = currentDate.minusMonths(1).withDayOfMonth(1);

			// Calculate the end date of the next month
			LocalDate nextMonthEndDate = YearMonth.from(nextMonthStartDate).atEndOfMonth();

			// Print the results
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			startAndEndDayMap.put(AnalyticsConstant.START_DATE_OF_PREV_MONTH, nextMonthStartDate.format(formatter));
			startAndEndDayMap.put(AnalyticsConstant.END_DATE_OF_PREV_MONTH, nextMonthEndDate.format(formatter));
			startAndEndDayMap.put(AnalyticsConstant.CURRENT_DATE, currentDate.format(formatter));
			logger.info("Current Date: " + currentDate.format(formatter));
			logger.info("Start Date of Next Month: " + nextMonthStartDate.format(formatter));
			logger.info("End Date of Next Month: " + nextMonthEndDate.format(formatter));
		} catch (Exception e) {
			logger.error("can not get date of the next month :: ", e);
		}
		return startAndEndDayMap;
	}

}
