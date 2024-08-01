package StreamingServices;

public class OldStyle {

    private Address adress;
    private String castType;
    
    // before they used to wach movies at casts 
    // thats what Oldstyle all about 
    // we have to take the address for dilvery
    public OldStyle(Address adress, String castType) {
        this.adress = adress;
        this.castType = castType;
    }

    public OldStyle() {
        this(null, "");
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public String getCastType() {
        return castType;
    }

    public void setCastType(String castType) {
        this.castType = castType;
    }

}