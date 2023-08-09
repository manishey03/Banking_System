package components;

import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {
    public MyLabel (String text){
        super(text);
        setFont(new Font("Arial",Font.PLAIN,12));
    }
}
