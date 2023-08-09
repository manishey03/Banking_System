package components;

import javax.swing.*;
import java.awt.*;
//This code defines a class called "MyButton" that extends the JButton class.
public class MyButton extends JButton {
    //has a constructor that takes a String argument for the button's label text.
    public MyButton(String text){
        //calls the super constructor of the JButton class and passes in the text argument.
        super(text);
        // sets the font of the button to Arial with a plain style and size 15.
        setFont(new Font("Arial",Font.PLAIN,15));
    }
}
