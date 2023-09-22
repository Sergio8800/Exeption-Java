package GameDoll;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DollForGirl barby1 = new DollForGirl(1,"Barby",20,15);
        DollForGirl barby2 = new DollForGirl(2,"Barby1",22,11);
        DollForGirl barby3 = new DollForGirl(3,"Barby2",23,12);
        DollForGirl barby4 = new DollForGirl(4,"Barby3",25,19);
        DollForBoy kent = new DollForBoy(77,"Kent",64,22);
        DollForBoy kent1 = new DollForBoy(5,"Kent1",33,33);
        DollForBoy kent2 = new DollForBoy(6,"Kent2",44,45);
        DollForBoy kent3 = new DollForBoy(7,"Kent3",5,11);
        View viewCommon = new View();
        viewCommon.addDoll(barby1).addDoll(barby3).addDoll(barby2).addDoll(barby4).addDoll(kent)
                .addDoll(kent1).addDoll(kent2).addDoll(kent3);
        viewCommon.getDolls();

    }

}
