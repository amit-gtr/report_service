package com.rgb.api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rgb.api.entity.Citizenplan;

public interface CitizenPlanRepositry extends  JpaRepository<Citizenplan, Integer> {
	@Query("select distincty (planName) from Citizenplan ")
	public List<String> getPlanNames();
	@Query("select distincty (planStatus) from Citizenplan ")
	public List<String> getPlanStatus();
	
	
	
	
	
}
