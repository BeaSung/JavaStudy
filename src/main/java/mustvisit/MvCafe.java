package mustvisit;

import java.time.LocalTime;
import java.util.List;

public class MvCafe extends MvPlace {
    // 콘센트 유무 저장/조회
    private final boolean concent;

    public MvCafe(List<Menu> menus, LocalTime openTime, LocalTime closeTime, boolean concent) {
        super(menus, openTime, closeTime);
        this.concent = concent;
    }

    public boolean hasConcent() {
        return concent;
    }

    @Override
    public String toString() {
        return "MvCafe{" +
                "concent=" + concent +
                ", menus=" + menus +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                '}';
    }
}
