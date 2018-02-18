package defconbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ChatBot extends JFrame {
    private JTextField txtEnter = new JTextField();  //Typing Area: 
    private JTextArea txtChat = new JTextArea(); //Chat Area:

    public static void main(String[] args){
        ChatBot chatBot = new ChatBot();
    }
    
    public ChatBot() {
        //Frame Attributes:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("DefConBot");
        UserText userText = new UserText();

        //txtEnter Attributes:
        txtEnter.setLocation(2, 540);
        txtEnter.setSize(590, 30);
         
        //txtEnter Action Event:
        
        txtEnter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                String uText = txtEnter.getText();
                txtChat.append("You: " + uText + "\n");
                txtChat.append("Bot: " + userText.getIntent(uText) + "\n");
                txtEnter.setText("");
            }
        });

        //txtChat Attributes:
        txtChat.setLocation(15, 5);
        txtChat.setSize(560, 510);
        txtChat.setEditable(false);

        //Add Items To Frame:
        this.add(txtEnter);
        this.add(txtChat);
    }    
//    public void botSay(String s){
//        txtChat.append("AI: " + s + "\n");
//    }
}
