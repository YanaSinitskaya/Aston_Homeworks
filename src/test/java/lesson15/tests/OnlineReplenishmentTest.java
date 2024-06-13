package lesson15.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OnlineReplenishmentTest extends BaseTest {

    @DisplayName("Задание 1: Проверка наличия блока онлайн пополнения без комиссии")
    @Test
    public void checkVisibilityOfReplenishmentBlock() {
        replenishmentPage.openMainPage();
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", replenishmentPage.isReplenishmentBlockDisplayed());
    }

    @DisplayName("Задание 2: Проверка наличия изображения оплаты Visa")
    @Test
    public void checkVisibilityOfImageVisaOfPaymentMethods() {
        replenishmentPage.openMainPage();
        Assertions.assertTrue(replenishmentPage.isImageVisaDisplayed());
    }

    @DisplayName("Задание 2: Проверка наличия изображения оплаты VerifiedVisa")
    @Test
    public void checkVisibilityOfImageVisaVerifiedOfPaymentMethods() {
        replenishmentPage.openMainPage();
        Assertions.assertTrue(replenishmentPage.isImageVerifiedVisaDisplayed());
    }

    @DisplayName("Задание 2: Проверка наличия изображения оплаты Mastercard")
    @Test
    public void checkVisibilityOfImageMastercardOfPaymentMethods() {
        replenishmentPage.openMainPage();
        Assertions.assertTrue(replenishmentPage.isImageMastercardDisplayed());
    }

    @DisplayName("Задание 2: Проверка наличия изображения оплаты MastercardSecure")
    @Test
    public void checkVisibilityOfImageMastercardSecureOfPaymentMethods() {
        replenishmentPage.openMainPage();
        Assertions.assertTrue(replenishmentPage.isImageMastercardSecureDisplayed());
    }

    @DisplayName("Задание 2: Проверка наличия изображения оплаты Belcart")
    @Test
    public void checkVisibilityOfImageBelcartSecureOfPaymentMethods() {
        replenishmentPage.openMainPage();
        Assertions.assertTrue(replenishmentPage.isImageBelcartDisplayed());
    }

    @DisplayName("Задание 3: Проверка работоспособности кликабельного текста Подробнее о сервисе")
    @Test
    public void checkLinkMoreAboutService() {
        replenishmentPage.openMainPage();
        Assertions.assertEquals("Оплата банковской картой", replenishmentPage.checkLinkableTextMoreAboutService());
    }

    @DisplayName("Задание 4: Проверка работоспособности кнопки продолжить при заполнении формы Онлайн пополнения")
    @Test
    public void checkContinuePaymentButton() {
        replenishmentPage.openMainPage();
        replenishmentPage.fillFields("297777777", "15.00");
        Assertions.assertTrue(replenishmentPage.checkContinueButton());
    }
}
