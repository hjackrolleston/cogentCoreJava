package com.cogent.springboot.utils;

import javax.activation.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBUtils {
	@Autowired
	DataSource dataSource;
	public DataSource getDataSource() {return dataSource;}
}
