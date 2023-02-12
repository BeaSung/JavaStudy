package mustvisit;

import java.util.ArrayList;
import java.util.List;

public class MvPlaceMap {
    private final List<MvPlace> mvPlaces;

    public MvPlaceMap(List<MvPlace> mvPlaces) {
        this.mvPlaces = mvPlaces;
    }

    // mvPlaces 리스트를 하나하나씩 순회하면서 MvCafe 인 경우만 리스트로 모아서 리턴
    public List<MvCafe> getCafes() {
        List<MvCafe> cafes = new ArrayList<>(); // 바구니를 생성
        // Enhanced for loop
        // `for (타입 변수명 : 컬렉션(List,Set,Map)/배열)`
        // 컬렉션에 있는 값을 하나씩 순회하면서 꺼낸 값을 변수에 저장.
        for (MvPlace mvPlace : this.mvPlaces) {
//            if (mvPlace instanceof MvCafe) {
//                MvCafe cafe = (MvCafe) mvPlace;
//                cafe.hasConcent();
//            }

            // [타입을 체크하고 싶은 변수명] instanceof [타입] => return true or false
            // if ([타입을 체크하고 싶은 A변수명] instanceof [타입] [B변수명])
                // 타입이 맞다면, 형변환하여 B변수에 값을 할당해줌
            if (mvPlace instanceof MvCafe cafe) {
                cafes.add(cafe);    // 바구니에 아이템을 담는것
            }
        }

//        // for loop
//        for (int i = 0; i < mvPlaces.size(); i++) {
//            MvPlace mvPlace = mvPlaces.get(i);
//            if (mvPlace instanceof MvCafe mvCafe) {
//                cafes.add(mvCafe);
//            }
//        }
        return cafes;
    }

    @Override
    public String toString() {
        return "MvPlaceMap{" +
                "mvPlaces=" + mvPlaces +
                '}';
    }
}
