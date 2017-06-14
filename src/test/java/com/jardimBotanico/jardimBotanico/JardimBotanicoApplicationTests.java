package com.jardimBotanico.jardimBotanico;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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


	@After
	public void quitDriver() {
		webDriver.quit();
	}


	@Test
	public void testPageCreatedUser() {
		webDriver.get("http://jardimbotanico.herokuapp.com/");
		List<WebElement> elementLegend = webDriver.findElements(By.id("legendTitle"));
		assertEquals(elementLegend.get(0).getText(), "Cadastro do Usuário");
	}

	@Test
	public void testCreatedUseMensager() {
		webDriver.get("http://jardimbotanico.herokuapp.com/");	
	}

	@Test
	public void testEmptyValues() {
		webDriver.get("http://jardimbotanico.herokuapp.com/");	
	

		WebElement name = webDriver.findElement(By.name("name"));
		WebElement email = webDriver.findElement(By.name("email"));
		WebElement city = webDriver.findElement(By.name("city"));
		WebElement user = webDriver.findElement(By.name("user"));
		WebElement pas = webDriver.findElement(By.name("password"));
		
		user.getAttribute("require");
		
		
	}
	
	
	@Test
	public void testCanNotCreateduserWithUserExisting() {
		webDriver.get("http://jardimbotanico.herokuapp.com/");
		
		
		WebElement name = webDriver.findElement(By.name("name"));
		WebElement email = webDriver.findElement(By.name("email"));
		WebElement city = webDriver.findElement(By.name("city"));
		WebElement user = webDriver.findElement(By.name("user"));
		WebElement pas = webDriver.findElement(By.name("password"));
		
		name.sendKeys("teste");
		email.sendKeys("teste@teste.com");
		name.sendKeys("teste");
		user.sendKeys("teste");
		pas.sendKeys("123");
		
		WebElement btn = webDriver.findElement(By.id("idConfirmar"));
		btn.submit();
		WebElement mensage = webDriver.findElement(By.id("errorMensage"));
		
	    assertEquals(mensage.getText(), "Atenção! usuário já existe!");
		
	}
	
	
}
