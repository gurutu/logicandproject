package com.restaurant.api.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.restaurant.api.bean.RestaurantBean;
import com.restaurant.api.bean.RestaurantLocationBean;

public interface CsvUtils {
    public static <T> List<T> read(Class<T> clazz, InputStream stream) throws IOException {
    	CsvMapper mapper = new CsvMapper();
    	CsvSchema schema = mapper.schemaFor(clazz).withHeader().withColumnReordering(true);
        ObjectReader reader = mapper.readerFor(clazz).with(schema);
        return reader.<T>readValues(stream).readAll();
    }
    
    
    public static  List<RestaurantBean> readVal(Class<RestaurantBean> clazz, InputStream stream) throws IOException {
    	CsvMapper mapper = new CsvMapper();
    	CsvSchema schema = mapper.typedSchemaFor(clazz).withHeader().withColumnReordering(true);
    	ObjectReader reader = mapper.readerFor(clazz).with(schema);
    	 List<Object> ob=reader.readValues(stream).readAll();
        return (List<RestaurantBean>)(Object)ob;
    }
    
    
    public static  List<RestaurantLocationBean> readValLoc(Class<RestaurantLocationBean> clazz, InputStream stream) throws IOException {
    	CsvMapper mapper = new CsvMapper();
    	CsvSchema schema = mapper.typedSchemaFor(clazz).withHeader().withColumnReordering(true);
    	ObjectReader reader = mapper.readerFor(clazz).with(schema);
    	 List<Object> ob=reader.readValues(stream).readAll();
        return (List<RestaurantLocationBean>)(Object)ob;
    }
}