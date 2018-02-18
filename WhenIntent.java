package defconbot;
//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.regex.*;
public class WhenIntent extends Intent {
    @Override
    Session populateIntent(String inputText){    
        session.setSpeaker(getSpeaker());
        session.setTime(getTime());
        session.setLocation(getLocation(inputText));
        return session;  
    }
}
