package defconbot;
//import java.util.ArrayList;
//import java.util.Arrays;
public abstract class Intent {
    String inputText = "x";
    String speaker = "y";
    Session session = new Session();
    abstract Session populateIntent(String inputText);
}


//ArrayList<String> tokens = new ArrayList<>(
//Arrays.asList(inputText.split(" ")));
//System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.size(), tokens);