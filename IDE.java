package org.IDE.IDE;
import java.awt.*;
import java.awt.event.*;
public class IDE {
            private Frame frame; private TextArea textArea;
            public IDE() { frame.setSize(800, 600); frame.addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent windowEvent) {
            System.exit(0); }  }); textArea = new TextArea(); 
            frame.add(textArea); frame.setVisible(true); } public static void main(String[] args) { new IDE(); }  }
