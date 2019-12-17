package com.academy.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class FilterTest {

    private WebDriver driver;
    private String baseUrl;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws IOException {
        Properties properties = new Properties();
        // вычитываем файл *.properties из директории <root>/src/main/java/resources
        properties.load(this.getClass().getClassLoader().getResourceAsStream("common.properties"));
        // Инициализируем драйвер Chrome
        System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.driver"));
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        baseUrl = properties.getProperty("baseUrl");
        // Неявное ожидание (Implicit Waits)
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test
    public void testCategoryWomen() {
        driver.get(baseUrl);
        // Клик по пункту 'WOMEN'
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")).click();
        driver.findElement(By.id("layered_id_attribute_group_1")).click();
        driver.findElement(By.id("layered_id_feature_5")).click();

    }
}
