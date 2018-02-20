package defconbot;
import java.util.regex.*;
public class WhenIntent extends Intent {
    @Override
    Session populateIntent(String inputText){    
        session.setSpeaker     (getSpeaker(inputText));
        session.setTime        (getTime(inputText));
        session.setLocation    (getLocation(inputText));
        return session;  
    }
    @Override
    public String getTime(String inputText){
        String time = "<get time from Jonas>";
        return time;
    }
}