package mustvisit;

import java.time.LocalTime;
import java.util.List;

public class MvRestaurant extends MvPlace {
    private final FoodCategory category;
    private LocalTime breakStartTime;
    private LocalTime breakEndTime;

    public MvRestaurant(List<Menu> menus, LocalTime openTime, LocalTime closeTime, FoodCategory category, LocalTime breakStartTime, LocalTime breakEndTime) {
        super(menus, openTime, closeTime);
        this.category = category;
        this.breakStartTime = breakStartTime;
        this.breakEndTime = breakEndTime;
    }
}
