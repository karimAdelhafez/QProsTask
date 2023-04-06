package com.tv.jawwy.subscribe.testcases;

import com.tv.jawwy.subscribe.base.BaseTest;
import com.tv.jawwy.subscribe.pages.PackagesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UaePackagesTest extends BaseTest {
    @Test
    public void CheckPackage1Info(){

       //Loading the site and Select Country >>>builder pattern
       PackagesPage packagesPage =new PackagesPage(driver);
       packagesPage.load().ChangeCountry("ae-contry-lable");

        //check package1 name
        String package1name = packagesPage.checkPackageName("name-لايت").getText();
        Assert.assertEquals(package1name,"لايت");
       // Check Package1 Currency
        String package1currency= packagesPage.CheckCurrency("//div[@id='currency-لايت']/i").getText();
        Assert.assertEquals(package1currency,"دولار أمريكي/شهر");

        //Check Package1 Price
        String package1Price = packagesPage.CheckPrice("//div[@id='currency-لايت']/b").getText();
        Assert.assertEquals(package1Price, "5.4");

}


    @Test
    public void CheckPackage2Info(){

        //Loading the site and Select Country >>>builder pattern
        PackagesPage packagesPage =new PackagesPage(driver);
        packagesPage.load().ChangeCountry("ae-contry-lable");

        //check package2 name
        String package2name = packagesPage.checkPackageName("name-الأساسية").getText();
        Assert.assertEquals(package2name,"الأساسية");
        // Check Package12Currency
        String package2currency= packagesPage.CheckCurrency("//div[@id='currency-الأساسية']/i").getText();
        Assert.assertEquals(package2currency,"دولار أمريكي/شهر");

        //Check Package2 Price
        String package2price = packagesPage.CheckPrice("//div[@id='currency-الأساسية']/b").getText();
        Assert.assertEquals(package2price , "10.9");

    }
    @Test
    public void CheckPackage3Info(){

        //Loading the site and Select Country >>>builder pattern
        PackagesPage packagesPage =new PackagesPage(driver);
        packagesPage.load().ChangeCountry("ae-contry-lable");

        //check package3 name
        String package3name = packagesPage.checkPackageName("name-بريميوم").getText();
        Assert.assertEquals(package3name,"بريميوم");
        // Check Package3 Currency
        String package3currency = packagesPage.CheckCurrency("//div[@id='currency-بريميوم']/i").getText();
        Assert.assertEquals(package3currency,"دولار أمريكي/شهر");

        //Check Package3 Price
        String package3price = packagesPage.CheckPrice("//div[@id='currency-بريميوم']/b").getText();
        Assert.assertEquals(package3price , "16.3");

    }

}
