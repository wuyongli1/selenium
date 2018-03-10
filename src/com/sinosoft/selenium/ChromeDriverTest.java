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
		// ��ʼ��driver
		WebDriver driver = new ChromeDriver();
		// �����˱��ֻ�����ҳ
		driver.get("https://www.epicc.com.cn/m");
		Thread.sleep(2000);
		// ��λ��"��������"��ť�����
		WebElement immediateOffer = driver.findElement(By.className("immediate-offer"));
		immediateOffer.click();
		Thread.sleep(2000);
		// ���ѡ����ʻ����
		driver.switchTo().frame("showIframecarIndexNew");
		WebElement citynameS = driver.findElement(By.id("citynameS"));
		citynameS.click();
		Thread.sleep(2000);
		/*
		 * ������배ɽ��ѡ��  psע����Ҫ�л���iframe
		 */
		driver.switchTo().frame("overPageIframe");
		WebElement onlynum = driver.findElement(By.id("onlynum"));
		onlynum.click();
		Thread.sleep(300);
		onlynum.sendKeys("��ɽ");
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country_0\"]/a"));
		country.click();
		Thread.sleep(1000);
		/*
		 * ѡ���ƣ������ֻ����벢�����ȡ��֤��
		 */
		driver.switchTo().frame("showIframecarIndexNew");
		//�ֶ����복��
		/*WebElement license = driver.findElement(By.id("license"));
		license.sendKeys("A123");*/
		//�³�δ����
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
		// �õ���ǰ���
		String currentWindow = driver.getWindowHandle();
		// �õ����д��ڵľ��
		Set<String> handles = driver.getWindowHandles();
		// �ų���ǰ���ڵľ������ʣ�����´���
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			if (currentWindow == it.next())
				continue;
			driver.switchTo().window(it.next());
		}
	}*/
}
