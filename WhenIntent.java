package defconbot;
import java.util.ArrayList;
import java.util.regex.*;
public class WhenIntent extends Intent {
    @Override
    ArrayList<Session> populateIntent(String inputText){    
        session.setSpeaker     (getSpeaker(inputText));
        session.setLocation    (getLocation(inputText));
        //session.setTime        (getTime(inputText));
        Engine engine = new Engine();
        arrayOfSessions = engine.mainEngine(session);
        return arrayOfSessions;  
    }
/*    @Override
    public String getTime(String inputText){
        String time = "<get time from session library>";
        return time;
    }
*/
}