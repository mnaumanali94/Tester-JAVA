/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 10/07/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendHeadersInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4707771328869045328L;
    private String customHeader;
    private String value;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("custom-header")
    public String getCustomHeader ( ) { 
        return this.customHeader;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("custom-header")
    public void setCustomHeader (String value) { 
        this.customHeader = value;
    }
 
    /** GETTER
     * Represents the value of the custom header
     */
    @JsonGetter("value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * Represents the value of the custom header
     */
    @JsonSetter("value")
    public void setValue (String value) { 
        this.value = value;
    }
 
}
 