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
    void selenidePleerTests()    {
        Configuration. holdBrowserOpen = true;
//открыть
        open("https://www.pleer.ru/");
//поиск
        $(byName("text")).setValue("шуруповерт").pressEnter();
//выбор товара
        $(byId("list_items")).$(withText("Makita")).click();
//добавить в корзину
       // $(byId("flex_1")).$(byText("Купить")).click();


    }




}
