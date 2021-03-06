package io.testproject.generated.tests.xattaxuserfunctionality;

import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
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
 * Test: TC_Einv_GEB_001_E-invoice _Generate E-invoice
 * Generated by: Supraja Nauduri (srilakshmi.supraja@sailotech.com)
 * Generated on Tue Dec 14 12:41:26 GMT 2021.
 */
public class Tceinvgeb001einvoicegenerateEinvoice implements  ExceptionsReporter {
  public static WebDriver driver;

  /**
   * username test parameter
   */
  public String username = "";

  /**
   * password test parameter
   */
  public String password = "";

  /**
   * ApplicationURL test parameter
   */
  public String ApplicationURL = "";

  public void execute(WebDriver parentDriver) throws Exception {
    driver = parentDriver;
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Navigate to '{{ApplicationURL}}'
    //    Navigates the specified URL (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.get(ApplicationURL);
    //driver.navigate().to(ApplicationURL);
    System.out.println(ApplicationURL);

    // 2. Click 'username'
    //    Click on username
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@placeholder = 'User Login Id']");
    driver.findElement(by).click();

    // 3. Type '{{username}}' in 'username'
    //    Enter username
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@placeholder = 'User Login Id']");
    driver.findElement(by).sendKeys(username);

    // 4. Click 'password'
    //    Click on password
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@placeholder = 'Password']");
    driver.findElement(by).click();

    // 5. Type '{{password}}' in 'password'
    //    Enter password
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@placeholder = 'Password']");
    driver.findElement(by).sendKeys(password);

    // 6. Click 'Login'
    //    Click on Login Button
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = '\n								Login \n							']");
    driver.findElement(by).click();

    // 7. Click 'Select'
    //    Click on Select Button
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = ' Select']");
    driver.findElement(by).click();

    // 8. Is 'DASHBOARD' present?
    //    Valdate the Dashboard Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = ' DASHBOARD ']");
    driver.findElement(by);

    // 9. Is 'Import e-Invoice' present?
    //    Validate the Import e-Invoice Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = ' Import e-Invoice ']");
    driver.findElement(by);

    // 10. Is 'Generate e-Invoice' present?
    //    Validate the Generate e-Invoice Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = ' Generate e-Invoice ']");
    driver.findElement(by);

    // 11. Is 'e-Invoice Queue' present?
    //    Validate the e-Invoice Queue Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'e-Invoice Queue']");
    driver.findElement(by);

    // 12. Is 'B2C Queue' present?
    //    Validate the B2c Queue Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'B2C Queue']");
    driver.findElement(by);

    // 13. Is 'e-Way bill Queue' present?
    //    Validate the Import e-Way Bill Queue Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'e-Way bill Queue']");
    driver.findElement(by);

    // 14. Is 'Get e-Invoice' present?
    //    Validate the Get e-Invoice Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Get e-Invoice']");
    driver.findElement(by);

    // 15. Is 'Reports' present?
    //    Validate the Reports Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Reports']");
    driver.findElement(by);

    // 16. Is 'Business Partner' present?
    //    Validate the Business Partner  Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = ' Business Partner ']");
    driver.findElement(by);

    // 17. Is 'Manage Items' present?
    //    Validate the Manage Items Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = ' Manage Items ']");
    driver.findElement(by);

    // 18. Is 'Tax Rates' present?
    //    Validate the Tax Rates Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = ' Tax Rates ']");
    driver.findElement(by);

    // 19. Is 'Manage States' present?
    //    Validate the Manage States Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Manage States ']");
    driver.findElement(by);

    // 20. Is 'Manage UQC' present?
    //    Validate the Manage UQC Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Manage UQC ']");
    driver.findElement(by);

    // 21. Is 'Erp File Details' present?
    //    Validate the ERP File Details Menu is Displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Erp File Details']");
    driver.findElement(by);

    // 22. Click 'Generate e-Invoice'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = ' Generate e-Invoice ']");
    driver.findElement(by).click();

    // 23. Is 'e-Invoice' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//h1[. = 'e-Invoice']");
    driver.findElement(by);

    // 24. Is 'Transaction Details' present?
    //    Validate Transaction Details 
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Transaction Details']");
    driver.findElement(by);

    // 25. Is 'Supplier Details' present?
    //    Validate Supplier Details is displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Supplier Details']");
    driver.findElement(by);

    // 26. Is 'Buyer Details' present?
    //    Validate Buyers Details is displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Buyer Details']");
    driver.findElement(by);

    // 27. Is 'Dispatch Details' present?
    //    Validate Dispatch Details is displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Dispatch Details']");
    driver.findElement(by);

    // 28. Is 'Shipping Details' present?
    //    Validate Shipping Details is displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Shipping Details']");
    driver.findElement(by);

    // 29. Is 'E-WayBill Details' present?
    //    Validate E-WayBill Details
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'E-WayBill Details']");
    driver.findElement(by);

    // 30. Is 'Lines Details' present?
    //    Validate Line Details is displayed
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'Lines Details']");
    driver.findElement(by);

    // 31. Is 'UserDefinedFields Details' present?
    //    Validate UserDefinedFields Details
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[. = 'UserDefinedFields Details']");
    driver.findElement(by);

    // 32. Is 'Back To Queue' present?
    //    Validate Back To Queue
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = ' Back To Queue ']");
    driver.findElement(by);

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }
}
