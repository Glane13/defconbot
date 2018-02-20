package defconbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
//import java.awt.FlowLayout;


public class ChatBot extends JFrame {
    private JLabel txtWelcome = new JLabel();
    private JTextArea txtChat = new JTextArea(); //Dialog area
    private JTextField txtEnter = new JTextField();  //User input area
    
    public static void main(String[] args){
        ChatBot chatBot = new ChatBot();
    }
    
    public ChatBot() {
        //Frame Attributes:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("DefConBot");
        UserText userText = new UserText();
    
        //txtWelcome Attributes:
        txtWelcome.setLocation(20, 2);
        txtWelcome.setSize(660, 150);
        
        //txtChat Attributes:
        txtChat.setLocation(20, 252);
        txtChat.setSize(660, 150);
        txtChat.setEditable(false);

        //txtEnter Attributes:
        txtEnter.setLocation(20, 504);
        txtEnter.setSize(660, 30);
        
        //Add Items To Frame:
        this.add(txtWelcome);
        this.add(txtChat);
        this.add(txtEnter);
        
        //txtEnter Action Event: 
        txtEnter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                String uText = txtEnter.getText();
                txtChat.append("You: " + uText + "\n");
                txtChat.append("Bot: " + userText.getIntent(uText) + "\n");
                txtEnter.setText("");
            }
        });
        String message = ("Welcome! " +  "\n");
        message = ("<html>Welcome <br/>");
        message += ("I'm a Baby Bot ... but I'm trying to get better <br/>");
        message += ("I can answer Who? Where? and When? questions about DefCon speakers <br/>");
        message += ("I can only understand time when it is written like this: 10:45 <br/>");
        message += ("I can only answer questions with two parameters like: Who is speaking in Room 7 at 14:00> <br/>");
        message += ("I need to get better at checking that the times entered are correct <br/>");
        message += ("Also, I need to work with Jonas to get information from his array <br/>");
        message += ("</html>");
        txtWelcome.setText(message); 
        
        //Add Items To Frame:
        this.add(txtWelcome);
        this.add(txtChat);
        this.add(txtEnter);
    }    
//    public void botSay(String s){
//        txtChat.append("AI: " + s + "\n");
//    }
}
