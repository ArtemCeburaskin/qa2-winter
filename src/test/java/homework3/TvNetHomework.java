package homework3;

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

public class TvNetHomework {
    private final String HOME_PAGE_URL = "http://tvnet.lv";
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode = 'primary']");
    private final By ARTICLE_TITLE = By.xpath(".//span[@itemprop='headline name']");
    private final By ARTICLE_TITLE_PAGE = By.xpath(".//h1[@itemprop = 'headline name']");
    private WebDriver browser;

    @Test
    public void titleWork() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        browser = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        browser.manage().window().maximize();

        browser.get(HOME_PAGE_URL);
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();

        List<WebElement> titles = browser.findElements(ARTICLE_TITLE);

        for (int i = 0; i < titles.size(); i++) {
            if (i == 9) {
                String title1 = titles.get(i).getText();
                WebElement title = titles.get(i);
                title.click();
                String title2 = browser.findElement(ARTICLE_TITLE_PAGE).getText();

                if(!title1.equals(title2)) {
                    if(title2.length() == title1.length() + 4 ){
                        String title11 = title1.substring(0, title1.length() - 4);
                        System.out.println(title11.equals(title2));
                        System.out.println("Titles are equal - 1 digit number of comments");
                    }
                    if(title2.length() == title1.length() + 5 ){
                        String title12 = title1.substring(0, title1.length() - 5);
                        System.out.println(title12.equals(title2));
                        System.out.println("Titles are equal - 2 digit number of comments");
                    }
                }else {
                    System.out.println("Titles are equal - no comments at the post");
                }


            }

        }
//    @AfterEach
//    public void closeBrowser() {
//        browser.close();
//
//    }
    }
}