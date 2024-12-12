package com.rgb.api.service;

import java.util.List;

import com.rgb.api.entity.Citizenplan;
import com.rgb.api.request.SearchRequest;

public interface ReportService {
	

	public List<String> getPlanName();
	
	public List<String> getPlanStatuses();
	public List<Citizenplan> search(SearchRequest request);
	
	public boolean exportExcel();
	public boolean exportPdf();
	
}
