package com.haroon.BatchExample.controller;

import org.springframework.web.bind.annotation.RestController;

import com.haroon.BatchExample.model.Customer;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CustomerController {
	
	@Autowired
	private Job job;
	
	@Autowired
	private JobLauncher jobLauncher;
	
	@GetMapping("/import")
	public String getMethodName() throws Exception {
		JobParameters jobParams = new JobParametersBuilder().addLong("StartAt", System.currentTimeMillis()).toJobParameters();
		jobLauncher.run(job, jobParams);
		return new String();
	}
	

}
