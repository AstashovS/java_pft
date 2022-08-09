package ru.stqa.pft.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ContactCreationTests {
    private WebDriver wb;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "G:\\Java\\chromedriver.exe");
        loginLocalhost("admin", "secret");
    }


    @Test
    public void testContactCreation() throws Exception {
        goToPage("http://localhost/addressbook/edit.php");
        File photo = new File("src/test/resources/2ce2530f66e600a020c12b0c60c5e9e2.png");
        fillContactData(new ContactData("Sergey", "Vi", "Astashov", "AstSer", "Kek",photo.getAbsolutePath(), "Company", "Moscow, default address", "42", "+79771234562", "+323145"));
        submitContactCreation();
        returnToHomePage();
    }

    private void returnToHomePage() {
        wb.findElement(By.linkText("home page")).click();
    }

    private void submitContactCreation() {
        wb.findElement(By.name("submit")).click();
    }

    private void fillContactData(ContactData contactData) {
        wb.findElement(By.name("firstname")).click();
        wb.findElement(By.name("firstname")).clear();
        wb.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        wb.findElement(By.name("middlename")).clear();
        wb.findElement(By.name("middlename")).sendKeys(contactData.getMiddleName());
        wb.findElement(By.name("lastname")).clear();
        wb.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
        wb.findElement(By.name("nickname")).clear();
        wb.findElement(By.name("nickname")).sendKeys(contactData.getNickname());
        WebElement chooseFile = wb.findElement(By.xpath("//*[@id=\"content\"]/form/input[7]"));                      //name("photo") //*[@id="content"]/form/input[7]
        chooseFile.sendKeys(contactData.getPhoto());
        wb.findElement(By.name("title")).clear();
        wb.findElement(By.name("title")).sendKeys(contactData.getTitle());
        wb.findElement(By.name("company")).clear();
        wb.findElement(By.name("company")).sendKeys(contactData.getCompany());
        wb.findElement(By.name("address")).clear();
        wb.findElement(By.name("address")).sendKeys(contactData.getAddress());
        wb.findElement(By.name("home")).clear();
        wb.findElement(By.name("home")).sendKeys(contactData.getHomePhoneNumber());
        wb.findElement(By.name("mobile")).clear();
        wb.findElement(By.name("mobile")).sendKeys(contactData.getMobilePhoneNumber());
        wb.findElement(By.name("work")).clear();
        wb.findElement(By.name("work")).sendKeys(contactData.getWorkPhoneNumber());
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        wb.findElement(By.linkText("Logout")).click();
        wb.quit();
    }

    private void goToPage(String s) {
        wb.get(s);
    }
    private void loginLocalhost(String user, String password) {
        wb = new ChromeDriver();
        wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goToPage("http://localhost/addressbook");
        wb.findElement(By.name("user")).clear();
        wb.findElement(By.name("user")).sendKeys(user);
        wb.findElement(By.name("pass")).clear();
        wb.findElement(By.name("pass")).sendKeys(password);
        wb.findElement(By.id("LoginForm")).submit();
    }

    private boolean isElementPresent(By by) {
        try {
            wb.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wb.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

}



