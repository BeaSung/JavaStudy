package gym;

import java.time.LocalDate;

public class PTMember extends Member {
    private int totalSessionCount;
    private int completedSessionCount;

    public PTMember(String id,
                    String name,
                    Gender gender,
                    LocalDate startDate,
                    LocalDate expireDate,
                    int totalSessionCount,
                    int completedSessionCount) {
        super(id, name, gender, startDate, expireDate);
        this.totalSessionCount = totalSessionCount;
        this.completedSessionCount = completedSessionCount;
    }

    public int getRemainingSessionCount() {
        return totalSessionCount - completedSessionCount;
    }

//    PT횟수는 남았는데(1번 이용) 헬스장 이용권이 만료된 회원(부모클래스의 isAvailable())인지 판별하는 기능
    public boolean isExpiredMember() {
//        if (getRemainingSessionCount() > 0) {
//            if (!isAvailable()) {
//                return true;
//            }
//        }
//        return false;
        return getRemainingSessionCount() > 0 && !isAvailable();
    }
}
