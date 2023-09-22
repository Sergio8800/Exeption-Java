package GameDoll;

public class DollForBoy extends Doll{
    public DollForBoy() {
        this(11,"Doll Kent",20,15);;
    }

    public DollForBoy(Integer idDoll, String nameDoll, Integer parcentDoll, Integer quantiteDoll) {
        super(idDoll, nameDoll, parcentDoll, quantiteDoll);
    }

    @Override
    public String toString() {
        return "DollForBoy{" +
                "idDoll=" + idDoll +
                ", nameDoll='" + nameDoll + '\'' +
                ", parcentDoll=" + parcentDoll +
                ", quantiteDoll=" + quantiteDoll +
                ", TYPE='" + TYPE + '\'' +
                '}';
    }
}
