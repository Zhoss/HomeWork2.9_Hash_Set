package MathQuestion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set<MathQuestion> mathQuestions = new HashSet<>();
//        for (int i = 0; i < 15; i++) {
//            mathQuestions.add(new MathQuestion());
//        }
//        for (MathQuestion mathQuestion : mathQuestions) {
//            System.out.println(mathQuestion);
//        }
        List<AnotherMathQuestion> allMathQuestions = new ArrayList<>();
        for (int numberA = 2; numberA <= 9; numberA++) {
            for (int numberB = numberA; numberB <= 9; numberB++) {
                allMathQuestions.add(new AnotherMathQuestion(numberA, numberB));
            }
        }
        Collections.shuffle(allMathQuestions);
        List<AnotherMathQuestion> chosenMathQuestions = allMathQuestions.subList(0, 15);
        for (AnotherMathQuestion chosenMathQuestion : chosenMathQuestions) {
            System.out.println(chosenMathQuestion);
        }
    }
}
