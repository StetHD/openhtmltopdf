package org.xhtmlrenderer.demo.photogallery;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import org.xhtmlrenderer.simple.*;

public class PhotoGallery {

    public static void main(String[] args) throws Exception {
                
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        XHTMLPanel panel = new XHTMLPanel();
        Dimension size = new Dimension(200,200);
        panel.setPreferredSize(size);
        panel.setDocument(new File("demos/photogallery/xhtml/gallery.xhtml").toURL());
        
        JScrollPane scroll = new JScrollPane(panel);
        
        JFrame frame = new JFrame("PhotoGallery");        
        frame.getContentPane().add(scroll);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }

}