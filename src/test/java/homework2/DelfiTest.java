package homework2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DelfiTest {
    private final String HOME_PAGE_URL = "https://delfi.lv";
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode = 'primary']");
  //private final By CLOSE_ADVER = By.xpath(".//div[@class ='Adform-closeButton']");
    private final By ARTICLE_TITLE = By.xpath("//h1[@class='text-size-19 text-sm-size-16 text-size-md-17 mb-0 mt-2 headline__title']");
    private final By ARTICLE_TITLE_AFTER_CLICK = By.xpath("//h1[@class='text-size-22 text-size-md-30 d-inline']");
    private final By ARTICLE_COMMENT_BTN = By.xpath("//p[@class='text-counter text-white position-absolute']");
    private final By ARTICLE_COMMENT_TITLE =By.xpath("//h1[@class='article-title']");
  //private final By TEST_BTN = By.xpath("//*[@id=\"portal-main-content\"]/section[1]/div[2]/div[1]/div[4]/article[1]/div/span/a[1]/h1");
    private WebDriver browser;
    @Test
    public void titleCheck(){
        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
        browser = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();

/*      FOR IFRAMES
        browser.switchTo().frame("frontTarget");
        browser.findElement(CLOSE_ADVER).click();
        browser.switchTo().frame(0);
        wait.until(ExpectedConditions.elementToBeClickable(TEST_BTN));
        browser.findElement(TEST_BTN).click();
*/
        String title1 = browser.findElement(ARTICLE_TITLE).getText();
        WebElement firstTitle = browser.findElement(ARTICLE_TITLE);


        System.out.println(firstTitle.getText());
        browser.findElement(ARTICLE_TITLE).click();
        String title2 = browser.findElement(ARTICLE_TITLE_AFTER_CLICK).getText();
        WebElement secondTitle = browser.findElement(ARTICLE_TITLE_AFTER_CLICK);

        System.out.println(secondTitle.getText());
        System.out.println(firstTitle.equals(secondTitle));

        System.out.println(title1);
        System.out.println(title2);
        System.out.println(title1.equals(title2));

        browser.findElement(ARTICLE_COMMENT_BTN).click();
        WebElement thirdTitle = browser.findElement(ARTICLE_COMMENT_TITLE);
        String title3 = browser.findElement(ARTICLE_COMMENT_TITLE).getText();
        System.out.println(thirdTitle);
        System.out.println(title3);

        System.out.println(title1.equals(title3));
        System.out.println(title2.equals(title3));

//      ALL DELFI TITLE OUTPUT
        browser.get(HOME_PAGE_URL);





    }
/*
    @AfterEach
    public void closeBrowser() {
        browser.close();

    }
*/
}
