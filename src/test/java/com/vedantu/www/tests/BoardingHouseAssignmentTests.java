package com.vedantu.www.tests;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.vedantu.www.BoradingHouseAssignment;

public class BoardingHouseAssignmentTests {
	@Test
	public void test1() {
		String[] inputs={"init 4","reg 1 a v","reg 2 a nv","reg 3 b v","reg 4 b nv"};
		List<String> inputList=Arrays.asList(inputs);
		String[] bv= {"3"};
		String[] av= {"1"};
		String[] bnv= {"4"};
		String[] anv= {"2"};
		String[] na= {};
		List<String> bvList=Arrays.asList(bv);
		List<String> bnvList=Arrays.asList(bnv);
		List<String> avList=Arrays.asList(av);
		List<String> anvList=Arrays.asList(anv);
		List<String> naList=Arrays.asList(na);
		List<List<String>> expectedValues=new ArrayList<List<String>>();
		expectedValues.add(bvList);
		expectedValues.add(avList);
		expectedValues.add(bnvList);
		expectedValues.add(anvList);
		expectedValues.add(naList);
		BoradingHouseAssignment boradingHouseAssignment=new BoradingHouseAssignment();
		Assert.assertEquals(expectedValues, boradingHouseAssignment.getAssignedBoradHouseAssignment(inputList));
	}
	@Test
	public void test2() {
		String[] inputs={"init 12","reg 1 B V","reg 2 A V","reg 3 A V","reg 4 B NV","reg 5 B V","reg 6 A NV","reg 7 A V","reg 8 A NV","reg 9 B NV","reg 10 B V","reg 11 A NV","reg 12 B NV","reg 13 A NV"};
		List<String> inputList=Arrays.asList(inputs);
		String[] bv= {"1","5","10"};
		String[] av= {"2","3","7"};
		String[] bnv= {"4","9","12"};
		String[] anv= {"6","8","11"};
		String[] na= {"13"};
		List<String> bvList=Arrays.asList(bv);
		List<String> bnvList=Arrays.asList(bnv);
		List<String> avList=Arrays.asList(av);
		List<String> anvList=Arrays.asList(anv);
		List<String> naList=Arrays.asList(na);
		List<List<String>> expectedValues=new ArrayList<List<String>>();
		expectedValues.add(bvList);
		expectedValues.add(avList);
		expectedValues.add(bnvList);
		expectedValues.add(anvList);
		expectedValues.add(naList);
		BoradingHouseAssignment boradingHouseAssignment=new BoradingHouseAssignment();
		Assert.assertEquals(expectedValues, boradingHouseAssignment.getAssignedBoradHouseAssignment(inputList));
	}
	@Test
	public void test3() {
		String[] inputs={"init 12","reg 1 B V","reg 2 A V","reg 3 A V","reg 4 B NV","reg 5 B V","reg 6 A NV","reg 7 A V","reg 8 A NV","reg 9 B NV","reg 10 B V","reg 11 A NV","reg 12 B NV"};
		List<String> inputList=Arrays.asList(inputs);
		String[] bv= {"1","5","10"};
		String[] av= {"2","3","7"};
		String[] bnv= {"4","9","12"};
		String[] anv= {"6","8","11"};
		String[] na= {};
		List<String> bvList=Arrays.asList(bv);
		List<String> bnvList=Arrays.asList(bnv);
		List<String> avList=Arrays.asList(av);
		List<String> anvList=Arrays.asList(anv);
		List<String> naList=Arrays.asList(na);
		List<List<String>> expectedValues=new ArrayList<List<String>>();
		expectedValues.add(bvList);
		expectedValues.add(avList);
		expectedValues.add(bnvList);
		expectedValues.add(anvList);
		expectedValues.add(naList);
		BoradingHouseAssignment boradingHouseAssignment=new BoradingHouseAssignment();
		Assert.assertEquals(expectedValues, boradingHouseAssignment.getAssignedBoradHouseAssignment(inputList));
	}
	@Test
	public void test4() {
		String[] inputs={"init 12","reg 1 B V","reg 2 A V","reg 3 A V","reg 4 B NV","reg 5 B V","reg 6 A NV","reg 7 A V","reg 8 A NV","reg 9 B NV","reg 10 B V","reg 11 A NV","reg 12 B NV","reg 1 B NV"};
		List<String> inputList=Arrays.asList(inputs);
		String[] bv= {"1","5","10"};
		String[] av= {"2","3","7"};
		String[] bnv= {"4","9","12"};
		String[] anv= {"6","8","11"};
		String[] na= {};
		List<String> bvList=Arrays.asList(bv);
		List<String> bnvList=Arrays.asList(bnv);
		List<String> avList=Arrays.asList(av);
		List<String> anvList=Arrays.asList(anv);
		List<String> naList=Arrays.asList(na);
		List<List<String>> expectedValues=new ArrayList<List<String>>();
		expectedValues.add(bvList);
		expectedValues.add(avList);
		expectedValues.add(bnvList);
		expectedValues.add(anvList);
		expectedValues.add(naList);
		BoradingHouseAssignment boradingHouseAssignment=new BoradingHouseAssignment();
		Assert.assertEquals(expectedValues, boradingHouseAssignment.getAssignedBoradHouseAssignment(inputList));
	}
	//Different class
	@Test
	public void test5() {
		String[] inputs={"init 12","reg 1 B V","reg 2 B V","reg 3 A V","reg 4 B NV","reg 5 B V","reg 6 A NV","reg 7 A V","reg 8 A NV","reg 9 B NV","reg 10 B V","reg 11 A NV","reg 12 B NV","reg 1 B NV"};
		List<String> inputList=Arrays.asList(inputs);
		String[] bv= {"1","2","5"};
		String[] av= {"3","7","10"};
		String[] bnv= {"4","9","12"};
		String[] anv= {"6","8","11"};
		String[] na= {};
		List<String> bvList=Arrays.asList(bv);
		List<String> bnvList=Arrays.asList(bnv);
		List<String> avList=Arrays.asList(av);
		List<String> anvList=Arrays.asList(anv);
		List<String> naList=Arrays.asList(na);
		List<List<String>> expectedValues=new ArrayList<List<String>>();
		expectedValues.add(bvList);
		expectedValues.add(avList);
		expectedValues.add(bnvList);
		expectedValues.add(anvList);
		expectedValues.add(naList);
		BoradingHouseAssignment boradingHouseAssignment=new BoradingHouseAssignment();
		Assert.assertEquals(expectedValues, boradingHouseAssignment.getAssignedBoradHouseAssignment(inputList));
	}
	//different food preference
	@Test
	public void test6() {
		String[] inputs={"init 12","reg 1 B V","reg 2 A V","reg 3 A V","reg 4 B NV","reg 5 B V","reg 6 A NV","reg 7 A V","reg 8 A NV","reg 9 B NV","reg 10 B NV","reg 11 A NV","reg 12 B NV"};
		List<String> inputList=Arrays.asList(inputs);
		String[] bv= {"1","5","12"};
		String[] av= {"2","3","7"};
		String[] bnv= {"4","9","10"};
		String[] anv= {"6","8","11"};
		String[] na= {};
		List<String> bvList=Arrays.asList(bv);
		List<String> bnvList=Arrays.asList(bnv);
		List<String> avList=Arrays.asList(av);
		List<String> anvList=Arrays.asList(anv);
		List<String> naList=Arrays.asList(na);
		List<List<String>> expectedValues=new ArrayList<List<String>>();
		expectedValues.add(bvList);
		expectedValues.add(avList);
		expectedValues.add(bnvList);
		expectedValues.add(anvList);
		expectedValues.add(naList);
		BoradingHouseAssignment boradingHouseAssignment=new BoradingHouseAssignment();
		Assert.assertEquals(expectedValues, boradingHouseAssignment.getAssignedBoradHouseAssignment(inputList));
	}
}
