package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupsCreationTests {
    private WebDriver wb;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "G:\\Java\\chromedriver.exe");
        loginLocalhost("admin", "secret");
    }

    private void loginLocalhost(String user, String password) {
        wb = new ChromeDriver();
        wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goToGroupPage("http://localhost/addressbook");
        wb.findElement(By.name("user")).clear();
        wb.findElement(By.name("user")).sendKeys(user);
        wb.findElement(By.name("pass")).clear();
        wb.findElement(By.name("pass")).sendKeys(password);
        wb.findElement(By.id("LoginForm")).submit();
    }

    @Test
    public void testGroupsCreation() throws Exception {
        goToGroupPage("http://localhost/addressbook/group.php");
        initGroupCreation();
        fillGroupForm(new GroupData("test2", "", ""));
        submitGroupCreation();
        returnTiGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test2", "test2", "test2"));
        submitGroupCreation();
        returnTiGroupPage();

    }

    private void returnTiGroupPage() {
        wb.findElement(By.linkText("group page")).click();
    }

    private void submitGroupCreation() {
        wb.findElement(By.name("submit")).click();
    }


    private void fillGroupForm(GroupData groupData) {
        wb.findElement(By.name("group_name")).click();
        wb.findElement(By.name("group_name")).clear();
        wb.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wb.findElement(By.name("group_header")).click();
        wb.findElement(By.name("group_header")).clear();
        wb.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wb.findElement(By.name("group_footer")).clear();
        wb.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    private void initGroupCreation() {
        wb.findElement(By.name("new")).click();
    }

    private void goToGroupPage(String s) {
        wb.get(s);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        wb.findElement(By.linkText("Logout")).click();
        wb.quit();
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
