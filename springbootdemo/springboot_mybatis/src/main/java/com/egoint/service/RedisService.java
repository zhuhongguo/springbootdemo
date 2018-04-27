package com.egoint.service;

public interface RedisService {


	boolean set(String key, String value);

	String get(String key);

	long lpush(String key, Object obj);

	
	
}
