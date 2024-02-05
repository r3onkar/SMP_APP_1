package com.smp.services;

import org.springframework.stereotype.Service;

import com.smp.binding.DashboardResponse;
import com.smp.entity.Counseller;

@Service
public interface CounsellorService {
	public String saveCounsellor(Counseller counseller);
	 
	public Counseller loginCheck(String email, String passsword);

	public boolean recoverPwd(String email);

	public DashboardResponse getDashboardInfo(Integer cid);

}
