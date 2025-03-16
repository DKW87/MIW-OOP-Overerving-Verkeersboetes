package model;

public class SnelheidsBoete extends VerkeersBoete {

    // attributen

    private int gemetenSnelheid;
    private int maximumSnelheid;

    // constructors

    public SnelheidsBoete(String naamDader, String kentekenAuto, int gemetenSnelheid, int maximumSnelheid) {
        super(naamDader, kentekenAuto);
        this.gemetenSnelheid = gemetenSnelheid;
        this.maximumSnelheid = maximumSnelheid;
        this.bepaalBedrag();
    }

    // methoden

    public void bepaalBedrag() {
        int bovenMaxKM = this.gemetenSnelheid - this.maximumSnelheid;
        final int BOETE_1_ONDERGRENS = 0;
        final int BOETE_2_ONDERGRENS = 10;
        final int BOETE_3_ONDERGRENS = 30;
        final double BOETE_1_BEDRAG_PER_KM = 10.0;
        final double BOETE_2_BEDRAG_PER_KM = 15.0;
        final double BOETE_3_BEDRAG_PER_KM = 20.0;
        final double MAX_BOETE_BEDRAG = 1000.0;

        if (bovenMaxKM > BOETE_1_ONDERGRENS && bovenMaxKM <= BOETE_2_ONDERGRENS) {
            super.setBedrag(bovenMaxKM * BOETE_1_BEDRAG_PER_KM);
        } else if (bovenMaxKM > BOETE_2_ONDERGRENS && bovenMaxKM <= BOETE_3_ONDERGRENS) {
            super.setBedrag(bovenMaxKM * BOETE_2_BEDRAG_PER_KM);
        } else {
            if (bovenMaxKM * BOETE_3_BEDRAG_PER_KM <= MAX_BOETE_BEDRAG) {
                super.setBedrag(bovenMaxKM * BOETE_3_BEDRAG_PER_KM);
            } else {
                super.setBedrag(MAX_BOETE_BEDRAG);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("Verkeersboete", "Snelheidsboete") + " voor " + this.gemetenSnelheid + " km/u waar maximaal " + this.maximumSnelheid + " km/u is toegestaan.";
    }

    // getters en setters

    public int getGemetenSnelheid() {
        return gemetenSnelheid;
    }

    public void setGemetenSnelheid(int gemetenSnelheid) {
        this.gemetenSnelheid = gemetenSnelheid;
    }

    public int getMaximumSnelheid() {
        return maximumSnelheid;
    }

    public void setMaximumSnelheid(int maximumSnelheid) {
        this.maximumSnelheid = maximumSnelheid;
    }
}
