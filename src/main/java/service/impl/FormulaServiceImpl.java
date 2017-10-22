package service.impl;

import domain.Formula;
import service.FormulaService;

import java.util.List;

public class FormulaServiceImpl implements FormulaService {
    public FormulaServiceImpl() {}

    public List<Formula> replaceFormulaDescription(String oldValue, String newValue, List<Formula> formulas){
        String descritpion;
        for (Formula f : formulas) {
            descritpion = f.getDescription();
            f.setDescription(descritpion.replaceAll(oldValue, newValue));
        }
        return formulas;
    }
}
