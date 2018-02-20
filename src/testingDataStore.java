import DataStore.DefConData;

import java.io.IOException;

public class testingDataStore {

    public static void main(String[] args) throws Exception {

        DefConData thursday = new DefConData();
        DefConData friday = new DefConData();

        try {
            // Thursday conferences
            thursday.addToInnerArray(0, "10:00");
            thursday.addToInnerArray(1,0,"Room 1");
            thursday.addToInnerArray(2,0,"Clarence Chio");
            thursday.addToInnerArray(3,0,"'Machine Duping 101: Pwning Deep Learning Systems'");

            thursday.addToInnerArray(0,1,"11:00");
            thursday.addToInnerArray(1,1,"Room 1");
            thursday.addToInnerArray(2,1,"Shane Steiger");
            thursday.addToInnerArray(3,1,"'Maelstrom - Are You Playing with a Full Deck?'");

            thursday.addToInnerArray(0,2,"12:00");
            thursday.addToInnerArray(1,2,"Room 1");
            thursday.addToInnerArray(2,2,"Sean Metcalf");
            thursday.addToInnerArray(3,2,"'Beyond the MCSE: Red Teaming Active Directory'");

            thursday.addToInnerArray(0,3,"13:00");
            thursday.addToInnerArray(1,3,"Room 1");
            thursday.addToInnerArray(2,3,"Nicholas Rosario (MasterChen)");
            thursday.addToInnerArray(3,3,"'Weaponize Your Feature Codes'");

            // FRIDAY Conferences
            friday.addToInnerArray(0, "10:00");
            friday.addToInnerArray(1,0,"Room 1");
            friday.addToInnerArray(2,0,"Jay Healey");
            friday.addToInnerArray(3,0,"'Feds and 0Days: From Before Heartbleed to After FBI-Apple'");

            friday.addToInnerArray(0, "10:00");
            friday.addToInnerArray(1,1,"Room 2");
            friday.addToInnerArray(2,1,"Mike Walker & Dr. Arati Prabhakar");
            friday.addToInnerArray(3,1,"'DARPA Cyber Grand Challenge Award Ceremony'");


            friday.addToInnerArray(0, "10:00");
            friday.addToInnerArray(1,2,"Room 3");
            friday.addToInnerArray(2,2,"Jonathan Brossard (endrazine)");
            friday.addToInnerArray(3,2,"'Introduction the Wichcraft Compiler Collection: Towards universal code theft'");


//            thursday.addToInnerArray(2,0,"Jessica");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(thursday);
        System.out.println(friday);
    }
}