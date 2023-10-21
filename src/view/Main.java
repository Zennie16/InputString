package view;

import java.util.Scanner;
import model.*;
import view.AnalysisView;
import controller.*;

public class Main {
     public static void main(String[] args) {
        String input = "Hello, 123 world! The square of 9 is 81.";

        AnalysisModel model = new AnalysisModel();
        AnalysisView view = new AnalysisView();
        AnalysisController controller = new AnalysisController(model, view);

        controller.analyzeString(input);
    }

}
