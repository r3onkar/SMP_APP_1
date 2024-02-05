package com.smp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smp.binding.SearchCriteria;
import com.smp.entity.Student;

@Service
public interface EnquiryService {
	
	public boolean addEnq(Student student);

	public List<Student> getEnquiries(Integer cid, SearchCriteria searchCriteria);

}
