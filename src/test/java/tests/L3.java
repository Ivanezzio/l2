package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("tinkoff_tests")
public class L3 {

    void tintkoffTest(){
        Configuration. holdBrowserOpen = true;
        open("https://tinkoff.ru");
        $(byText("Вклады")).closest("a").click();
}


}
