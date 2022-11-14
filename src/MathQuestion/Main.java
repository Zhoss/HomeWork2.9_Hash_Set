package MathQuestion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<MathQuestion> mathQuestions = new HashSet<>();
        for (int i = 0; mathQuestions.size() < 15; i++) {
            mathQuestions.add(new MathQuestion());
        }
        for (MathQuestion mathQuestion : mathQuestions) {
            System.out.println(mathQuestion);
        }
    }
}
