package controller;

import model.ParkeerBoete;
import model.SnelheidsBoete;
import model.VerkeersBoete;

public class VerkeersboeteMainController {

    public static void main(String[] args) {

        ParkeerBoete[] mijnParkeerBoetes = new ParkeerBoete[3];
        mijnParkeerBoetes[0] = new ParkeerBoete("Gerrit", "04-SPZ-8", 1);
        mijnParkeerBoetes[1] = new ParkeerBoete("Flubber", "09-SPZ-1", 2);
        mijnParkeerBoetes[2] = new ParkeerBoete("Brenda", "12-SPZ-4", 3);

        SnelheidsBoete[] mijnSnelheidsBoetes = new SnelheidsBoete[3];
        mijnSnelheidsBoetes[0] = new SnelheidsBoete("Pietje", "12-SPZ-4", 500, 120);
        mijnSnelheidsBoetes[1] = new SnelheidsBoete("Henkie", "12-SPZ-4", 155, 120);
        mijnSnelheidsBoetes[2] = new SnelheidsBoete("Theo", "12-SPZ-4", 55, 50);

        for (int i = 0; i < mijnSnelheidsBoetes.length; i++) {
            System.out.println(mijnParkeerBoetes[i]);
        }

        for (int i = 0; i < mijnSnelheidsBoetes.length; i++) {
            System.out.println(mijnSnelheidsBoetes[i]);
        }


    }

}
