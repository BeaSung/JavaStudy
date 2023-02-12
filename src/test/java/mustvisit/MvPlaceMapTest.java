package mustvisit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MvPlaceMapTest {

    @Test
    void enhancedForLoop() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
