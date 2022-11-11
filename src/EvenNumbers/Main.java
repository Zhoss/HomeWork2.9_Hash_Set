package EvenNumbers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> randomSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            randomSet.add(random.nextInt(1001));
        }
        Iterator<Integer> iter = randomSet.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 != 0) {
                iter.remove();
            }
        }
        System.out.println(randomSet);
    }
}
