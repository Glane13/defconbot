package defconbot;
//import javax.swing.JOptionPane;
public class UserText{
    String userText = "user text";
    String response = "response";
    public String getResponse(String inputText) {
        userText = inputText; 
        response = ("The Bot says that you said: " + userText);
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