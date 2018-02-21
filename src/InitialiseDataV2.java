import java.util.ArrayList;
import java.util.Iterator;

public class InitialiseDataV2 {
    
    //public static void main(String[] args) {
    public ArrayList Population() {

        Session s1 = new Session("Min(Spark) Zheng & Xiangyu Liu", "101 Track", "10:00", "macOS/iOS Kernel Debugging and Heap Feng Shui");
        Session s2 = new Session("The Dark Tangent", "Track Two", "10:00", "Welcome to DEF CON 25");
        Session s3 = new Session("Garry Kasparov", "Track Three", "10:00", "The Brain’s Last Stand");
        Session s4 = new Session("Peyton ‘Foofus’ Engel", "Track Four", "10:00", "Secret Tools: Learning About Government Surveillance Software You Can’t Ever See");
        Session s5 = new Session("Patrick Wardle", "101 Track", "10:30", "Offensive Malware Analysis: Dissecting OSX/FruitFly via a Custom C&C Server");

        ArrayList<Object> defConSessions = new ArrayList<>();

        try {

            defConSessions.add(s1);
            defConSessions.add(s2);
            defConSessions.add(s3);
            defConSessions.add(s4);
            defConSessions.add(s5);

        } catch (Exception e) {

            System.out.println(e);
        }

        return defConSessions;
    }
}
