package GameDoll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
//        viewCommon.getDoll();
        Random random = new Random();

        Doll[] dollList = {barby1, barby2, barby4, barby3, kent1,kent2,kent,kent3};
//        Doll[] dollList  = viewCommon;

        Doll doll= dollList[random.nextInt(dollList.length)]; // выпадание из списка возможных кукл
        System.out.println(Arrays.toString(new Doll[]{doll}));
        int luke = 100/doll.parcentDoll;
        String[] listLuke = new String[luke+1];
        for (int i = 0; i < luke; i++) {
            listLuke[i]="null";
            System.out.println(listLuke[i]);
        }
        listLuke[0] = doll.nameDoll;
        String finish = listLuke[random.nextInt(listLuke.length)]; // выподание из вероятности выпавшей куклы
        if (finish == "null"){
            System.out.println("Вы проиграли(");
        }else {
            System.out.println("Вы выиграли!!! куклу=> " + doll.nameDoll);
        }
        System.out.println("======finish========");
        System.out.println(finish);




//        String[] myString = {"раз", "два", "три", "четыре", "пять"};
//        String newWord1 = myString[random.nextInt(myString.length)];
//        System.out.println(Arrays.toString(new String[]{newWord1}));
//
//        String[][] words = {{"G", "a", "m", "e"}, {"C", "l", "e", "v", "a", "g", "e"}, {"F", "r", "a", "n", "k"},
//                {"D", "i", "s", "d", "a", "i", "n"}, {"B", "a", "c", "k", "s", "t", "a", "i", "r", "s"},
//                {"A", "m", "n", "e", "s", "t", "y"}, {"D", "i", "s", "c", "o", "m", "f", "o", "r", "t"},
//                {"E", "n", "v", "y"}, {"D", "i", "s", "h", "o", "n", "e", "s", "t", "y"}, {"B", "o", "r", "e", "r"}};
//
//        String[] newWord = words[random.nextInt(words.length)];
//        System.out.println(Arrays.toString(newWord));
    }

}
