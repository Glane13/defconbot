package defconbot;
//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.regex.*;
public class WhoIntent extends Intent {
    @Override
    Session populateIntent(String inputText){
//TO DO: Check if the user input mentions a time and if so set the Session object time field

        //Check whether the user input mentions a room and if so set the Session object location field
        //regex to look for "Room n" or Roomn"
        String room = "(ROOM)(.*)(\\s?)(\\d+)(.*)";
        Pattern r = Pattern.compile(room);
        Matcher m = r.matcher(inputText);
        if (m.find( )) {
            String location = inputText.substring(m.start(), m.end());
            session.setLocation(location);
        } 
//TO DO: Implement method to query Jonas' session library looking for Speaker name
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
