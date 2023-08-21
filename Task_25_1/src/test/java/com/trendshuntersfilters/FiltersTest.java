package com.trendshuntersfilters;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FiltersTest {
    private WebDriver driver;

    //<editor-fold desc = "Filters locators">
    private static final By navbarForHer = By.xpath("//ul[@class='main-nav flex']//a[@href='https://trends-hunters.com/ua/dlya-neyi/']");
    private static final By categoriesBags = By.xpath("//div[@class='sub_categories filter-checkboxes flex']//a[@href='https://trends-hunters.com/dlya-neyo/113-1-sumki/']");
    private static final By bagsRucksacks = By.xpath("//ul[@class='two_list']//a[@href='https://trends-hunters.com/dlya-neyo/113-1-sumki/166-1-ryukzaki/']");
    private static final By productTitle = By.xpath("//div[@class='product-title']");
    private static final By productPriceFilter = By.xpath("//div[@class='filter-title ocf-option-name ocfilter-price_block']//div[@class='current-currency current-option']");
    private static final By productPriceOptionEuro = By.xpath("//div[@class='filter-title ocf-option-name ocfilter-price_block']//li[@data-name='EUR']");
    private static final By productPrice = By.xpath("//div[@class='product-price uppercase']");

    //</editor-fold>
    @BeforeMethod
    public void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://trends-hunters.com/ua");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testFiltersRucksack() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(300));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(navbarForHer)));
        driver.findElement(navbarForHer).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(productTitle)));
        driver.findElement(categoriesBags).click();
        driver.findElement(bagsRucksacks).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(productTitle)));
        Assert.assertTrue(driver.findElement(productTitle).isDisplayed());
        List<WebElement> productType = driver.findElements(productTitle);
        Assert.assertTrue(productType.stream().map(WebElement::getText)
                .allMatch(p -> p.contains("Рюкзак")));
    }

    @Test
    public void testFiltersPricesInEuro() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(300));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(navbarForHer)));
        driver.findElement(navbarForHer).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(productPriceFilter)));
        driver.findElement(productPriceFilter).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(productPriceOptionEuro)));
        driver.findElement(productPriceOptionEuro).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(productTitle)));
        Assert.assertTrue(driver.findElement(productTitle).isDisplayed());
        List<WebElement> productPrices = driver.findElements(productPrice);
        Assert.assertTrue(productPrices.stream().map(WebElement::getText)
                .allMatch(p -> p.contains("€")));
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After each test");
        driver.quit();
    }

    @AfterClass
    public static void close() {
        System.out.println("All tests were finished");
    }
}
