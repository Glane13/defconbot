package defconbot;
import java.util.ArrayList;
import java.util.Iterator;

public class Engine {

    public ArrayList mainEngine (Session partialSession) {

        InitialiseDataV3 newData = new InitialiseDataV3();
        Iterator itr = newData.Population().iterator();
        
        String speaker = partialSession.getSpeaker();
        String location = partialSession.getLocation();
        String time = partialSession.getTime();
        String title = partialSession.getTitle();
        System.out.println("from engine speaker: " + partialSession.getSpeaker());
        System.out.println("from engine location: " + partialSession.getLocation());
        System.out.println("from engine Time: " + partialSession.getTime());

        ArrayList<Object> returnList = new ArrayList<>();
        //Session testSession = new Session("Graham", "Room 1", "14:15", "Title");
        //returnList.add(testSession);

        while (itr.hasNext()) {
            Session st = (Session)itr.next();
            if (st.getSpeaker().toUpperCase().contains(speaker) && st.getLocation().toUpperCase().contains(location) && time == "") {
                System.out.println("1:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                System.out.println(st);
            } else if (st.getLocation().toUpperCase().contains(location) && st.getTime().toUpperCase().contains(time) && speaker == "") {
                System.out.println("2:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                System.out.println(st);
            } else if (st.getSpeaker().toUpperCase().contains(speaker) && st.getTime().toUpperCase().contains(time) && location == "") {
                System.out.println("3:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                System.out.println(st);
            } else if (st.getSpeaker().toUpperCase().contains(speaker) && location == "" && time == "") {
                System.out.println("4:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                System.out.println(st);
            } else if (st.getLocation().toUpperCase().contains(location) && speaker == "" && time == "") {
                System.out.println("5:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                System.out.println(st);
            } else if (st.getTime().toUpperCase().contains(time) && speaker == "" && location == "") {
                System.out.println("6:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                //System.out.println(st);
            }

        }

        System.out.println(returnList);
        return returnList;
    }
}