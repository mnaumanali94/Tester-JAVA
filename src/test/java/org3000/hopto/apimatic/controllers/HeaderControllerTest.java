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
import org3000.hopto.apimatic.controllers.HeaderController;

import com.fasterxml.jackson.core.type.TypeReference;

public class HeaderControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static HeaderController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getHeader();
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
     * Todo Add description for test testSendHeaders
     * @throws Throwable
     */
    @Test
    public void testSendHeaders() throws Throwable {
        // Parameters for the API call
        SendHeadersInput input = new SendHeadersInput();
        input.setCustomHeader("TestString");
        input.setValue("TestString");

        // Set callback and perform API call
        ServerResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.sendHeaders(input);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
