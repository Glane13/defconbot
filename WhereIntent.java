package defconbot;
//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.regex.*;
public class WhereIntent extends Intent {
    @Override
    ArrayList<Session> populateIntent(String inputText){    
        session.setSpeaker     (getSpeaker(inputText));
        //session.setLocation    (getLocation(inputText));
        session.setTime        (getTime(inputText));
        //System.out.println(session.getLocation());
        //System.out.println(session.getTime());
        Engine engine = new Engine();
        arrayOfSessions = engine.mainEngine(session);
        return arrayOfSessions;  
    }
/*
    @Override
    public String getLocation(String inputText){
        String location = ;
        return location;
    }
*/
}