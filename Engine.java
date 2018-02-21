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

        ArrayList<Object> returnList = new ArrayList<>();

        while (itr.hasNext()) {
            Session st = (Session)itr.next();
            if (st.getSpeaker().contains(speaker) && st.getLocation().contains(location) && time == "") {
                //System.out.println("1:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                //System.out.println(st);
            } else if (st.getLocation().contains(location) && st.getTime().contains(time) && speaker == "") {
                //System.out.println("2:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                //System.out.println(st);
            } else if (st.getSpeaker().contains(speaker) && st.getTime().contains(time) && location == "") {
                //System.out.println("3:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                //System.out.println(st);
            } else if (st.getSpeaker().contains(speaker) && location == "" && time == "") {
                //System.out.println("4:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                //System.out.println(st);
            } else if (st.getLocation().contains(location) && speaker == "" && time == "") {
                //System.out.println("5:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                //System.out.println(st);
            } else if (st.getTime().contains(time) && speaker == "" && location == "") {
                //System.out.println("6:: " + st.getSpeaker() + " :: " + st.getLocation() + " :: " + st.getTime() + " :: " + st.getTitle());
                returnList.add(st);
                //System.out.println(st);
            }

        }

        //System.out.println(returnList);
        return returnList;
    }
}


