package com.example.demo.model;

	import org.springframework.data.annotation.Id;
	import org.springframework.data.mongodb.core.mapping.Document;

	@Document(collection = "your_collection")
	public class DataModel {
	    @Id
	    private String id;
	    private int intensity;
	    private int likelihood;
	    private int relevance;
	    private int year;
	    private String country;
	    private String topics;
	    private String region;
	    private String city;

	 
	}

