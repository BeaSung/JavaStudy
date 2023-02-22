package gym;

import java.util.ArrayList;
import java.util.List;

/**
 * 헬스장 회원관리 시스템
 */
public class Gym {
    private List<Member> members = new ArrayList<>();

    // 등록
    public void register(Member member) {
        members.add(member);
    }

    public Member searchMember(String name) {
        // Enhanced for loop
        // for (타입명 변수명 : 컬렉션/배열명)
        for (Member member : members) {
            if (member.getName().contains(name)) {
                return member;
            }
        }

        throw new RuntimeException("일치하는 회원이 없습니다.");
    }

    // 현재 헬스장을 이용 중인 회원목록을 반환하는 메서드
    public List<Member> getActiveMembers() {
        List<Member> activeMembers = new ArrayList<>();
        for (Member member : members) {
            if (member.isAvailable()) {
                activeMembers.add(member);
            }
        }
        return activeMembers;
    }

    public List<Member> getAllMembers() {
        return members;
    }
}
