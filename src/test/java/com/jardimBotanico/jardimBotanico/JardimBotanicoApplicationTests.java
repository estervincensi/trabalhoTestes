package com.jardimBotanico.jardimBotanico;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JardimBotanicoApplicationTests {


    private WebDriver webDriver;


	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\External\\chromedriver.exe");
		webDriver = new ChromeDriver();
	}

	@AfterClass
	public static void createAndStopService() {
		//service.stop();
	}

	@After
	public void quitDriver() {
	//	webDriver.quit();
	}


	@Test
	public void contextLoads() {


		webDriver.get("http://www.google.com/xhtml");

	}

}
