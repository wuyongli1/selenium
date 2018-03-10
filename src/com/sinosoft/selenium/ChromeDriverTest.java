package com.sinosoft.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeDriverTest {
	public static void main(String[] args) throws Exception {
		// chromedrver2.35 chrome64 selenium3.9.1 jdk1.8
		System.setProperty("webdriver.chrome.driver", "chromedriver2_35.exe");
		// 初始化driver
		WebDriver driver = new ChromeDriver();
		// 访问人保手机版首页
		driver.get("https://www.epicc.com.cn/m");
		Thread.sleep(2000);
		// 定位到"立即报价"按钮并点击
		WebElement immediateOffer = driver.findElement(By.className("immediate-offer"));
		immediateOffer.click();
		Thread.sleep(2000);
		// 点击选择行驶城市
		driver.switchTo().frame("showIframecarIndexNew");
		WebElement citynameS = driver.findElement(By.id("citynameS"));
		citynameS.click();
		Thread.sleep(2000);
		/*
		 * 点击输入鞍山并选择  ps注意需要切换到iframe
		 */
		driver.switchTo().frame("overPageIframe");
		WebElement onlynum = driver.findElement(By.id("onlynum"));
		onlynum.click();
		Thread.sleep(300);
		onlynum.sendKeys("鞍山");
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country_0\"]/a"));
		country.click();
		Thread.sleep(1000);
		/*
		 * 选择车牌，输入手机号码并点击获取验证码
		 */
		driver.switchTo().frame("showIframecarIndexNew");
		//手动输入车牌
		/*WebElement license = driver.findElement(By.id("license"));
		license.sendKeys("A123");*/
		//新车未上牌
		WebElement inpu_checkbox = driver.findElement(By.id("inpu_checkbox"));
		inpu_checkbox.click();
		WebElement mobile_phone = driver.findElement(By.id("mobile_phone"));
		mobile_phone.sendKeys("18501966251");
		WebElement getRandCode = driver.findElement(By.id("getRandCode"));
		getRandCode.click();
		Thread.sleep(15000);
		WebElement carIndexToVehicleInformation = driver.findElement(By.id("carIndexToVehicleInformation"));
		carIndexToVehicleInformation.click();
	}

	/*public static void switchToNewWindow(WebDriver driver) {
		// 得到当前句柄
		String currentWindow = driver.getWindowHandle();
		// 得到所有窗口的句柄
		Set<String> handles = driver.getWindowHandles();
		// 排除当前窗口的句柄，则剩下是新窗口
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			if (currentWindow == it.next())
				continue;
			driver.switchTo().window(it.next());
		}
	}*/
}
