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

    public String getName() {
        return name;
    }

    // 회원권 유효여부
    public boolean isAvailable() {
        LocalDate today = LocalDate.now();
        return today.isAfter(startDate) && today.isBefore(expireDate);
    }
}
