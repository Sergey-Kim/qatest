package com.example.tests;

import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class test1 extends SeleneseTestNgHelper {
	@Test public void testTest1() throws Exception {
		selenium.open("http://localhost:3000/#/");
		selenium.click("link=Add Screenshot");
		selenium.type("id=file", "D:\\1.jpg");
		selenium.type("id=focusedInput", "test1");
		selenium.click("css=button.btn.btn-primary");
		assertTrue(selenium.isVisible("id=screenshot"));
	}
}
