package controller;

import java.util.HashMap;
import java.util.List;
import model.*;
import view.AnalysisView;
public class AnalysisController {
    public AnalysisModel model;
    public AnalysisView view;

    public AnalysisController(AnalysisModel model, AnalysisView view) {
        this.model = model;
        this.view = view;
    }

    public void analyzeString(String input) {
        HashMap<String, List<Integer> > numberAnalysis = model.analyzeNumbers(input);
        HashMap<String, StringBuilder> characterAnalysis = model.analyzeCharacters(input);
        int characterCount = input.length();

        view.displayNumberAnalysis(numberAnalysis);
        view.displayCharacterAnalysis(characterAnalysis);
        view.displayCharacterCount(characterCount);
    }
}
