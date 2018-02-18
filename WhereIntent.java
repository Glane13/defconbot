package defconbot;
//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.regex.*;
public class WhereIntent extends Intent {
    @Override
    Session populateIntent(String inputText){    
        session.setSpeaker  (getSpeaker(inputText));
        session.setTime     (getTime(inputText));
        session.setLocation (getLocation(inputText));
        return session;  
    }
    @Override
    public String getLocation(String inputText){
        String location = "<get location from Jonas>";
        return location;
    }
}