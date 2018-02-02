package com.revature.unit.tests;

import org.junit.Test;

import com.revature.mutiplier.Multiplier;

public class MoreMultiplierTests {

	public Multiplier mult = new Multiplier();

	@Test(expected = Exception.class)
	public void expectException() throws Exception {
		mult.throwException();
	}

}
