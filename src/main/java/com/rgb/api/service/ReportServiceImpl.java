package com.rgb.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgb.api.entity.Citizenplan;
import com.rgb.api.repo.CitizenPlanRepositry;
import com.rgb.api.request.SearchRequest;
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
	private CitizenPlanRepositry repo;	
	
	@Override
	public List<String> getPlanName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPlanStatuses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Citizenplan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
