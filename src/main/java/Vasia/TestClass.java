package Vasia;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;

public class TestClass {
    public static void main(String[] args) {
        RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat( new Locale("RU", "RU"), RuleBasedNumberFormat.SPELLOUT );
        System.out.println(ruleBasedNumberFormat.format(23041979));

    }
}
