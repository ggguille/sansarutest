package service;

import domain.Formula;
import org.junit.Test;
import service.impl.FormulaServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FormulaServiceImplTest {
    @Test
    public void testReplacement() {
        List<Formula> formulas = new ArrayList<Formula>();

        Formula formula1 = new Formula(1, "[Shipping].Amount * 2");
        Formula formula2 = new Formula(2, "[Shipping_GB].Amount * 2");
        Formula formula3 = new Formula(3, "[Nothing] * 2");

        formulas.add(formula1);
        formulas.add(formula2);
        formulas.add(formula3);

        FormulaService formulaService = new FormulaServiceImpl();

        formulaService.replaceFormulaDescription("Shipping", "Shipping_GB", formulas);

        // assert statements
        assertEquals("[Shipping_GB].Amount * 2", formula1.getDescription());
        assertEquals("[Shipping_GB_GB].Amount * 2", formula2.getDescription());
        assertEquals("[Nothing] * 2", formula3.getDescription());
    }
}
