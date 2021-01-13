package com.pralan.security.Dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MyDaoImpl implements MyDao {
	
//	JdbcApi jdbcApi;

	@Override
	public List<String> getNameList(int id) {
		return Arrays.asList("Name1","Name2");
	}

	@Override
	public List<String> getAdminList(int id) {
		return Arrays.asList("Admin1","Admin2");
	}
	

}
