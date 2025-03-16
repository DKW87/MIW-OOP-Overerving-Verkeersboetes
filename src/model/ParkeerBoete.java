package model;

public class ParkeerBoete extends VerkeersBoete {

    // attributen

    private int zone;

    // constructors

    public ParkeerBoete(String naamDader, String kentekenAuto, int zone) {
        super(naamDader, kentekenAuto);
        this.zone = zone;
        this.bepaalBedrag();
    }

    // methoden

    public void bepaalBedrag() {
        final double BOETE_ZONE_1 = 60.0;
        final double BOETE_ZONE_2 = 100.0;
        final double BOETE_ZONE_3 = 180.0;

        if (zone == 1) {
            super.setBedrag(BOETE_ZONE_1);
        } else if (zone == 2) {
            super.setBedrag(BOETE_ZONE_2);
        } else if (zone == 3) {
            super.setBedrag(BOETE_ZONE_3);
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("Verkeersboete", "Parkeerboete") + " in zone " + zone + ".";
    }

    // getters en setters


    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}
