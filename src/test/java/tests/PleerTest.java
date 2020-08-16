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
        Configuration. holdBrowserOpen = true; //открыть

        open("https://www.pleer.ru/"); //поиск

        $(byName("text")).setValue("шуруповерт").pressEnter();

        $(byId("list_items")).$(withText("Makita")).click(); //выбор товара

        switchTo().window(1);

        $(byText("Купить")).click();//добавить в корзину

        $(byClassName("buy_button_small pie buy_button_small_b2")).click();//перейти в корзину

        $(byId("cart_items_t")).shouldHave(text("Makita")); // проверить наличие товара


    }




}
