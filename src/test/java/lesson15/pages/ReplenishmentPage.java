package lesson15.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReplenishmentPage extends BasePage {
    public ReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By PHONE_INPUT = By.id("connection-phone");
    private final By SUM_INPUT = By.id("connection-sum");
    private final By CONTINUE_BUTTON = By.cssSelector("button[class='button button__default ']");
    private final By BLOCK_OF_REPLENISHMENT = By.cssSelector("div.pay__wrapper>h2");
    private final By MORE_INFO_LINK = By.cssSelector("a[href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']");
    private final By PAYMENT_INFO_BLOCK = By.cssSelector("div.container-fluid>h3");
    private final By COOKIE_DISAGREEMENT = By.cssSelector("button[class='btn btn_gray cookie__cancel']");
    private final By IFRAME = By.cssSelector("div.bepaid-app__container iframe");

    public void openMainPage() {
        driver.get(BASE_URL);
        driver.findElement(COOKIE_DISAGREEMENT).click();
    }

    @Description("Отображение блока Онлайн пополнение без комиссии")
    public String isReplenishmentBlockDisplayed() {
        return driver.findElement(BLOCK_OF_REPLENISHMENT).getText();
    }

    @Description("Отображение кликабельного текста Подробнее о сервисе")
    public String checkLinkableTextMoreAboutService() {
        driver.findElement(MORE_INFO_LINK).click();
        return driver.findElement(PAYMENT_INFO_BLOCK).getText();
    }

    @Description("Отображение изображения Visa")
    public boolean isImageVisaDisplayed() {
        WebElement imgVisa = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgVisa);
        return isDisplayed;
    }

    @Description("Отображение изображения Verified by Visa")
    public boolean isImageVerifiedVisaDisplayed() {
        WebElement imgVerifiedVisa = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgVerifiedVisa);
        return isDisplayed;
    }

    @Description("Отображение изображения Mastercard")
    public boolean isImageMastercardDisplayed() {
        WebElement imgMastercard = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgMastercard);
        return isDisplayed;
    }

    @Description("Отображение изображения Mastercard Secure")
    public boolean isImageMastercardSecureDisplayed() {
        WebElement imgMastercardSecure = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgMastercardSecure);
        return isDisplayed;
    }

    @Description("Отображение изображения Belcart")
    public boolean isImageBelcartDisplayed() {
        WebElement imgBelcart = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgBelcart);
        return isDisplayed;
    }

    @Description("Заполнить поле телефон и сумму пополнения")
    public void fillFields(String phone, String sum) {
        driver.findElement(PHONE_INPUT).sendKeys(phone);
        driver.findElement(SUM_INPUT).sendKeys(sum);
    }

    @Description("Проверка работоспособности кнопки Продолжить")
    public boolean checkContinueButton() {
        driver.findElement(CONTINUE_BUTTON).click();
        WebElement framePayment = driver.findElement(IFRAME);
        wait.until(ExpectedConditions.visibilityOf(framePayment));
        return framePayment.isDisplayed();
    }
}
