package defconbot;
//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.regex.*;
public class WhereIntent extends Intent {
    @Override
    Session populateIntent(String inputText){
//TO DO: Check if the user input mentions a time and if so set the Session object time field

        //Check if the user input mentions a Speaker and if so set the Session object speaker field
        session.setSpeaker(getSpeaker());
        session.setTime(getTime());
        return session;
    }
    
//TO DO: Implement method to query Jonas' session library looking for Speaker name
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