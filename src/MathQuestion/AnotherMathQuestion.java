package MathQuestion;

public class AnotherMathQuestion {
    private int numberA;
    private int numberB;

    public AnotherMathQuestion(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    @Override
    public String toString() {
        return numberA + " * " + numberB;
    }
}
