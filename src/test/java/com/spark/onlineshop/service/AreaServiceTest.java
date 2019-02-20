package com.spark.onlineshop.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.spark.onlineshop.BaseTest;
import com.spark.onlineshop.entity.Area;

public class AreaServiceTest extends BaseTest{
	@Autowired
	private AreaService areaService;
	
	@Test
	public void testGetAraList() {
		List<Area>areaList = areaService.getAreaList();
		assertEquals("mytown", areaList.get(0).getAreaName());
	}
}
