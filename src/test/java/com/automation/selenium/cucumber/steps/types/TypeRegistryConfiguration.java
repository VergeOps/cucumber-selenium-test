package com.automation.selenium.cucumber.steps.types;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterByTypeTransformer;
import io.cucumber.datatable.TableCellByTypeTransformer;
import io.cucumber.datatable.TableEntryByTypeTransformer;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {
	   
	@Override
    public void configureTypeRegistry(TypeRegistry registry) {
        
        JacksonTransformer jacksonTransformer = new JacksonTransformer();
        registry.setDefaultDataTableEntryTransformer(jacksonTransformer);
        registry.setDefaultDataTableCellTransformer(jacksonTransformer);
        registry.setDefaultParameterTransformer(jacksonTransformer);
    }

    @Override 
    public Locale locale() { 
        return Locale.ENGLISH; 
    }
    
    private static final class JacksonTransformer implements ParameterByTypeTransformer, 
    	TableEntryByTypeTransformer, TableCellByTypeTransformer {
    	
	    private final ObjectMapper objectMapper = new ObjectMapper();
	    
	    @Override
	    public <T> T transform(Map<String, String> entry, Class<T> type, TableCellByTypeTransformer cellTransformer) {
	       return objectMapper.convertValue(entry, type);
	    }
	    
	    @Override
	    public <T> T transform(String value, Class<T> cellType) {
	       return objectMapper.convertValue(value, cellType);
	    }

	    @Override
        public Object transform(String s, Type type) {
            return objectMapper.convertValue(s, objectMapper.constructType(type));
        }
 }

}
