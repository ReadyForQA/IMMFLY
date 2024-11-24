package definitions;
import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import java.util.List;
public class SortByDefinitions {
    WebDriver driver = WebDriverManager.getDriver();

    @Given("I am in the product list")
    public void i_am_in_the_product_list() {
        //Acces to the web page
        driver.get("https://highlifeshop.com/speedbird-cafe");
        //Close the cookies menu
        driver.findElement(By.id("close-modal")).click();



    }

    @When("I click with my mouse")
    public void i_click_with_my_mouse() {
        //Left click on the Sort by drop dawn
        driver.findElement(By.xpath("//span[contains(.,'Default')]")).click();

    }

    @Then("The “sort by” dropdown appear")
    public void the_sort_by_dropdown_appear() {
        //Validate the SortBy drop dawn are visible

        Assert.assertTrue("Exist ",driver.findElement(By.xpath("//li[contains(.,'Product A-Z')]")).isDisplayed());


    }

    @Then("Have Four options {string}, {string}, {string} and {string}.")
    public void have_options_and(String string1, String string2, String string3, String string4) {
        // Validate that all 4 group of options exist, 6 boxes in total: Default , Product A-Z ,Product Z-A , Price High to Low, Price Low to High and New Arrivals
        Assert.assertTrue("Not Exist " + string1 ,driver.findElement(By.xpath("//li[contains(.,'Default')]")).isDisplayed());
        Assert.assertTrue("Not Exist " + string2 + " DESC",driver.findElement(By.xpath("//li[contains(.,'Product A-Z')]")).isDisplayed());
        Assert.assertTrue("Not Exist " + string2 + " ASC",driver.findElement(By.xpath("//li[contains(.,'Product Z-A')]")).isDisplayed());
        Assert.assertTrue("Not Exist " + string3 + " DESC",driver.findElement(By.xpath("//li[contains(.,'Price High to Low')]")).isDisplayed());
        Assert.assertTrue("Not Exist " + string3 + " ASC",driver.findElement(By.xpath("//li[contains(.,'Price Low to High')]")).isDisplayed());
        Assert.assertTrue("Not Exist " + string4,driver.findElement(By.xpath("//li[contains(.,'New Arrivals')]")).isDisplayed());

    }







}

