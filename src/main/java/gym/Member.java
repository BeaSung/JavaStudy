package gym;

import java.time.LocalDate;

/**
 * 헬스장 회원
 */
public class Member {
    private String id;
    private String name;
    private Gender gender;
    private LocalDate startDate;
    private LocalDate expireDate;

    public Member(String id, String name, Gender gender, LocalDate startDate, LocalDate expireDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.startDate = startDate;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    // 회원권 유효여부
    public boolean isAvailable() {
        LocalDate today = LocalDate.now();
        return today.isAfter(startDate) && today.isBefore(expireDate);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", startDate=" + startDate +
                ", expireDate=" + expireDate +
                '}';
    }
}
