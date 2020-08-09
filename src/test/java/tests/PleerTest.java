package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

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
        $(byId("list_items")).getValue("makita").click();
//добавить в корзину



    }




}
