package gym;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GymTest {

    @Test
    void register() {
        Gym gym = new Gym();
        Member newMember = createMember("0001", "Bea");

        gym.register(newMember);

        System.out.println(gym.getAllMembers());
    }

    @Test
    void search() {
        Gym gym = new Gym();
        Member member1 = createMember("0001", "Bea");
        Member member2 = createMember("0002", "Sung");
        Member member3 = createMember("0003", "Eun");
        gym.register(member1);
        gym.register(member2);
        gym.register(member3);

        Member member = gym.searchMember("Bea");

        System.out.println(member);
    }

    private Member createMember(String id, String name) {
        LocalDate startDate = LocalDate.of(2023, 2, 21);
        LocalDate expiredDate = startDate.plusMonths(1);
        return new Member(id, name, Gender.FEMALE, startDate, expiredDate);
    }
}
