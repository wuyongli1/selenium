package com.sinosoft.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest2 {
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
		 * 点击输入城市名并选择 
		 */
		driver.switchTo().frame("overPageIframe");
		WebElement onlynum = driver.findElement(By.id("onlynum"));
		onlynum.click();
		Thread.sleep(300);
		onlynum.sendKeys("桂林");
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country_0\"]/a"));
		country.click();
		Thread.sleep(1000);
		/*
		 * 选择车牌，输入手机号码并点击获取验证码
		 */
		//输入手机号码
		WebElement c_field = driver.findElement(By.className("c-field"));
		c_field.sendKeys("18501966251");
		//点击获取验证码
		WebElement code__button = driver.findElement(By.className("code__button"));
		code__button.click();
		Thread.sleep(15000);
		//点击到下一步
		List<WebElement> nextstep = driver.findElements(By.className("home__button--nextstep"));
		nextstep.get(0).click();
		Thread.sleep(5000);
		//输入车辆识别码/车架号
		List<WebElement> c_fields = driver.findElements(By.className("c-field"));
		c_fields.get(0).sendKeys("HFLAHFLDJHLAHFLHA");
		Thread.sleep(1000);
		//输入发动机号码
		c_fields.get(2).sendKeys("FAHAKHFALKH");
		
		//选择品牌型号
		WebElement ellipsis = driver.findElement(By.className("u-ellipsis-2"));
		ellipsis.click();
		Thread.sleep(1000);
		List<WebElement> brand_hot__link = driver.findElements(By.className("brand-hot__link"));
		brand_hot__link.get(0).click();
		Thread.sleep(1000);
		List<WebElement> brand_body_link = driver.findElements(By.className("brand-body__link"));
		brand_body_link.get(0).click();
		Thread.sleep(1000);
		List<WebElement> series_field = driver.findElements(By.className("series-field"));
		series_field.get(0).click();
		Thread.sleep(1000);
		List<WebElement> series_field_c = driver.findElements(By.className("series-popup-card__item"));
		series_field_c.get(1).click();
		Thread.sleep(1000);
		
		//选择注册日期
		List<WebElement> carinfo = driver.findElements(By.className("carinfo-grid__text"));
		carinfo.get(1).click();
		Thread.sleep(1000);
		List<WebElement> car_datetime = driver.findElements(By.className("car-datetime-confirm"));
		car_datetime.get(1).click();
		
		//输入被保险人姓名
		List<WebElement> c_fields1 = driver.findElements(By.className("c-field"));
		c_fields1.get(7).sendKeys("张三");
		c_fields1.get(8).sendKeys("513426199402180112");
		
		//点击获取报价
		WebElement carinfo_commit = driver.findElement(By.className("carinfo-button--submit"));
		carinfo_commit.click();
		Thread.sleep(11000);
		WebElement money_Element = driver.findElement(By.className("monney"));
		String money = money_Element.getText();
		System.out.println(money);
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