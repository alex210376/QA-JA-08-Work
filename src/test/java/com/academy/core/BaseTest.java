package com.academy.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected String baseUrl;
    protected Properties properties;

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional("firefox") String browser) throws IOException {
        properties = new Properties();
        // вычитываем файл *.properties из директории <root>/src/main/java/resources
        properties.load(this.getClass().getClassLoader().getResourceAsStream("common.properties"));
        baseUrl = properties.getProperty("baseUrl");
        // Инициализируем драйвер
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.driver"));
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", properties.getProperty("firefox.driver"));
                driver = new FirefoxDriver();
                break;

            case "opera":
                System.setProperty("webdriver.opera.driver", properties.getProperty("opera.driver"));
                driver = new OperaDriver();
                break;
        }

        // Неявное ожидание (Implicit Waits)
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
