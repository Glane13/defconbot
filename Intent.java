package defconbot;
//import java.util.ArrayList;
//import java.util.Arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Intent {
    String inputText = "x";
    String speaker = "y";
    Session session = new Session();
    abstract Session populateIntent(String inputText);
    
    String getLocation (String inputText) {
        //Check whether the user input mentions a room and if so set the Session object location field
        //regex to look for "Room n" or Roomn"
        String location ="x";
        String room = "(ROOM)(.*)(\\s?)(\\d+)(.*)";
        Pattern r = Pattern.compile(room);
        Matcher m = r.matcher(inputText);
        if (m.find( )) {
            location = inputText.substring(m.start(), m.end());
        } 
        return location;
    }
    
    //TO DO: Implement proper getSpeaker method that queries Jonas' array
    //Check if the user input mentions a Speaker and if so set the Session object speaker field
    String getSpeaker(){
        String speaker = "Graham Lane";
        return speaker;
    }
    
    //TO DO: implement proper getTime method
    String getTime() {
        String time = "2:00 pm";
        return time;
    }
    
}



//ArrayList<String> tokens = new ArrayList<>(
//Arrays.asList(inputText.split(" ")));
//System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.size(), tokens);