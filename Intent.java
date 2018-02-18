package defconbot;
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
        String room = "(ROOM)(\\s?)(\\d+)";
        Pattern locPat = Pattern.compile(room);
        Matcher locMat = locPat.matcher(inputText);
        if (locMat.find( )) {
            location = inputText.substring(locMat.start(), locMat.end());
        } 
        return location;
    }
    
    //TO DO: Implement proper getSpeaker method that queries Jonas' array
    //Check if the user input mentions a Speaker and if so set the Session object speaker field
    String getSpeaker(String inputText){
        String speaker = "<get name from Jonas>";
        return speaker;
    }
    
    String getTime(String inputText) {
        //Check whether the user input mentions a time and if so set the Session object time field
        //regex to look for "Room n" or Roomn"
        //boolean found = false;
        //String inputText = ("When is Smith 13:30 room 7");
        String time ="x";
        //timePattern needs further validation for times like 24:15
        String timePattern = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        Pattern timePat = Pattern.compile(timePattern);
        Matcher timeMat = timePat.matcher(inputText);
        if (timeMat.find( )) {
            time = inputText.substring(timeMat.start(), timeMat.end());
            //System.out.println("WORKED");
            //System.out.println("Found: " + found);
            //System.out.println("Time: " + time);
        } else {
            //System.out.println("DIDN'T WORK");
            //System.out.println("Found: " + found);
            //System.out.println("Time: " + time);
        }
        return time;
    }
}


//ArrayList<String> tokens = new ArrayList<>(
//Arrays.asList(inputText.split(" ")));
//System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.size(), tokens);