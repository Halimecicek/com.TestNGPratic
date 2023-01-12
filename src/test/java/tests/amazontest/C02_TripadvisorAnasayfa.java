package tests.amazontest;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TripadvisorPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_TripadvisorAnasayfa {
    @Test
    public void test01(){
        // Tripadvisor a anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("tripadvisorUrl"));
        //arama butonuna tikla floransayi arat
        WebElement aramaKutusu=Driver.getDriver().findElement(By.xpath("(//input[@title='Search'])[2]"));
        Actions actions=new Actions(Driver.getDriver());
        TripadvisorPage tripadvisorPage =new TripadvisorPage();
        // actions.click(tripadvisorPage.AramaKutusu).sendKeys("floransa"+ Keys.ENTER).perform();
       // WebElement sonucYaziElementi=Driver.getDriver().findElement(By.xpath("(//span[@class='title-match'])[1]"));

        // cikan sonuclarin floransa icerdigini test et
        String acturalKelime=(tripadvisorPage.sonucYaziElementi).getText();
        String expectedKelime="floransa";
        Assert.assertTrue(acturalKelime.contains(expectedKelime));
        // floransa aramasinda hotels sitesine git
        WebElement hotel=Driver.getDriver().findElement(By.xpath("//a[@data-tab-name='Hotels']"));
        actions.click(hotel).perform();

        // sayfayi kapat
        Driver.closeDriver();


    }


}
