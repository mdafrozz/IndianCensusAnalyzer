/**
 * 
 */
package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
/**
 * @author MD_AFROZ
 *
 */
public class IndianCensusTest {
private static final String INDIA_CENSUS_PATH_FILE = "C:/Users/MD_AFROZ/eclipse-workspace/IndianStateCensusAnalyser/src/resources/IndiaStateCensusData.csv";
private static final String WRONG_CENSUS_PATH_FILE = "";

@Test
public void givenIndiaCensusCSVFile_WhenLoaded_ShouldReturnCorrectRecords() {
	IndianCensusAnalyzer censusAnalyser = new IndianCensusAnalyzer();
	try {
		int numOfRecord = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_PATH_FILE);
		Assert.assertEquals(29, numOfRecord);
	} catch (CensusAnalyserException e) {

	}
}

@Test
public void givenIndiaCensusData_WithWrongFile_ShouldThrowException() {
	try {
		IndianCensusAnalyzer censusAnalyser = new IndianCensusAnalyzer();
		@SuppressWarnings("deprecation")
		ExpectedException exceptionRule = ExpectedException.none();
		exceptionRule.expect(CensusAnalyserException.class);
		censusAnalyser.loadIndiaCensusData(WRONG_CENSUS_PATH_FILE);
	} catch (CensusAnalyserException e) {
		Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
	}
}
}
