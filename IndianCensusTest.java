/**
 * 
 */
package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author MD_AFROZ
 *
 */
public class IndianCensusTest {
private static final String INDIA_CENSUS_PATH_FILE = "C:/Users/MD_AFROZ/eclipse-workspace/IndianStateCensusAnalyser/src/resources/IndiaStateCensusData.csv";
	
	@Test
    public void givenIndiaCensusCSVFile_WhenLoaded_ShouldReturnCorrectRecords() {
		IndianCensusAnalyzer censusAnalyser = new IndianCensusAnalyzer();
        try {
            int numOfRecord = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_PATH_FILE);
            Assert.assertEquals(29, numOfRecord);
        } catch (CensusAnalyserException e) {

        }
    }
}
