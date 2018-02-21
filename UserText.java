package defconbot;
import java.util.ArrayList;
import java.util.Iterator;
public class UserText{
    String userText = "user text";
    String response = "response"; 
    String speaker = "speaker";
    public String getIntent(String inputText) {
        inputText = inputText.toUpperCase();
        if(inputText.contains("WHEN")|| inputText.contains("TIME")){
            WhenIntent whenIntent = new WhenIntent();
            ArrayList<Session> arrayOfSessions = whenIntent.populateIntent(inputText);
            //System.out.println("arrayOfSessins: " + arrayOfSessions);
            ArrayList<String> arrayResponse = new ArrayList();
            for (Session session : arrayOfSessions) {
                String speaker = session.getSpeaker();
                String location = session.getLocation();
                String time = session.getTime();
                arrayResponse.add("Speaker is" + speaker + " and the location is " + location + " and the time is " + time + "\n");
            }
            String response = String.join(",", arrayResponse);
            this.response = response;
            //System.out.println("response: " + response);
            //System.out.println("array Response" + arrayResponse);
        } else if(inputText.contains("WHERE")|| inputText.contains("VENUE")|| inputText.contains("LOCATION")) {
            WhereIntent whereIntent = new WhereIntent();
            ArrayList<Session> arrayOfSessions = whereIntent.populateIntent(inputText);
            //System.out.println("arrayOfSessins: " + arrayOfSessions);
            ArrayList<String> arrayResponse = new ArrayList();
            for (Session session : arrayOfSessions) {
                String speaker = session.getSpeaker();
                String location = session.getLocation();
                String time = session.getTime();
                arrayResponse.add("Speaker is" + speaker + " and the location is " + location + " and the time is " + time + "\n");
            }
            String response = String.join(",", arrayResponse);
            this.response = response;
        } else if(inputText.contains("WHO")|| inputText.contains("SPEAKER")|| inputText.contains("PRESENTER")) {
            WhoIntent whoIntent = new WhoIntent();
            ArrayList<Session> arrayOfSessions = whoIntent.populateIntent(inputText);
            //System.out.println("arrayOfSessins: " + arrayOfSessions);
            ArrayList<String> arrayResponse = new ArrayList();
            for (Session session : arrayOfSessions) {
                String speaker = session.getSpeaker();
                String location = session.getLocation();
                String time = session.getTime();
                arrayResponse.add("Speaker is" + speaker + " and the location is " + location + " and the time is " + time + "\n");
            }
            String response = String.join(",", arrayResponse);
            this.response = response;
        } else{
                response = ("Sorry I can only answer questions about who, where and when");
        }
        return response;
    }
}



        /*        
        if(uText.contains("hi")){
            ChatBot.botSay("Hello there!");
        }
        else if(uText.contains("how are you")){
            int decider = (int) (Math.random()*2+1);
            if(decider == 1){
                botSay("I'm doing well, thanks");
            }
            else if(decider == 2){
                botSay("Not too bad");
            }
        }
        else{
                    int decider = (int) (Math.random()*3+1);
                    if(decider == 1){
                        botSay("I didn't get that");
                    }
                    else if(decider == 2){
                        botSay("Please rephrase that");
                    }
                    else if(decider == 3){
                        botSay("???");
                    }
                }
        */


//ArrayList because I want fast searching and will not be inserting elements
        //ArrayList<String> tokens = new ArrayList<>(
        //Arrays.asList(inputText.split(" ")));
        //System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.size(), tokens);

//response += (" in "             + arrayOfSessions.getLocation().toLowerCase() + "\n");
            //response += ("Bot:    is at "   + arrayOfSessions.getTime());    

//WhereIntent whereIntent = new WhereIntent();
            //ArrayList<Session> arrayOfSessions =  whereIntent.populateIntent(inputText);
            //response = ("The session with " + arrayOfSessions.getSpeaker());
            //response += (" at "             + arrayOfSessions.getTime() + "\n");                
            //response += ("Bot:   is in "    + arrayOfSessions.getLocation().toLowerCase());

    //ArrayList<Session> arrayOfSessions =  whoIntent.populateIntent(inputText);
            //response = ("The session in "   + arrayOfSessions.getLocation().toLowerCase());
            //response += (" at "              + arrayOfSessions.getTime() + "\n");
            //response += ("Bot:   is with "    + arrayOfSessions.getSpeaker());