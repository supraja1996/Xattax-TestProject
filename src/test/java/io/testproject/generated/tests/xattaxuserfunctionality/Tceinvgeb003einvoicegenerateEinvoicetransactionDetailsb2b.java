package io.testproject.generated.tests.xattaxuserfunctionality;

import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * This class was automatically generated by TestProject
 * Project: Xattax User Functionality
 * Test: TC_Einv_GEB_003_E-invoice _Generate E-invoice _Transaction Details_B2B
 * Generated by: Supraja Nauduri (srilakshmi.supraja@sailotech.com)
 * Generated on Tue Dec 14 12:41:26 GMT 2021.
 */
public class Tceinvgeb003einvoicegenerateEinvoicetransactionDetailsb2b implements Test, ExceptionsReporter {
  public static WebDriver driver;

  /**
   * ApplicationURL test parameter
   */
  public String ApplicationURL = "http://192.168.1.11/XATTAXEInvoice1.4/";

  /**
   * username test parameter
   */
  public String username = "envuser";

  /**
   * password test parameter
   */
  public String password = "";

  /**
   * dashboard test parameter
   */
  public String dashboard = "";

  /**
   * importEInvoice test parameter
   */
  public String importEInvoice = "";

  /**
   * generatedEInvoicesNumber test parameter
   */
  public String generatedEInvoicesNumber = "";

  /**
   * numberOfEntries test parameter
   */
  public String numberOfEntries = "";

  /**
   * entriesCount test parameter
   */
  public String entriesCount = "";

  /**
   * entriesNumber test parameter
   */
  public String entriesNumber = "";

  /**
   * monthOnDashBoard test parameter
   */
  public String monthOnDashBoard = "";

  /**
   * monthConverted test parameter
   */
  public String monthConverted = "";

  /**
   * monthExtracted test parameter
   */
  public String monthExtracted = "";

  /**
   * yearExtracted test parameter
   */
  public String yearExtracted = "";

  /**
   * SupplyType test parameter
   */
  public String SupplyType = "";

  public void execute(WebDriver parentDriver) throws Exception {
    driver = parentDriver;
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    String string;

    // 1. Is 'supTyp' present?
    //    Validate the Supply Type is displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div/div/div/select");
    driver.findElement(by);

    // 2. Get text from 'supTyp'
    /* Step is disabled
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div/div/div/select");
    string = driver.findElement(by).getAttribute("value");
    SupplyType = String.valueOf(string);
    */
    // 3. Does 'supTyp' contain 'B2B'?
    //    Validate the B2B option is displayed under supply type
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div/div/div/select");
    Assertions.assertTrue(driver.findElement(by).getText().contains("B2B"));

    // 4. Does 'supTyp' contain 'SEZWP'?
    //    Validate the SEZWP option is displayed under supply type
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div/div/div/select");
    Assertions.assertTrue(driver.findElement(by).getText().contains("SEZWP"));

    // 5. Does 'supTyp' contain 'SEZWOP'?
    //    Validate the SEZWOP option is displayed under supply type
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div/div/div/select");
    Assertions.assertTrue(driver.findElement(by).getText().contains("SEZWOP"));

    // 6. Does 'supTyp' contain 'EXPWP'?
    //    Validate the EXPWP option is displayed under supply type
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div/div/div/select");
    Assertions.assertTrue(driver.findElement(by).getText().contains("EXPWP"));

    // 7. Does 'supTyp' contain 'EXPWOP'?
    //    Validate the EXPWOP option is displayed under supply type
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div/div/div/select");
    Assertions.assertTrue(driver.findElement(by).getText().contains("EXPWOP"));

    // 8. Does 'supTyp' contain 'DEXP'?
    //    Validate the DEXP option is displayed under supply type
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div/div/div/select");
    Assertions.assertTrue(driver.findElement(by).getText().contains("DEXP"));

    // 9. Click 'supTyp'
    //    Click on Supply Type
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div/div/div/select");
    driver.findElement(by).click();

    // 10. Select the 'B2B' option in 'supTyp'
    //    Select B2B option  from the list of types
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[4]/div/div/div/select");
    (new Select(driver.findElement(by))).selectByValue("B2B");

    // 11. Is 'invoiceType' present?
    //    Validate the Document Type is displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/select[contains(@id ,\"invoiceType\")]");
    driver.findElement(by);

    // 12. Does 'invoiceType' contain 'Invoice'?
    //    Validate Invocie is displayed under Document Type
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/select[contains(@id ,\"invoiceType\")]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Invoice"));

    // 13. Does 'invoiceType' contain 'Credit Note'?
    //    Validate Credit Note is displayed under Document Type
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/select[contains(@id ,\"invoiceType\")]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Credit Note"));

    // 14. Does 'invoiceType' contain 'Debit Note'?
    //    Validate Debit Note is displayed under Debit Note
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/select[contains(@id ,\"invoiceType\")]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Debit Note"));

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }
}