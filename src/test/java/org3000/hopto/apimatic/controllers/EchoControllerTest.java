/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 on 10/07/2016
 */
package org3000.hopto.apimatic.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org3000.hopto.apimatic.models.*;
import org3000.hopto.apimatic.exceptions.*;
import org3000.hopto.apimatic.APIHelper;
import org3000.hopto.apimatic.Configuration;
import org3000.hopto.apimatic.testing.TestHelper;
import org3000.hopto.apimatic.controllers.EchoController;

import com.fasterxml.jackson.core.type.TypeReference;

public class EchoControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static EchoController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getEcho();
        applyConfiguration();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Todo Add description for test testFormEcho
     * @throws Throwable
     */
    @Test
    public void testFormEcho() throws Throwable {
        // Parameters for the API call
        Object input = APIHelper.deserialize("{\"uid\": \"1123213\", \"name\": \"Shahid\"}");

        // Set callback and perform API call
        DynamicResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.formEcho(input);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"body\":{\"input\":{\"uid\":\"1123213\",\"name\":\"Shahid\"}}}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testJsonEcho
     * @throws Throwable
     */
    @Test
    public void testJsonEcho() throws Throwable {
        // Parameters for the API call
        Object input = APIHelper.deserialize("{\"uid\": \"1123213\", \"name\": \"Shahid\"}");

        // Set callback and perform API call
        DynamicResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.jsonEcho(input);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"body\": {\"uid\": \"1123213\", \"name\": \"Shahid\"}}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
