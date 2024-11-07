package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {

  public  SearchPage(WebDriver driver){
	   super(driver);
   }
  
  
  @FindBy(xpath="//h4[.='HP LP3065']") WebElement SearchedProduct;
  @FindBy(xpath="//p[.='There is no product that matches the search criteria.']") WebElement NonExistProductName;
  @FindBy(xpath="//p[.='There is no product that matches the search criteria.']") WebElement noproduct;
  @FindBy(xpath="//select[@name='category_id']") WebElement allcategoriesdropdown;
  @FindBy(xpath = "//input[@type='checkbox'][@name='sub_category']") WebElement checkbox;
  @FindBy(xpath = "//input[@id='button-search']")WebElement searchbutton;
  @FindBy(xpath = "//h4[.='iMac']") WebElement productimacdisplayed;
  @FindBy(xpath = "//select[@id='input-sort']") WebElement defaultdropdown;
  @FindBy(xpath = "//i[@class='fa fa-th-list']") WebElement clickbtnlistview;
  @FindBy(xpath = "(//div//i[@class='fa fa-exchange'])[1]") WebElement productcomparebtnimac;
  @FindBy(xpath = "(//div//i[@class='fa fa-exchange'])[2]") WebElement productcomparebtnmacbook;
  @FindBy(xpath = "//a[.='product comparison']") WebElement productcomparsionlink;
  
  
  public String getSearchedProductmsg() {
	 String productnamemsg =  SearchedProduct.getText();
	 return productnamemsg;
  }
  
  public String getNonExistproductnamemsg() {
	 String nonexistproductmsg =  NonExistProductName.getText();
	 return nonexistproductmsg;
  }
  
  public String getNoProductWrngmsg() {
	 String noProductwrngmsg =  noproduct.getText();
	  return noProductwrngmsg;
	  }
  
  public void dropdownallcategories() {
	  allcategoriesdropdown.click();
  }
  
  public void selectOptionByVisibleText(String name) {
	  Select options = new Select(allcategoriesdropdown);
	  options.selectByVisibleText(name);
  }
  
  public void clickCheckboxinsubcategories() {
	  checkbox.click();
  }
  
  public void clickSearchButton() {
	  searchbutton.click();
  }
  
  public boolean productimac() {
	 boolean productimac =  productimacdisplayed.isDisplayed();
	  return productimac;
  }
  
  public void defaultdropdown() {
	  defaultdropdown.click();
  }
  
  public void selectoptionsfromdefaultdropdown(String name) {
	  Select options = new Select(defaultdropdown);
	  options.selectByVisibleText(name);
	  }
  
  public void clickbtnlistview() {
	  clickbtnlistview.click();
  }
  
  public void productCompareBtnImac() {
	  productcomparebtnimac.click();
  }
  
  public void productCompareBtnMacBook() {
	  productcomparebtnmacbook.click();
  }
  
  public void productComparsionLink() {
	  productcomparsionlink.click();
  }
  }
  
  

