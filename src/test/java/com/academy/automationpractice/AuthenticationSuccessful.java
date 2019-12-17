package com.academy.automationpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import org.testng.Assert;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AuthenticationSuccessful {

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
    public void auth() throws IOException {
        Properties properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream("common.properties"));

        driver.get(baseUrl);
        WebElement signIn = driver.findElement(By.linkText("Sign in"));
        signIn.click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(properties.getProperty("login"));
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(properties.getProperty("password"));
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();
        //Получаем имя пользователя
        String customerAccount = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span")).getText();
        //Сравниваем полученное имя пользователя с ожидаемым
        Assert.assertEquals(customerAccount, "Oleksandr Stovbenko");
        // Выполняем выход, нажав в верхнем меню элемент Sign out
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}


