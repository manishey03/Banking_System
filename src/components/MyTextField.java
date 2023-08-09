package components;

import javax.swing.*;

public class MyTextField extends JTextField {
    // This is the constructor that takes a String argument for the text to be displayed on the text field.
    public MyTextField(String text){
        super(text);
        setColumns(22);

    }
}
