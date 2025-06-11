import java.awt.*;
import java.awt.event.*;

class AEvent extends Frame implements ActionListener{
    TextField tf;
    AEvent(){
        // create component
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button ("click me");
        b.setBounds(100,120,80,30);
        // register listener 
        b.addActionListener(this);
        // add components and setsize,layout and visibility
        add(b); 
        add(tf);
        setsize (300,300);
        setlayout(null);
        setvisible(true);
        }
        public action performed (ActionEvent e){
            tf.setText("Welcome");
        }
        public static void main(String args[]){
            new AEvent();
        }
}