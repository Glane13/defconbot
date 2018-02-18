package defconbot;
//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.regex.*;
public class WhenIntent extends Intent {
    @Override
    Session populateIntent(String inputText){
        //Check whether the user input mentions a room and if so set the Session object location field
        //regex to look for "Room n" or Roomn"
        String room = "(ROOM)(.*)(\\s?)(\\d+)(.*)";
        Pattern r = Pattern.compile(room);
        Matcher m = r.matcher(inputText);
        if (m.find( )) {
            String location = inputText.substring(m.start(), m.end());
            session.setLocation(location);
        }     
        //Check if the user input mentions a Speaker and if so set the Session object speaker field
        //session.setSpeaker = getSpeaker();
        session.setSpeaker(getSpeaker());
        //Query the time of the session from Jonas' array and set the Session object time field
        session.setTime(getTime());
        return session;
    }

//TO DO: Implement proper getSpeaker method    
    String getSpeaker(){
        String r2 = "Graham Lane";
        return r2;
    }
//TO DO: implement proper getTime method
    String getTime() {
        String r1 = "2:00 pm";
        return r1;
    }
}
