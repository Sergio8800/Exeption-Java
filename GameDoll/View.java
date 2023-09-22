package GameDoll;

import java.util.ArrayList;
import java.util.List;

public class View {
    private List<Doll> dolls;

    public View() {
        this.dolls = new ArrayList<>();
    }
    public View addDoll(Doll doll){
        dolls.add(doll);
        return this;
    }

//    public List<Doll> getDolls() {
//        return dolls;
//    }
    public List<Doll> getDoll() {
        List<Doll> result = new ArrayList<>();
        for (Doll doll : dolls) {
            System.out.println(doll.quantiteDoll);
        }

        return result;
    }

}
