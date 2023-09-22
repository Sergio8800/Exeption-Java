package GameDoll;

public class Doll {
    protected Integer idDoll; // Id
    protected  String nameDoll; // name

    protected Integer parcentDoll; // %
    protected Integer quantiteDoll;
    protected final String TYPE = getClass().getSimpleName();
    public Doll(Integer idDoll, String nameDoll, Integer parcentDoll, Integer quantiteDoll) {
        this.idDoll = idDoll;
        this.nameDoll = nameDoll;
        this.parcentDoll = parcentDoll;
        this.quantiteDoll = quantiteDoll;
    }
    public Integer getIdDoll() {
        return idDoll;
    }

    public String getNameDoll() {
        return nameDoll;
    }

    public Integer getParcentDoll() {
        return parcentDoll;
    }

    public Integer getQuantiteDoll() {
        return quantiteDoll;
    }

    public String getTYPE() {
        return TYPE;
    }



    public void setIdDoll(Integer idDoll) {
        this.idDoll = idDoll;
    }

    public void setNameDoll(String nameDoll) {
        this.nameDoll = nameDoll;
    }

    public void setParcentDoll(Integer parcentDoll) {
        this.parcentDoll = parcentDoll;
    }

    public void setQuantiteDoll(Integer quantiteDoll) {
        this.quantiteDoll = quantiteDoll;
    }
    public String getType(){
        return TYPE;

    }
    @Override
    public String toString (){
        return String.format("%s{name = %s, owner = %s}", TYPE, idDoll, nameDoll);
    }
    public String getType(String arg){
        return arg + TYPE;
    }
}
