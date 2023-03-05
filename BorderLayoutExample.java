/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borderlayoutexample;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import javax.swing.JFrame;
public class BorderLayoutExample extends JFrame {

    
    public static void main(String[] args) {
        BorderLayoutExample a = new BorderLayoutExample();
    }
    
public BorderLayoutExample() {

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        BorderLayout b = new BorderLayout();
        setTitle("Harsh");

        setSize(300, 300);
        add(new Button("North"), BorderLayout.NORTH);
        add(new Button("South"), BorderLayout.SOUTH);
        add(new Button("East"), BorderLayout.EAST);
        add(new Button("West"), BorderLayout.WEST);
        add(new Button("Center"), BorderLayout.CENTER);

    }
}
