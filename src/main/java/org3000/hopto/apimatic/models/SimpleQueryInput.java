/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 10/07/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SimpleQueryInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5346365150775418269L;
    private boolean mboolean;
    private int number;
    private String string;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("boolean")
    public boolean getMBoolean ( ) { 
        return this.mboolean;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("boolean")
    public void setMBoolean (boolean value) { 
        this.mboolean = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("number")
    public int getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("number")
    public void setNumber (int value) { 
        this.number = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("string")
    public String getString ( ) { 
        return this.string;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("string")
    public void setString (String value) { 
        this.string = value;
    }
 
}
 