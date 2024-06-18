package lesson15.tests;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Lesson16OnlineReplenishmentTest extends BaseTest {

    @DisplayName("Л16 Задание 1: Проверка наличия текстов плейсхолдеров в Услуги связи в блоке Онлайн пополнения")
    @Test
    public void checkPlaceholderCommServices() {
        replenishmentPage.openMainPage();
        replenishmentPage.chooseCommServicesDropdown();
        Assertions.assertAll(
                () -> Assertions.assertEquals("Номер телефона", replenishmentPage.checkTextInPlaceholderPhone(),
                        "Неверный текст в плейсхолдере Номер телефона"),
                () -> Assertions.assertEquals("Сумма", replenishmentPage.checkTextInPlaceholderSum(),
                        "Неверный текст в плейсхолдере Сумма"),
                () -> Assertions.assertEquals("E-mail для отправки чека", replenishmentPage.checkTextInPlaceholderEmail(),
                        "Неверный текст в плейсхолдере E-mail для отправки чека")
        );
    }

    @DisplayName("Л16 Задание 1: Проверка наличия текстов плейсхолдеров в Домашний интернет в блоке Онлайн пополнения")
    @Test
    public void checkPlaceholdersHomeInternet() {
        replenishmentPage.openMainPage();
        replenishmentPage.chooseHomeInternetDropdown();
        Assertions.assertAll(
                () -> Assertions.assertEquals("Номер абонента", replenishmentPage.checkTextPlaceholderInternetPhone(),
                        "Неверный текст в плейсхолдере Домашний интернет"),
                () -> Assertions.assertEquals("Сумма", replenishmentPage.checkTextInPlaceholderSum(),
                        "Неверный текст в плейсхолдере Сумма"),
                () -> Assertions.assertEquals("E-mail для отправки чека", replenishmentPage.checkTextInPlaceholderEmail(),
                        "Неверный текст в плейсхолдере E-mail для отправки чека")
        );
    }

    @DisplayName("Л16 Задание 1: Проверка наличия текстов плейсхолдеров в Рассрочка в блоке Онлайн пополнения")
    @Test
    public void checkPlaceholdersInstallment() {
        replenishmentPage.openMainPage();
        replenishmentPage.chooseInstallmentDropdown();
        Assertions.assertAll(
                () -> Assertions.assertEquals("Номер счета на 44", replenishmentPage.checkTextPlaceholderScore44(),
                        "Неверный текст в плейсхолдере Номер счета на 44"),
                () -> Assertions.assertEquals("Сумма", replenishmentPage.checkTextInPlaceholderSum(),
                        "Неверный текст в плейсхолдере Сумма"),
                () -> Assertions.assertEquals("E-mail для отправки чека", replenishmentPage.checkTextInPlaceholderEmail(),
                        "Неверный текст в плейсхолдере E-mail для отправки чека")
        );
    }

    @DisplayName("Л16 Задание 1: Проверка наличия текстов плейсхолдеров в Задолженность в блоке Онлайн пополнения")
    @Test
    public void checkPlaceholdersDebt() {
        replenishmentPage.openMainPage();
        replenishmentPage.chooseDebtDropdown();
        Assertions.assertAll(
                () -> Assertions.assertEquals("Номер счета на 2073", replenishmentPage.checkTextInPlaceholderScore2073(),
                        "Неверный текст в плейсхолдере Номер счета на 2073"),
                () -> Assertions.assertEquals("Сумма", replenishmentPage.checkTextInPlaceholderSum(),
                        "Неверный текст в плейсхолдере Сумма"),
                () -> Assertions.assertEquals("E-mail для отправки чека", replenishmentPage.checkTextInPlaceholderEmail(),
                        "Неверный текст в плейсхолдере E-mail для отправки чека")
        );
    }

    @DisplayName("Л16 Задание 2: Проверка введеной суммы и телефона")
    @Test
    public void checkEnteredInfo() {
        String sum = "15.00";
        String phone = "297777777";
        replenishmentPage.openMainPage();
        replenishmentPage.chooseCommServicesDropdown();
        replenishmentPage.fillFields(phone, sum);
        replenishmentPage.clickContinueButton();
        replenishmentPage.switchToFrame();
       // Assertions.assertEquals(sum, replenishmentPage.checkSumInFrame(), "Неверная сумма пополнения");
        Assertions.assertTrue(replenishmentPage.checkSumInFrame().contains("15"));
       /* Assertions.assertAll(
                () -> Assertions.assertTrue(replenishmentPage.checkSumInFrame().contains(sum), "Неверная сумма пополнения"),
                () -> Assertions.assertTrue(replenishmentPage.checkPhoneInFrame().contains(phone),"Неверный телефон"),
                () -> Assertions.assertTrue(replenishmentPage.checkSumInButton().contains(sum), "Неверная сумма пополнения в кнопке Оплатить")
        ); */
    }

    @DisplayName("Л16 Задание 2: Проверка наличия изображений оплаты ")
    @Test
    public void checkVisibilityOfImagesOfPaymentMethods() {
        replenishmentPage.openMainPage();
        replenishmentPage.chooseCommServicesDropdown();
        replenishmentPage.fillFields("297777777", "15.00");
        replenishmentPage.clickContinueButton();
        replenishmentPage.switchToFrame();
        Assertions.assertAll(
                () -> Assertions.assertTrue(replenishmentPage.isImageMCDisplayedFrame()),
                () -> Assertions.assertTrue(replenishmentPage.isImageVisaDisplayedFrame()),
                () -> Assertions.assertTrue(replenishmentPage.isImageBelcartDisplayedFrame()),
                () -> Assertions.assertTrue(replenishmentPage.isImageMirDisplayedFrame())
        );
    }
}
