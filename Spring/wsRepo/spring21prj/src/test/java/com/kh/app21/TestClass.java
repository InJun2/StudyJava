package com.kh.app21;

import org.junit.Test;
import org.slf4j.Logger;			// slf4j class ���
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;	

@Slf4j
public class TestClass {
	
	@Test
	public void test() {
//		Logger logger = LoggerFactory.getLogger(TestClass.class);
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
	}
}
