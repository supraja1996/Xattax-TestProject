package io.testproject.generated.tests.xattaxuserfunctionality;

import io.testproject.sdk.drivers.ReportType;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.ChromeDriver;

import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;

import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class was automatically generated by TestProject
 * Project: Xattax User Functionality
 * Test: Generate E-Invoice
 * Generated by: Supraja Nauduri (srilakshmi.supraja@sailotech.com)
 * Generated on Tue Dec 14 12:41:26 GMT 2021.
 */
@DisplayName("Generate E-Invoice")
public class GenerateEinvoice implements  ExceptionsReporter {
  public static WebDriver driver;
  public static String jenkinsBuildNumber = System.getenv("BUILD_NUMBER");
 	public static String jenkinsJobName = System.getenv("JOB_NAME");

  @BeforeAll
  static void setup() throws Exception {
	
   driver = new RemoteWebDriver("485ADbMTeysP1AL-PwaL67ppVoIEzGWDj9mRJzCDYUA1", new ChromeOptions(), "Xattax User Functionality", "Generate E-Invoice");
  // driver = new ChromeDriver("485ADbMTeysP1AL-PwaL67ppVoIEzGWDj9mRJzCDYUA1", new ChromeOptions(), "Xattax User Functionality");
  System.out.println("Build Number:"+jenkinsBuildNumber);
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("Generate E-Invoice")
  @ParameterizedTest
  //@MethodSource("provideParameters")
  @CsvFileSource(resources = "/TestData.csv",numLinesToSkip = 1)
  void execute(String ApplicationURL, String buyerAddress,	String buyerGSTIN, String buyerLegalName, String buyerLocation, String buyerName, String buyerState, String buyerPincode, String dashboard,String documentDate, String documentNumber, String entriesCount, String entriesNumber, String extractedMonth, String generatedEInvoicesNumber, String gstRate, String hsnCode, String importEInvoice, String isService, String itemDesc, String itemPrice, String month, String monthConverted, String monthExtracted, String monthOnCalendar, String monthOnDashBoard, String numberOfEntries, String password, String placeOfSupply, String qty, String SupplierPincode, String supplierLocation, String SupplyType, String username, String yearExtracted) throws Exception {
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    Tceinvgeb001einvoicegenerateEinvoice tceinvgeb001einvoicegenerateeinvoice;
    // 1. E-invoice _Generate E-invoice
    GeneratedUtils.sleep(500);
    tceinvgeb001einvoicegenerateeinvoice = new Tceinvgeb001einvoicegenerateEinvoice();
    tceinvgeb001einvoicegenerateeinvoice.username = username;
    tceinvgeb001einvoicegenerateeinvoice.password = password;
    tceinvgeb001einvoicegenerateeinvoice.ApplicationURL = ApplicationURL;
    tceinvgeb001einvoicegenerateeinvoice.execute(driver);
  }
  @DisplayName("Generate E-Invoice Transaction Details")
  @ParameterizedTest
 // @MethodSource("provideParameters")
  @CsvFileSource(resources = "/TestData.csv",numLinesToSkip = 1)
  void execute1(String ApplicationURL, String buyerAddress, String buyerGSTIN, String buyerLegalName, String buyerLocation, String buyerName, String buyerState, String buyerPincode, String dashboard, String documentDate, String documentNumber, String entriesCount, String entriesNumber, String extractedMonth, String generatedEInvoicesNumber, String gstRate, String hsnCode, String importEInvoice, String isService, String itemDesc, String itemPrice, String month, String monthConverted, String monthExtracted, String monthOnCalendar, String monthOnDashBoard, String numberOfEntries, String password, String placeOfSupply, String qty, String SupplierPincode, String supplierLocation, String SupplyType, String username, String yearExtracted) throws Exception {
  // 2. E-invoice _Generate E-invoice _Transaction Details
  	Tceinvgeb002einvoicegenerateEinvoicetransactionDetails tceinvgeb002einvoicegenerateeinvoicetransactiondetails;
  	GeneratedUtils.sleep(500);
  tceinvgeb002einvoicegenerateeinvoicetransactiondetails = new Tceinvgeb002einvoicegenerateEinvoicetransactionDetails();
  tceinvgeb002einvoicegenerateeinvoicetransactiondetails.ApplicationURL = ApplicationURL;
  tceinvgeb002einvoicegenerateeinvoicetransactiondetails.password = password;
  tceinvgeb002einvoicegenerateeinvoicetransactiondetails.username = username;
  tceinvgeb002einvoicegenerateeinvoicetransactiondetails.dashboard = dashboard;
  tceinvgeb002einvoicegenerateeinvoicetransactiondetails.importEInvoice = importEInvoice;
  tceinvgeb002einvoicegenerateeinvoicetransactiondetails.execute(driver);
  }
  @DisplayName("E-invoice _Generate E-invoice _Transaction Details_B2B")
  @ParameterizedTest
 // @MethodSource("provideParameters")
  @CsvFileSource(resources = "/TestData.csv",numLinesToSkip = 1)
  void execute2(String ApplicationURL, String buyerAddress, String buyerGSTIN, String buyerLegalName, String buyerLocation, String buyerName, String buyerState, String buyerPincode, String dashboard, String documentDate, String documentNumber, String entriesCount, String entriesNumber, String extractedMonth, String generatedEInvoicesNumber, String gstRate, String hsnCode, String importEInvoice, String isService, String itemDesc, String itemPrice, String month, String monthConverted, String monthExtracted, String monthOnCalendar, String monthOnDashBoard, String numberOfEntries, String password, String placeOfSupply, String qty, String SupplierPincode, String supplierLocation, String SupplyType, String username, String yearExtracted) throws Exception {
  	Tceinvgeb003einvoicegenerateEinvoicetransactionDetailsb2b tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b;
  // 3. E-invoice _Generate E-invoice _Transaction Details_B2B
  GeneratedUtils.sleep(500);
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b = new Tceinvgeb003einvoicegenerateEinvoicetransactionDetailsb2b();
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.ApplicationURL = ApplicationURL;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.username = username;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.password = password;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.dashboard = dashboard;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.importEInvoice = importEInvoice;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.generatedEInvoicesNumber = generatedEInvoicesNumber;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.numberOfEntries = numberOfEntries;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.entriesCount = entriesCount;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.entriesNumber = entriesNumber;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.monthOnDashBoard = monthOnDashBoard;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.monthConverted = monthConverted;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.monthExtracted = monthExtracted;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.yearExtracted = yearExtracted;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.SupplyType = SupplyType;
  tceinvgeb003einvoicegenerateeinvoicetransactiondetailsb2b.execute(driver);
  }
  @DisplayName("E-invoice _Generate E-invoice _Transaction Details_B2B_Invoice")
  @ParameterizedTest
 // @MethodSource("provideParameters")
  @CsvFileSource(resources = "/TestData.csv",numLinesToSkip = 1)
  void execute3(String ApplicationURL, String buyerAddress, String buyerGSTIN, String buyerLegalName, String buyerLocation, String buyerName, String buyerState, String buyerPincode, String dashboard, String documentDate, String documentNumber, String entriesCount, String entriesNumber, String extractedMonth, String generatedEInvoicesNumber, String gstRate, String hsnCode, String importEInvoice, String isService, String itemDesc, String itemPrice, String month, String monthConverted, String monthExtracted, String monthOnCalendar, String monthOnDashBoard, String numberOfEntries, String password, String placeOfSupply, String qty, String SupplierPincode, String supplierLocation, String SupplyType, String username, String yearExtracted) throws Exception {
  // 4. E-invoice _Generate E-invoice _Transaction Details_B2B_Invoice
  Tceinvgeb004einvoicegenerateEinvoicetransactionDetailsb2binvoice tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice;
  GeneratedUtils.sleep(500);
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice = new Tceinvgeb004einvoicegenerateEinvoicetransactionDetailsb2binvoice();
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.ApplicationURL = ApplicationURL;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.username = username;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.password = password;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.dashboard = dashboard;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.importEInvoice = importEInvoice;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.generatedEInvoicesNumber = generatedEInvoicesNumber;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.numberOfEntries = numberOfEntries;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.entriesCount = entriesCount;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.entriesNumber = entriesNumber;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.monthOnDashBoard = monthOnDashBoard;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.monthConverted = monthConverted;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.monthExtracted = monthExtracted;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.yearExtracted = yearExtracted;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.SupplyType = SupplyType;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.monthOnCalendar = monthOnCalendar;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.extractedMonth = extractedMonth;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.month = month;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.documentNumber = documentNumber;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.buyerName = buyerName;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.documentDate = documentDate;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.supplierLocation = supplierLocation;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.buyerGSTIN = buyerGSTIN;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.placeOfSupply = placeOfSupply;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.buyerLocation = buyerLocation;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.buyerAddress = buyerAddress;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.buyerPincode = buyerPincode;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.buyerState = buyerState;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.itemDesc = itemDesc;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.isService = isService;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.hsnCode = hsnCode;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.qty = qty;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.itemPrice = itemPrice;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.gstRate = gstRate;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.SupplierPincode = SupplierPincode;
  tceinvgeb004einvoicegenerateeinvoicetransactiondetailsb2binvoice.execute(driver);
  }
  @DisplayName("E-invoice _Generate E-invoice _Transaction Details_B2B_Credit note")
  @ParameterizedTest
 // @MethodSource("provideParameters")
  @CsvFileSource(resources = "/TestData.csv",numLinesToSkip = 1)
  void execute4(String ApplicationURL, String buyerAddress, String buyerGSTIN, String buyerLegalName, String buyerLocation, String buyerName, String buyerState, String buyerPincode, String dashboard, String documentDate, String documentNumber, String entriesCount, String entriesNumber, String extractedMonth, String generatedEInvoicesNumber, String gstRate, String hsnCode, String importEInvoice, String isService, String itemDesc, String itemPrice, String month, String monthConverted, String monthExtracted, String monthOnCalendar, String monthOnDashBoard, String numberOfEntries, String password, String placeOfSupply, String qty, String SupplierPincode, String supplierLocation, String SupplyType, String username, String yearExtracted) throws Exception {
  // 5. E-invoice _Generate E-invoice _Transaction Details_B2B_Credit note
  Tceinvgeb005einvoicegenerateEinvoicetransactionDetailsb2bcreditNote tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote;
  GeneratedUtils.sleep(500);
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote = new Tceinvgeb005einvoicegenerateEinvoicetransactionDetailsb2bcreditNote();
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.ApplicationURL = ApplicationURL;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.username = username;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.password = password;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.dashboard = dashboard;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.importEInvoice = importEInvoice;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.generatedEInvoicesNumber = generatedEInvoicesNumber;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.numberOfEntries = numberOfEntries;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.entriesCount = entriesCount;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.entriesNumber = entriesNumber;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.monthOnDashBoard = monthOnDashBoard;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.monthConverted = monthConverted;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.monthExtracted = monthExtracted;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.yearExtracted = yearExtracted;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.SupplyType = SupplyType;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.monthOnCalendar = monthOnCalendar;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.extractedMonth = extractedMonth;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.month = month;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.documentNumber = documentNumber;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.buyerName = buyerName;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.documentDate = documentDate;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.supplierLocation = supplierLocation;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.buyerGSTIN = buyerGSTIN;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.buyerLegalName = buyerLegalName;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.buyerLocation = buyerLocation;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.placeOfSupply = placeOfSupply;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.buyerAddress = buyerAddress;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.buyerState = buyerState;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.itemDesc = itemDesc;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.isService = isService;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.hsnCode = hsnCode;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.qty = qty;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.itemPrice = itemPrice;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.gstRate = gstRate;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.buyerPincode = buyerPincode;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.SupplierPincode = SupplierPincode;
  tceinvgeb005einvoicegenerateeinvoicetransactiondetailsb2bcreditnote.execute(driver);
  }
  @DisplayName("E-invoice_Generate E-invoice _Transaction Details_B2B_Debit note")
  @ParameterizedTest
 // @MethodSource("provideParameters")
  @CsvFileSource(resources = "/TestData.csv",numLinesToSkip = 1)
  void execute5(String ApplicationURL, String buyerAddress, String buyerGSTIN, String buyerLegalName, String buyerLocation, String buyerName, String buyerState, String buyerPincode, String dashboard, String documentDate, String documentNumber, String entriesCount, String entriesNumber, String extractedMonth, String generatedEInvoicesNumber, String gstRate, String hsnCode, String importEInvoice, String isService, String itemDesc, String itemPrice, String month, String monthConverted, String monthExtracted, String monthOnCalendar, String monthOnDashBoard, String numberOfEntries, String password, String placeOfSupply, String qty, String SupplierPincode, String supplierLocation, String SupplyType, String username, String yearExtracted) throws Exception {
  // 6. E-invoice_Generate E-invoice _Transaction Details_B2B_Debit note
  Tceinvgeb006einvoicegenerateEinvoicetransactionDetailsb2bdebitNote tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote;
  GeneratedUtils.sleep(500);
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote = new Tceinvgeb006einvoicegenerateEinvoicetransactionDetailsb2bdebitNote();
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.ApplicationURL = ApplicationURL;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.username = username;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.password = password;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.dashboard = dashboard;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.importEInvoice = importEInvoice;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.generatedEInvoicesNumber = generatedEInvoicesNumber;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.numberOfEntries = numberOfEntries;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.entriesCount = entriesCount;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.entriesNumber = entriesNumber;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.monthOnDashBoard = monthOnDashBoard;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.monthConverted = monthConverted;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.monthExtracted = monthExtracted;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.yearExtracted = yearExtracted;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.SupplyType = SupplyType;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.monthOnCalendar = monthOnCalendar;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.extractedMonth = extractedMonth;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.month = month;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.documentNumber = documentNumber;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.buyerName = buyerName;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.documentDate = documentDate;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.supplierLocation = supplierLocation;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.buyerGSTIN = buyerGSTIN;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.buyerLegalName = buyerLegalName;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.buyerLocation = buyerLocation;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.placeOfSupply = placeOfSupply;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.buyerAddress = buyerAddress;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.buyerState = buyerState;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.itemDesc = itemDesc;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.isService = isService;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.hsnCode = hsnCode;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.qty = qty;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.itemPrice = itemPrice;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.gstRate = gstRate;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.buyerPincode = buyerPincode;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.SupplierPincode = SupplierPincode;
  tceinvgeb006einvoicegenerateeinvoicetransactiondetailsb2bdebitnote.execute(driver);
  }
  @DisplayName("E-invoice_Generate E-invoice _Supplier details /Dispatch details")
  @ParameterizedTest
 // @MethodSource("provideParameters")
  @CsvFileSource(resources = "/TestData.csv",numLinesToSkip = 1)
  void execute6(String ApplicationURL, String buyerAddress, String buyerGSTIN, String buyerLegalName, String buyerLocation, String buyerName, String buyerState, String buyerPincode, String dashboard, String documentDate, String documentNumber, String entriesCount, String entriesNumber, String extractedMonth, String generatedEInvoicesNumber, String gstRate, String hsnCode, String importEInvoice, String isService, String itemDesc, String itemPrice, String month, String monthConverted, String monthExtracted, String monthOnCalendar, String monthOnDashBoard, String numberOfEntries, String password, String placeOfSupply, String qty, String SupplierPincode, String supplierLocation, String SupplyType, String username, String yearExtracted) throws Exception {
  // 7. E-invoice_Generate E-invoice _Supplier details /Dispatch details
  Tceinvgeb007einvoicegenerateEinvoicesupplierDetailsdispatchDetails tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails;
  GeneratedUtils.sleep(500);
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails = new Tceinvgeb007einvoicegenerateEinvoicesupplierDetailsdispatchDetails();
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.ApplicationURL = ApplicationURL;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.username = username;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.password = password;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.dashboard = dashboard;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.importEInvoice = importEInvoice;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.generatedEInvoicesNumber = generatedEInvoicesNumber;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.numberOfEntries = numberOfEntries;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.entriesCount = entriesCount;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.entriesNumber = entriesNumber;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.monthOnDashBoard = monthOnDashBoard;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.monthConverted = monthConverted;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.monthExtracted = monthExtracted;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.yearExtracted = yearExtracted;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.SupplyType = SupplyType;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.monthOnCalendar = monthOnCalendar;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.extractedMonth = extractedMonth;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.month = month;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.documentNumber = documentNumber;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.buyerName = buyerName;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.documentDate = documentDate;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.supplierLocation = supplierLocation;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.buyerGSTIN = buyerGSTIN;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.buyerLegalName = buyerLegalName;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.buyerLocation = buyerLocation;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.placeOfSupply = placeOfSupply;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.buyerAddress = buyerAddress;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.buyerState = buyerState;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.itemDesc = itemDesc;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.isService = isService;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.hsnCode = hsnCode;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.qty = qty;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.itemPrice = itemPrice;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.gstRate = gstRate;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.buyerPincode = buyerPincode;
  tceinvgeb007einvoicegenerateeinvoicesupplierdetailsdispatchdetails.execute(driver);

}

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

//  private static Stream provideParameters() throws Exception {
//    return Stream.of(Arguments.of("einvuser1","1234","http://175.101.240.71:9791/XATTAXEInvoice1.5/","", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "FFF", "07/11/2021", "jammu & Kasmir", "03AMBPG7773M002", "3", "Punjab", "punjab", "147203", "3", "food", "N", "1001", "10", "25", "3", "180001", "FFF", "", "", "", "", "", ""));
//  }
}
