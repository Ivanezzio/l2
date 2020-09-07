package tests;


import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Tag("alfabank_test")
public class L3 {
    @Test
    void alfabankTest(){
        Configuration. holdBrowserOpen = true;
        open("https://alfabank.ru");
        $(byText("Вклады")).click();
        $$(byText("Депозиты")).find(visible).click();
        $(byText("Архивные депозиты")).click();
        $$(".product-cell__cell-box").shouldHave(size(3));
    }


}
