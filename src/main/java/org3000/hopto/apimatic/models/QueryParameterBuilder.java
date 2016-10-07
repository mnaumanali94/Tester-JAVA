/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 10/07/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;

public class QueryParameterBuilder {
    //the instance to build
    private QueryParameter queryParameter;

    /**
     * Default constructor to initialize the instance
     */
    public QueryParameterBuilder() {
        queryParameter = new QueryParameter();
    }

    public QueryParameterBuilder key(String key) {
        queryParameter.setKey(key);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public QueryParameter build() {
        return queryParameter;
    }
}