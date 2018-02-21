package defconbot;

//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class ChatBot extends JFrame  {
    JFrame frame = new JFrame();
    JPanel welcomePanel = new JPanel(new BorderLayout());
    JPanel innerWelcomePanel = new JPanel(new BorderLayout());
    JPanel dialogPanel  = new JPanel(new BorderLayout());
    JPanel innerDialogPanel = new JPanel(new BorderLayout());
    JPanel inputPanel   = new JPanel(new BorderLayout());
    JLabel welcomeImage = new JLabel("Welcome Image");
    JLabel welcomeText  = new JLabel("Welcome!");
    JTextArea txtChat   = new JTextArea();
    JTextField txtEnter = new JTextField("Type your question here");
    
    public static void main(String[] args){
        ChatBot chatBot = new ChatBot();
        
    }
    
    public ChatBot() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,800);
        frame.setTitle("DEFCONBOT");
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        
        welcomePanel.add(welcomeImage, BorderLayout.NORTH);
        welcomePanel.add(welcomeText,BorderLayout.CENTER);
        welcomePanel.setBackground(Color.CYAN);
        welcomePanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        dialogPanel.add(txtChat,BorderLayout.SOUTH); 
        dialogPanel.setBackground(Color.CYAN);
        dialogPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        inputPanel.setBackground(Color.CYAN);      
        inputPanel.add(txtEnter);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        frame.add(welcomePanel,BorderLayout.NORTH);
        frame.add(dialogPanel,BorderLayout.CENTER);
        frame.add(inputPanel,BorderLayout.SOUTH);
        
        Icon defconImage = new ImageIcon(getClass().getResource( "defcon.png"));
        welcomeImage.setIcon(defconImage);
          
        String message = ("<html>   <h1>DEFCONBOT</h1><br/");
        message += ("    I'm a Baby Bot ... but I'm trying to get better <br/>");
        message += ("    I can answer Who? Where? and When? questions about DefCon speakers <br/>");
        message += ("    I can only understand time when it is written like this: 10:45 <br/>");
        message += ("    I can only answer questions with two parameters like: Who is speaking in Room 7 at 14:00? <br/>");
        message += ("    I need to get better at checking that the times entered are correct <br/>");
        message += ("    Also, I need to work with Jonas to get information from his array <br/>");
        message += ("</html>");    
        welcomeText.setText(message); 
       
        UserText userText = new UserText();
        
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                txtEnter.requestFocus();
            }
         });
   
        //txtEnter Action Event: 
        txtEnter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                String uText = txtEnter.getText();
                txtChat.append("You: " + uText + "\n");
                txtChat.append("Bot: " + userText.getIntent(uText) + "\n");
                txtEnter.setText("");
            }
        });
    }
}