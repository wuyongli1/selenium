package com.sinosoft.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeDriverTest2 {
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
		 * ��������������ѡ�� 
		 */
		driver.switchTo().frame("overPageIframe");
		WebElement onlynum = driver.findElement(By.id("onlynum"));
		onlynum.click();
		Thread.sleep(300);
		onlynum.sendKeys("����");
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country_0\"]/a"));
		country.click();
		Thread.sleep(1000);
		/*
		 * ѡ���ƣ������ֻ����벢�����ȡ��֤��
		 */
		//�����ֻ�����
		WebElement c_field = driver.findElement(By.className("c-field"));
		c_field.sendKeys("18501966251");
		//�����ȡ��֤��
		WebElement code__button = driver.findElement(By.className("code__button"));
		code__button.click();
		Thread.sleep(15000);
		//�������һ��
		List<WebElement> nextstep = driver.findElements(By.className("home__button--nextstep"));
		nextstep.get(0).click();
		Thread.sleep(5000);
		//���복��ʶ����/���ܺ�
		List<WebElement> c_fields = driver.findElements(By.className("c-field"));
		c_fields.get(0).sendKeys("HFLAHFLDJHLAHFLHA");
		Thread.sleep(1000);
		//���뷢��������
		c_fields.get(2).sendKeys("FAHAKHFALKH");
		
		//ѡ��Ʒ���ͺ�
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
		
		//ѡ��ע������
		List<WebElement> carinfo = driver.findElements(By.className("carinfo-grid__text"));
		carinfo.get(1).click();
		Thread.sleep(1000);
		List<WebElement> car_datetime = driver.findElements(By.className("car-datetime-confirm"));
		car_datetime.get(1).click();
		
		//���뱻����������
		List<WebElement> c_fields1 = driver.findElements(By.className("c-field"));
		c_fields1.get(7).sendKeys("����");
		c_fields1.get(8).sendKeys("513426199402180112");
		
		//�����ȡ����
		WebElement carinfo_commit = driver.findElement(By.className("carinfo-button--submit"));
		carinfo_commit.click();
		Thread.sleep(11000);
		WebElement money_Element = driver.findElement(By.className("monney"));
		String money = money_Element.getText();
		System.out.println(money);
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
