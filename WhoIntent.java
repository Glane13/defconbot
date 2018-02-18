package defconbot;
import java.util.regex.*;
public class WhoIntent extends Intent {
    @Override
    Session populateIntent(String inputText){    
        session.setSpeaker      (getSpeaker(inputText));
        session.setTime         (getTime(inputText));
        session.setLocation     (getLocation(inputText));
        return session;  
    }
    @Override
    public String getSpeaker(String inputText){
        String speaker = "<get speaker from Jonas>";
        return speaker;
    }
}