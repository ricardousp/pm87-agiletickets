package br.com.caelum.agiletickets.acceptance;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
	
	
	@Test
	public void buscaFuncionario(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com.br");
		WebElement txt = driver.findElement(By.name("q"));
		txt.sendKeys("3 libertadores");
		txt.submit();
		Assert.assertTrue(driver.getPageSource().contains("SPFC"));
		Assert.assertTrue(driver.getPageSource().contains("Corinthians"));
		driver.close();
	}
	
	
	
}
