package com.phutran.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phutran.entities.Category;
import com.phutran.repositories.TestRepository;

@Service
public class TestServiceImpl implements TestService {
	private TestRepository test;
	
	
	@Autowired
	public TestRepository getTest() {
		return test;
	}

	public void setTest(TestRepository test) {
		this.test = test;
	}

	public List<Category> removeByNameLike(String name) {
		return test.removeByNameLike(name);
	}

	public Long removeByNameContaining(String name) {
		return test.removeByNameContaining(name);
	}
}
