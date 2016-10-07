/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 10/07/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;

public class SendHeadersInputBuilder {
    //the instance to build
    private SendHeadersInput sendHeadersInput;

    /**
     * Default constructor to initialize the instance
     */
    public SendHeadersInputBuilder() {
        sendHeadersInput = new SendHeadersInput();
    }

    public SendHeadersInputBuilder customHeader(String customHeader) {
        sendHeadersInput.setCustomHeader(customHeader);
        return this;
    }

    /**
     * Represents the value of the custom header
     */
    public SendHeadersInputBuilder value(String value) {
        sendHeadersInput.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendHeadersInput build() {
        return sendHeadersInput;
    }
}