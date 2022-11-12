package MathQuestion;

import java.util.Objects;

public class MathQuestion {
    private int numberA;
    private int numberB;
    private String multiplication;

    public MathQuestion() {
        this.numberA = (int) ((Math.random() * 7) + 2);
        this.numberB = (int) ((Math.random() * 7) + 2);
        this.multiplication = this.numberA + " * " + this.numberB;
    }

    public String getMultiplication() {
        return multiplication;
    }

    @Override
    public String toString() {
        return multiplication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathQuestion that = (MathQuestion) o;
        if (multiplication.equals(that.multiplication)) {
            return true;
        } else if (numberA == that.numberB && numberB == that.numberA) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(multiplication, numberA, numberB);
    }
}
