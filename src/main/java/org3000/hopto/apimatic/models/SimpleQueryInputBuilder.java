/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 10/07/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;

public class SimpleQueryInputBuilder {
    //the instance to build
    private SimpleQueryInput simpleQueryInput;

    /**
     * Default constructor to initialize the instance
     */
    public SimpleQueryInputBuilder() {
        simpleQueryInput = new SimpleQueryInput();
    }

    public SimpleQueryInputBuilder mboolean(boolean mboolean) {
        simpleQueryInput.setMBoolean(mboolean);
        return this;
    }

    public SimpleQueryInputBuilder number(int number) {
        simpleQueryInput.setNumber(number);
        return this;
    }

    public SimpleQueryInputBuilder string(String string) {
        simpleQueryInput.setString(string);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SimpleQueryInput build() {
        return simpleQueryInput;
    }
}