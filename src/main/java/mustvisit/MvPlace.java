package mustvisit;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class MvPlace {
    protected final List<Menu> menus;
    protected LocalTime openTime;
    protected LocalTime closeTime;

    protected MvPlace() {
        this.menus = new ArrayList<>();
    }

    protected MvPlace(List<Menu> menus, LocalTime openTime, LocalTime closeTime) {
        this.menus = menus;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}
