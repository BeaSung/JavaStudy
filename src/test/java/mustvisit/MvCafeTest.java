package mustvisit;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;

class MvCafeTest {

    @Test
    void mvCafe_create() {
        MvPlace cafe = new MvCafe(new ArrayList<>(),
                LocalTime.now(),
                LocalTime.now(),
                true);

        System.out.println(cafe);
    }
}