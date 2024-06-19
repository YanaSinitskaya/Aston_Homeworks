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

    private final By SELECT_HEADER_DROPDOWN = By.cssSelector(".select__header");
    private final By COMMUNICATION_SERVICES_DROPDOWN = By.xpath("//p[contains (@class, 'select__option') and text() = 'Услуги связи']");
    private final By HOME_INTERNET_DROPDOWN = By.xpath("//p[contains (@class, 'select__option') and text() = 'Домашний интернет']");
    private final By ISTALLMENT_DROPDOWN = By.xpath("//p[contains (@class, 'select__option') and text() = 'Рассрочка']");
    private final By DEBT_DROPDOWN = By.xpath("//p[contains (@class, 'select__option') and text() = 'Задолженность']");
    private final By PHONE_INPUT = By.id("connection-phone");
    private final By INTERNET_PHONE = By.id("internet-phone");
    private final By SCORE44_INPUT = By.id("score-instalment");
    private final By SCORE2073_INPUT = By.id("score-arrears");
    private final By SUM_INPUT = By.id("connection-sum");
    private final By EMAIL_INPUT = By.id("connection-email");
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

    @Description("Отображение изображения Visa в блоке Онлайн пополнение")
    public boolean isImageVisaDisplayed() {
        WebElement imgVisa = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgVisa);
        return isDisplayed;
    }

    @Description("Отображение изображения Verified by Visa в блоке Онлайн пополнение")
    public boolean isImageVerifiedVisaDisplayed() {
        WebElement imgVerifiedVisa = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgVerifiedVisa);
        return isDisplayed;
    }

    @Description("Отображение изображения Mastercard в блоке Онлайн пополнение")
    public boolean isImageMastercardDisplayed() {
        WebElement imgMastercard = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgMastercard);
        return isDisplayed;
    }

    @Description("Отображение изображения Mastercard Secure в блоке Онлайн пополнение")
    public boolean isImageMastercardSecureDisplayed() {
        WebElement imgMastercardSecure = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgMastercardSecure);
        return isDisplayed;
    }

    @Description("Отображение изображения Belcart в блоке Онлайн пополнение")
    public boolean isImageBelcartDisplayed() {
        WebElement imgBelcart = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgBelcart);
        return isDisplayed;
    }

    @Description("Отображение изображения Mastercard в блоке Оплаты")
    public boolean isImageMCDisplayedFrame() {
        WebElement imgMastercardFrame= driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgMastercardFrame);
        return isDisplayed;
    }

    @Description("Отображение изображения Visa в блоке Оплаты")
    public boolean isImageVisaDisplayedFrame() {
        WebElement imgVisaFrame = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/visa-system.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgVisaFrame);
        return isDisplayed;
    }

    @Description("Отображение изображения Belcart в блоке Оплаты")
    public boolean isImageBelcartDisplayedFrame() {
        WebElement imgBelcartFrame = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgBelcartFrame);
        return isDisplayed;
    }

    @Description("Отображение изображения Mir в блоке Оплаты")
    public boolean isImageMirDisplayedFrame() {
        WebElement imgMirFrame = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Boolean isDisplayed = (Boolean) (executor)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", imgMirFrame);
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

    @Description("Выбор Услуги связи в Дропдаун в Онлайн пополнение")
    public void chooseCommServicesDropdown() {
        driver.findElement(SELECT_HEADER_DROPDOWN).click();
        driver.findElement(COMMUNICATION_SERVICES_DROPDOWN).click();
    }

    @Description("Выбор Домашнего интернета в Дропдаун в Онлайн пополнение")
    public void chooseHomeInternetDropdown() {
        driver.findElement(SELECT_HEADER_DROPDOWN).click();
        driver.findElement(HOME_INTERNET_DROPDOWN).click();
    }

    @Description("Выбор Рассрочки в Дропдаун в Онлайн пополнение")
    public void chooseInstallmentDropdown() {
        driver.findElement(SELECT_HEADER_DROPDOWN).click();
        driver.findElement(ISTALLMENT_DROPDOWN).click();
    }

    @Description("Выбор Задолженность в Дропдаун в Онлайн пополнение")
    public void chooseDebtDropdown() {
        driver.findElement(SELECT_HEADER_DROPDOWN).click();
        driver.findElement(DEBT_DROPDOWN).click();
    }

    @Description("Проверка наличия текста в плейсхолдере Номер счета 44 в блоке Онлайн пополнения")
    public String checkTextPlaceholderScore44() {
        return driver.findElement(SCORE44_INPUT).getAttribute("placeholder");
    }

    @Description("Проверка наличия текста в плейсхолдере Номер абонента в блоке Онлайн пополнения")
    public String checkTextPlaceholderInternetPhone() {
        return driver.findElement(INTERNET_PHONE).getAttribute("placeholder");
    }

    @Description("Проверка наличия текста в плейсхолдере Телефон в блоке Онлайн пополнения")
    public String checkTextInPlaceholderPhone() {
        return driver.findElement(PHONE_INPUT).getAttribute("placeholder");
    }

    @Description("Проверка наличия текста в плейсхолдере Сумма в блоке Онлайн пополнения")
    public String checkTextInPlaceholderSum() {
        return driver.findElement(SUM_INPUT).getAttribute("placeholder");
    }

    @Description("Проверка наличия текста в плейсхолдере Email в блоке Онлайн пополнения")
    public String checkTextInPlaceholderEmail() {
        return driver.findElement(EMAIL_INPUT).getAttribute("placeholder");
    }

    @Description("Проверка наличия текста в плейсхолдере Номер счета 2073 в блоке Онлайн пополнения")
    public String checkTextInPlaceholderScore2073() {
        return driver.findElement(SCORE2073_INPUT).getAttribute("placeholder");
    }

    @Description("Нажатие на кнопку Продолжить")
    public void clickContinueButton() {
        driver.findElement(CONTINUE_BUTTON).click();
    }

    @Description("Переход во фрейм")
    public void switchToFrame() {
        WebElement framePayment = driver.findElement(IFRAME);
        wait.until(ExpectedConditions.visibilityOf(framePayment));
        driver.switchTo().frame(framePayment);
    }

    @Description("Проверить сумму во фрейме")
    public String checkSumInFrame() {
        return driver.findElement(By.xpath("//div[@class='pay-description__cost']/span[1]")).getAttribute("textContent");
    }

    @Description("Проверить телефон во фрейме")
    public String checkPhoneInFrame() {
        return driver.findElement(By.xpath("//span[@class='pay-description__text']")).getAttribute("textContent");
    }

    @Description("Проверить сумму в кнопке Оплатить во фрейме")
    public String checkSumInButton() {
        return driver.findElement(By.xpath("//div[@class='card-page__card']//button[@type='submit']")).getAttribute("textContent");
    }

    @Description("Проверить наличие текста плейсхолдера в форме Номер карты во фрейме")
    public boolean isCardNumberPlaceholderCardNumberInFrameDisplayed() {
        return driver.findElement(By.xpath("//div[@class='content ng-tns-c46-1']//label[text()='Номер карты']")).isEnabled();
    }

    @Description("Проверить наличие текста плейсхолдера в форме Cрок действия карты во фрейме")
    public boolean isExpirationDatePlaceholderInFrameDisplayed() {
        return driver.findElement(By.xpath("//div[@class='content ng-tns-c46-4']//label[text()='Срок действия']")).isEnabled();
    }

    @Description("Проверить наличие текста плейсхолдера в форме CVC во фрейме")
    public boolean isCVCPlaceholderInFrameDisplayed() {
        return driver.findElement(By.xpath("//div[@class='content ng-tns-c46-5']//label[text()='CVC']")).isEnabled();
    }

    @Description("Проверить наличие текста плейсхолдера в форме Имя Фамилия во фрейме")
    public boolean isNamePlaceholderInFrameDisplayed() {
        return driver.findElement(By.xpath("//div[@class='content ng-tns-c46-3']//label[text()='Имя держателя (как на карте)']")).isEnabled();
    }
}
