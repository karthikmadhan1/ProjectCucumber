package org.yahoo.stepdef;

import org.yahoo.utils.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	@Before
	public void  start() {
		launchBrowser("edge");
	}
	
	@After
	public void end() {
		closeWindow();
	}
}


