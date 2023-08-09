package components;

import javax.swing.*;
import java.awt.*;
// This code defines a public class called "MyHeading" that inherits from the JLabel class.
public class MyHeading extends JLabel {
    // The class contains a constructor that takes a String argument representing the text to be displayed on the label.
    public MyHeading(String text) {
        //The constructor calls the parent constructor using the super() method and passes the text argument to it.
        super(text);
        //The constructor also sets the font of the label to "Arial", bold, and size 20 using the setFont() method.
        setFont(new Font("Arial", Font.BOLD, 20));
    }

}

