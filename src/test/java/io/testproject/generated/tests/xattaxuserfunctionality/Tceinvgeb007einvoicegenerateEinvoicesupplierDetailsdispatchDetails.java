package io.testproject.generated.tests.xattaxuserfunctionality;

import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This class was automatically generated by TestProject
 * Project: Xattax User Functionality
 * Test: TC_Einv_GEB_007_E-invoice_Generate E-invoice _Supplier details /Dispatch details
 * Generated by: Supraja Nauduri (srilakshmi.supraja@sailotech.com)
 * Generated on Tue Dec 14 12:41:26 GMT 2021.
 */
public class Tceinvgeb007einvoicegenerateEinvoicesupplierDetailsdispatchDetails implements Test, ExceptionsReporter {
  public static WebDriver driver;

  /**
   * ApplicationURL test parameter
   */
  public String ApplicationURL = "";

  /**
   * username test parameter
   */
  public String username = "";

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

  /**
   * monthOnCalendar test parameter
   */
  public String monthOnCalendar = "";

  /**
   * extractedMonth test parameter
   */
  public String extractedMonth = "";

  /**
   * month test parameter
   */
  public String month = "";

  /**
   * documentNumber test parameter
   */
  public String documentNumber = "";

  /**
   * buyerName test parameter
   */
  public String buyerName = "";

  /**
   * documentDate test parameter
   */
  public String documentDate = "";

  /**
   * supplierLocation test parameter
   */
  public String supplierLocation = "";

  /**
   * buyerGSTIN test parameter
   */
  public String buyerGSTIN = "";

  /**
   * buyerLegalName test parameter
   */
  public String buyerLegalName = "";

  /**
   * buyerLocation test parameter
   */
  public String buyerLocation = "";

  /**
   * placeOfSupply test parameter
   */
  public String placeOfSupply = "1";

  /**
   * buyerAddress test parameter
   */
  public String buyerAddress = "";

  /**
   * buyerState test parameter
   */
  public String buyerState = "3";

  /**
   * itemDesc test parameter
   */
  public String itemDesc = "";

  /**
   * isService test parameter
   */
  public String isService = "";

  /**
   * hsnCode test parameter
   */
  public String hsnCode = "";

  /**
   * qty test parameter
   */
  public String qty = "";

  /**
   * itemPrice test parameter
   */
  public String itemPrice = "";

  /**
   * gstRate test parameter
   */
  public String gstRate = "";

  /**
   * buyerPincode test parameter
   */
  public String buyerPincode = "";

  public void execute(WebDriver parentDriver) throws Exception {
    driver = parentDriver;
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Click 'Generate e-Invoice'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = ' Generate e-Invoice ']");
    driver.findElement(by).click();

    // 2. Is 'Dispatch Details' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Dispatch Details']");
    driver.findElement(by);

    // 3. Is 'Dispatch Company Name' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text() = \"Dispatch Company Name\"]");
    driver.findElement(by);

    // 4. Is 'Dispatch Location' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text() = \"Dispatch Location\"]");
    driver.findElement(by);

    // 5. Is 'Dispatch StateCode' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Dispatch StateCode ']");
    driver.findElement(by);

    // 6. Is 'Dispatch Pincode' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Dispatch Pincode']");
    driver.findElement(by);

    // 7. Is 'Dispatch Address' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Dispatch Address']");
    driver.findElement(by);

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }
}
