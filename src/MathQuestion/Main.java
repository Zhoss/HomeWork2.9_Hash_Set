package MathQuestion;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<MathQuestion> mathQuestions = new HashSet<>();
        for (int i = 0; i < 15; i++) {
            mathQuestions.add(new MathQuestion());
        }
        for (MathQuestion mathQuestion : mathQuestions) {
            System.out.println(mathQuestion);
        }
    }
}
