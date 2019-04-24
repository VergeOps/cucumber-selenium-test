package com.automation.selenium.cucumber.data.constants;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonProperty;

public enum Sample {

	@JsonProperty("X")
	X("X"),
	@JsonProperty("Y")
	CY("Y");
	
	private String type; 
	  
    public String getType() 
    { 
        return this.type; 
    } 
  
    private Sample(String type) 
    { 
        this.type = type;
    } 
}
