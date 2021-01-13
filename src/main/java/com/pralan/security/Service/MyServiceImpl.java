package com.pralan.security.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pralan.security.Dao.MyDao;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	MyDao myDao;

	@Override
	public List<String> getNameList(int id) {
		return myDao.getNameList(id);
	}

	@Override
	public List<String> getAdminList(int id) {
		return myDao.getAdminList(id);
	}

}
