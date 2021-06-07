package kos.maty;

import java.util.*;

public class main {


    public static void main(String[] args) {

   /*
        System.out.println("Alfa romeo: ");
        Cars one = new BMW("Mito ","1555cc ","Yellow ");
        System.out.println(one.getOutData());
        Cars two = new BMW("Gulia ","3200cc ","Black ");
        System.out.println(two.getOutData());
        Cars newOne = new BMW("4C ","1750cc ","Blue ");
        System.out.println(newOne.getOutData());
        Cars newTwo = new BMW("Gulietta ","2000cc ","Violet ");
        System.out.println(newTwo.getOutData());
        System.out.println("Skoda: ");
        Cars shrot = new BMW("ocvtavia ","1600cc ","grey ");
        System.out.println(shrot.getOutData());
        Cars shrot2 = new BMW("felcia ","1400cc ","silver ");
        System.out.println(shrot2.getOutData());
        */

        ArrayList<Cars> carsToRent = new ArrayList<Cars>();

        carsToRent.add(new BMW("550", 5000 , "Violet "));
        carsToRent.add(new BMW("i7", 400, "Black "));
        carsToRent.add(new BMW("m3", 5000 , "Red "));
        carsToRent.add(new BMW("740", 4000 , "Yellow "));
        carsToRent.add(new Alfa("Gulia", 3200 , "Red"));
        carsToRent.add(new Alfa("Gulietta", 1400 , "Oragne"));
        carsToRent.add(new Alfa("MiTo", 1400, "Blue"));
        carsToRent.add(new Alfa("4C", 1750 , "White"));
        carsToRent.add(new Skoda("Octavia", 1600, "Sivler"));
        carsToRent.add(new Skoda("Fabia", 1400 , "Green"));
        carsToRent.add(new Skoda("Superb", 2000 , "Grey"));
        carsToRent.add(new Skoda("Kodiaq", 1800, "Purple"));


       // System.out.println(Arrays.toString(carsToRent.toArray()));


       /* List<String> names = Arrays.asList("Adam","Kamil","Chierofnat");
        Collections.sort(names);
       */



        Comparator<Cars> compareByColor = (Cars o1, Cars o2) -> o1.getColor().compareTo(o2.getColor());

        Collections.sort(carsToRent, compareByColor);

        for (int i = 0; i < carsToRent.size(); i++) {

            System.out.println(carsToRent.get(i));
        }





        /*for (int i = 0; i < carsToRent.size(); i++) {

            System.out.println(carsToRent.get(i));
        }*/


    }
}
