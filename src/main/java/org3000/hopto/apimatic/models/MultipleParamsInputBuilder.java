/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 10/07/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;

public class MultipleParamsInputBuilder {
    //the instance to build
    private MultipleParamsInput multipleParamsInput;

    /**
     * Default constructor to initialize the instance
     */
    public MultipleParamsInputBuilder() {
        multipleParamsInput = new MultipleParamsInput();
    }

    public MultipleParamsInputBuilder number(int number) {
        multipleParamsInput.setNumber(number);
        return this;
    }

    public MultipleParamsInputBuilder precision(double precision) {
        multipleParamsInput.setPrecision(precision);
        return this;
    }

    public MultipleParamsInputBuilder string(String string) {
        multipleParamsInput.setString(string);
        return this;
    }

    public MultipleParamsInputBuilder url(String url) {
        multipleParamsInput.setUrl(url);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MultipleParamsInput build() {
        return multipleParamsInput;
    }
}