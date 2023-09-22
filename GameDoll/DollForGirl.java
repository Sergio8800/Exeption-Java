package GameDoll;

import java.util.Random;

public class DollForGirl extends Doll{
    public DollForGirl(){
        this(1,"Doll Barby",20,15);
    }
    public DollForGirl(Integer idDoll, String nameDoll, Integer parcentDoll, Integer quantiteDoll) {
        super(idDoll, nameDoll, parcentDoll, quantiteDoll);
    }

    @Override
    public String toString() {
        return "DollForGirl{" +
                "idDoll=" + idDoll +
                ", nameDoll='" + nameDoll + '\'' +
                ", parcentDoll=" + parcentDoll +
                ", quantiteDoll=" + quantiteDoll +
                ", TYPE='" + TYPE + '\'' +
                '}';
    }
}
