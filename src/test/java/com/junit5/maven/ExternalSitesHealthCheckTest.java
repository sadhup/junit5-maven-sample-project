package com.junit5.maven;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * 
 * @author sadhup
 * This class is to just verify health checks of external sites.
 */

public class ExternalSitesHealthCheckTest {
	
	@Test
    public void testGoogleMonHealth() {
	Assertions.assertTrue(verifyHealthCheck("https://www.google.com"));
    }  
	
	@Test
    public void testYahooMonHealth() {
	Assertions.assertTrue(verifyHealthCheck("https://www.yahoo.com"));
    }  


	/**
     * Verify health check url by using HttpMethod. Return "true" if
     * verified else "false".
     * 
     * @param healthCheckUrl
     * @return
     */
    @SuppressWarnings("finally")
	public boolean verifyHealthCheck(String healthCheckUrl) {
    	boolean responsecode = false;
    try{	
    	HttpClient httpClient = new HttpClient();
    	HttpMethod method = new GetMethod(healthCheckUrl);
       	int statusCode = httpClient.executeMethod(method);
       	
		if (statusCode == 200) responsecode = true;
		else responsecode = false;
    }catch (Exception e) {
		System.err.println("update promo e=" + e.getMessage());
    }
    finally{
    	return responsecode;
    }
    }
    
   
}
