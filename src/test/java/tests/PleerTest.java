package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

@Tag("pleer_test")

public class PleerTest {
    @Test
    void selenidePleerTest()    {
        Configuration. holdBrowserOpen = true;

        open("https://www.pleer.ru/"); //открыть

        $(byName("text")).setValue("шуруповерт").pressEnter();//поиск

        $(byId("list_items")).$(withText("Makita")).click(); //выбор товара

        switchTo().window(1); //перейти на новую вкладку

        $(byText("Купить")).click();//добавить в корзину

        $(".product_price_color2").click();//перейти в корзину

        $(".cart_items_t").shouldHave(text("Makita")); // проверить наличие товара


    }




}
