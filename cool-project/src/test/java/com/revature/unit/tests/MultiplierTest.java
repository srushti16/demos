package com.revature.unit.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.mutiplier.Multiplier;

public class MultiplierTest {
	private static Logger log = Logger.getRootLogger();
	private List<Integer> intList;
	private Multiplier mult = new Multiplier();

	@BeforeClass
	public static void runOnceBeforeAllTests() {
		log.info("Initialization before any tests are run");
	}

	@Before
	public void createList() {
		log.info("setting up the list before each test");
		intList = new ArrayList<Integer>();
		intList.add(50);
		intList.add(20);
		intList.add(7);
		intList.add(52);
	}

	@Test
	public void testNotSame() {
		for (int i = 0; i < 100; i++) {
			assertNotSame(mult.multiplyAllElementsBy(i, intList), intList);
		}
	}

	@Test
	public void testMultiplyBy2() {
		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(100);
		expectedList.add(40);
		expectedList.add(14);
		expectedList.add(104);

		System.out.println(mult.multiplyAllElementsBy(2, intList));
		assertEquals("The list did not contain the expected values", expectedList,
				mult.multiplyAllElementsBy(2, intList));
	}

	@After
	public void after() {
		log.info("runs after each test");
	}

	@AfterClass
	public static void afterAll() {
		log.info("runs after all tests are complete");
	}
}
