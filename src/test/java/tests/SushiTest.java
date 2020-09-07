package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

@Tag("sushi_tests")

public class SushiTest {
    @Test

    void sushiTests(){
        Configuration. holdBrowserOpen = true;

        open("https://sushiwok.ru/msk/");
        //$(byText ("Меню")).click();

        $(".main-menu__right").$(withText("Меню")).click(); // перейти в раздел суши categories-list__item
        // выбрать позицию, добавить в корзину
        // открыть карзину
        // проверить наличие товара в корзине
    }

}
