/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ) on 10/07/2016
 */
package org3000.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MultipleParamsInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5068480752163508347L;
    private int number;
    private double precision;
    private String string;
    private String url;
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
    @JsonGetter("precision")
    public double getPrecision ( ) { 
        return this.precision;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("precision")
    public void setPrecision (double value) { 
        this.precision = value;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
}
 