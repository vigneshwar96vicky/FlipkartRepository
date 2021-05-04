package com.ecommerce.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import edu.emory.mathcs.backport.java.util.Collections;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver driver;

	public static WebDriver launch(String URL) {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities cb = DesiredCapabilities.chrome();
		cb.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
		ChromeOptions opt = new ChromeOptions();
		cb.setCapability(ChromeOptions.CAPABILITY, opt);
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}

	public void buttonClick(WebElement element) {
		element.click();
	}

	public void insertText(WebElement element, String str1) {
		element.sendKeys(str1);
	}

	public void shutDown() {
		driver.quit();
	}

	public void iteratePrice(List<String> model, List<String> price) throws InterruptedException {
		try {
			Thread.sleep(3000);
			List<WebElement> fe = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			for (WebElement ele : fe) {
				String text = ele.getText();
				model.add(text);
			}
			List<WebElement> ft = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			for (WebElement wb : ft) {
				String text = wb.getText();
				String vn = verifyNumber(text);
				price.add(vn);
			}
		} catch (Throwable o) {
			System.out.println(o);
		}
	}

	public String verifyNumber(String z) {
		char[] x1 = z.toCharArray();
		String u = "";
		for (char c : x1) {
			if (Character.isDigit(c)) {
				u = u + c;
			}
		}
		return u;
	}

	public void excelWrite(List<String> model, List<String> price) throws IOException {
		try {
			File pi = new File(
					"E:\\Eclipse Workspace\\ProjectClass\\ProjectFlipkartEcom\\target\\Mobile_Price_2.xlsx ");
			FileOutputStream u = new FileOutputStream(pi);
			XSSFWorkbook j = new XSSFWorkbook();
			XSSFSheet sh = j.createSheet("Mobile and Price");
			XSSFRow rw = sh.createRow(0);
			XSSFCell cell = rw.createCell(0);
			cell.setCellValue("Mobile");
			XSSFCell cell2 = rw.createCell(1);
			cell2.setCellValue("Price");
			for (int i = 0; i < model.size(); i++) {
				XSSFRow rw1 = sh.createRow(i + 1);
				XSSFCell cellval = rw1.createCell(0);
				cellval.setCellValue(model.get(i));
				XSSFCell cellval1 = rw1.createCell(1);
				cellval1.setCellValue(price.get(i));

			}

			j.write(u);
		} catch (Throwable i) {
			System.out.println(i);
		}
	}

	public String lowestPrice(List<String> model2) {
		String p = "";
		try {
			List<Integer> h = new LinkedList<Integer>();
			for (String stg : model2) {
				int parseInt = Integer.parseInt(stg);
				h.add(parseInt);
			}
			Collections.sort(h);
			for (Integer in : h) {
				p = String.valueOf(in);
				return p;
			}
			System.out.println(p);
		} catch (Throwable er) {
			System.out.println("lowest price error " + er);
		}
		return p;
	}

	public void excelRead(List<String> model1, List<String> model2) throws IOException {
		FileInputStream reda = new FileInputStream(
				"E:\\Eclipse Workspace\\ProjectClass\\ProjectFlipkartEcom\\target\\Mobile_Price_2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(reda);
		XSSFSheet sht = wb.getSheetAt(0);
		XSSFRow row1 = sht.getRow(0);
		int lrow = sht.getLastRowNum();
		for (int i = 1; i < lrow + 1; i++) {
			XSSFRow rowA = sht.getRow(i);
			XSSFCell cell = rowA.getCell(0);
			XSSFCell cell1 = rowA.getCell(1);
			String str1 = cell.getStringCellValue();
			String str2 = cell1.getStringCellValue();
			model1.add(str1);
			model2.add(str2);
		}
	}

	public String mobileModel(String st) throws IOException {
		String ty = "";
		FileInputStream reda = new FileInputStream(
				"E:\\Eclipse Workspace\\ProjectClass\\ProjectFlipkartEcom\\target\\Mobile_Price_2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(reda);
		XSSFSheet sht = wb.getSheetAt(0);
		XSSFRow row1 = sht.getRow(0);
		int lrow = sht.getLastRowNum();
		for (int i = 1; i < lrow + 1; i++) {
			XSSFRow rowA = sht.getRow(i);
			XSSFCell cell = rowA.getCell(0);
			XSSFCell cell1 = rowA.getCell(1);
			String str1 = cell.getStringCellValue();
			String str2 = cell1.getStringCellValue();
			if (st.equals(str2)) {
				ty = str1;
				break;
			}
		}
		return ty;
	}

	public void takeShot() throws IOException{
		TakesScreenshot prt = (TakesScreenshot) driver;
		File src = prt.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E://Eclipse Workspace/ProjectClass/ProjectFlipkartEcom/target/SrceenShots/prt.png"));
	}
}
