package model;

public class VerkeersBoete {

    // attributen

    private String naamDader;
    private String kentekenAuto;
    private double bedrag;

    // constructors

    public VerkeersBoete() {
        this("Onbekend", "Onebekend");
    }

    public VerkeersBoete(String naamDader, String kentekenAuto) {
        this(naamDader, kentekenAuto, 0.0);
    }

    private VerkeersBoete(String naamDader, String kentekenAuto, double bedrag) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
        this.bedrag = bedrag;
    }

    // methoden

    @Override
    public String toString() {
        return "Verkeersboete voor " + naamDader + ", kenteken " + kentekenAuto + ", " + bedrag + " euro";
    }

    // getters en setters


    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }
}
