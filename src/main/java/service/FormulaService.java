package service;

import domain.Formula;

import java.util.List;

public interface FormulaService {
    List<Formula> replaceFormulaDescription(String oldValue, String newValue, List<Formula> formulas);
}
