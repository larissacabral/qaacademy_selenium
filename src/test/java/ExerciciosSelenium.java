import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class ExerciciosSelenium {

    @Test
    public void testesFormularioSelenium() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        //Thread.sleep(3000);

        //close toolbar
        //WebElement adToolbar = wait.until(ExpectedConditions.invisibilityOfAllElements())

        driver.findElement(By.xpath("//section[1]//form[1]/div[1]/div[1]/input[1]")).sendKeys("Larissa");
        driver.findElement(By.xpath("//form[1]/div[1]/div[2]/input[1]")).sendKeys("Cabral");
        driver.findElement(By.xpath("//form[1]//textarea[1]")).sendKeys("Rua dos bobos numero zero");
        driver.findElement(By.xpath("//*/form[1]/div[3]//input[1]")).sendKeys("teste@teste.com");
        driver.findElement(By.xpath("//section[1]//form[1]/div[4]//input[1]")).sendKeys("966478951");
        driver.findElement(By.xpath("//section[@id='section']//form[1]/div[5]/div[1]/label[2]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        Assert.assertTrue("Elemento nao selecionado", driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected());

        //driver.findElement(By.cssSelector("div.col-md-4.col-xs-4.col-sm-4 div:nth-child(2) > label.checks:nth-child(2)"));
        //label[contains(text(),'Movies')]

        Thread.sleep(5000);
        driver.quit();

    }
}
