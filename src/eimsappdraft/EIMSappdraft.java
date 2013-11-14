/*
 * To change this template, choose Tools | Templates
 * and open the template in my editor
 */
package eimsappdraft;

import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class EIMSappdraft {

    JPanel cards; //a panel that uses CardLayout
    final static String BUTTONPANEL = "Card with JButtons";
    final static String TEXTPANEL = "Card with JTextField";

    /*      JOptionPane.showMessageDialog(null, "<html><br> Hello Welcome to EIMS,  "
     + "<br> Your group is being populated ");
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("title");
        
        JPanel panel = new JPanel(new MigLayout());

        panel.setSize(400, 400);
        panel.add(new JLabel("label"));
        panel.add(new JTextField("Text field"));
        panel.add(new JLabel("label"));
        panel.add(new JTextField("It's a wrap"));
        panel.add(new JTextArea("Write some shit here"));
        panel.setVisible(true);
        
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
    }
}
