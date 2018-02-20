package defconbot;
public class UserText{
    String userText = "user text";
    String response = "response";   
    public String getIntent(String inputText) {
        inputText = inputText.toUpperCase();
        if(inputText.contains("WHEN")|| inputText.contains("TIME")){
            WhenIntent whenIntent = new WhenIntent();
            Session session = whenIntent.populateIntent(inputText);
            response = ("The session with " + session.getSpeaker());
            response += (" in "             + session.getLocation().toLowerCase() + "\n");
            response += ("Bot:    is at "   + session.getTime());    
        } else if(inputText.contains("WHERE")|| inputText.contains("VENUE")|| inputText.contains("LOCATION")) {
            WhereIntent whereIntent = new WhereIntent();
            Session session = whereIntent.populateIntent(inputText);
            response = ("The session with " + session.getSpeaker());
            response += (" at "             + session.getTime() + "\n");                
            response += ("Bot:   is in "    + session.getLocation().toLowerCase());
        } else if(inputText.contains("WHO")|| inputText.contains("SPEAKER")|| inputText.contains("PRESENTER")) {
            WhoIntent whoIntent = new WhoIntent();
            Session session = whoIntent.populateIntent(inputText);
            response = ("The session in "   + session.getLocation().toLowerCase());
            response += (" at "              + session.getTime() + "\n");
            response += ("Bot:   is with "    + session.getSpeaker());
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