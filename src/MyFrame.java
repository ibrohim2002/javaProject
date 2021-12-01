import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

    JButton homeButton;
    JButton bookButton;
    JButton contactButton;
    JButton aboutButton;
    JLabel homeLabel;
    JLabel bookLabel;
    JLabel contactLabel;
    JLabel aboutLabel;
    JPanel homePanel;
    JPanel bookPanel;
    JPanel contactPanel;
    JPanel aboutPanel;

    MyFrame(){

        ImageIcon image = new ImageIcon("room.jpg");

        homeLabel = new JLabel();
        homeLabel.setIcon(image);

        aboutLabel = new JLabel();
        aboutLabel.setText("Get the celebrity treatment with world-class service at Wyndham Tashkent\n" +
                "You're eligible for a Genius discount at Wyndham Tashkent! To save at this property, all you ");

        homePanel = new JPanel();
        homePanel.setBounds(20,100,900,600);
        homePanel.setVisible(true);

        bookPanel = new JPanel();
        bookPanel.setBounds(20,100,900,600);
        bookPanel.setVisible(false);

        contactPanel = new JPanel();
        contactPanel.setBounds(20,100,900,600);
        contactPanel.setVisible(false);

        aboutPanel = new JPanel();
        aboutPanel.setBounds(20,100,900,600);
        aboutPanel.setVisible(false);


        homeButton = new JButton("Home");
        bookButton = new JButton("Book now");
        contactButton = new JButton("Contact");
        aboutButton = new JButton("About");

        homeButton.setBounds(20,20,100,50);
        bookButton.setBounds(130,20,100,50);
        contactButton.setBounds(240,20,100,50);
        aboutButton.setBounds(350,20,100,50);

        homeButton.setEnabled(false);
        bookButton.setEnabled(true);
        contactButton.setEnabled(true);
        aboutButton.setEnabled(true);

        homeButton.addActionListener(this);
        homeButton.setFocusable(false);
        homeButton.setHorizontalTextPosition(JButton.CENTER);
        homeButton.setVerticalTextPosition(JButton.BOTTOM);
        homeButton.setBorder(BorderFactory.createEtchedBorder());

        bookButton.addActionListener(this);
        bookButton.setFocusable(false);
        bookButton.setHorizontalTextPosition(JButton.CENTER);
        bookButton.setVerticalTextPosition(JButton.BOTTOM);
        bookButton.setBorder(BorderFactory.createEtchedBorder());

        contactButton.addActionListener(this);
        contactButton.setFocusable(false);
        contactButton.setHorizontalTextPosition(JButton.CENTER);
        contactButton.setVerticalTextPosition(JButton.BOTTOM);
        contactButton.setBorder(BorderFactory.createEtchedBorder());

        aboutButton.addActionListener(this);
        aboutButton.setFocusable(false);
        aboutButton.setHorizontalTextPosition(JButton.CENTER);
        aboutButton.setVerticalTextPosition(JButton.BOTTOM);
        aboutButton.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,700);
        this.setVisible(true);
        this.add(homeButton);
        this.add(bookButton);
        this.add(contactButton);
        this.add(aboutButton);
        this.add(homePanel);
        this.add(bookPanel);
        this.add(contactPanel);
        this.add(aboutPanel);
//        this.pack();
        homePanel.add(homeLabel);
        bookPanel.add(bookLabel);
        contactPanel.add(contactLabel);
        aboutPanel.add(aboutLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==homeButton) {
            homeButton.setEnabled(false);
            bookButton.setEnabled(true);
            contactButton.setEnabled(true);
            aboutButton.setEnabled(true);
            homePanel.setVisible(true);
            bookPanel.setVisible(false);
            contactPanel.setVisible(false);
            aboutPanel.setVisible(false);
        }
        else if(e.getSource()==bookButton) {
            homeButton.setEnabled(true);
            bookButton.setEnabled(false);
            contactButton.setEnabled(true);
            aboutButton.setEnabled(true);
            homePanel.setVisible(false);
            bookPanel.setVisible(true);
            contactPanel.setVisible(false);
            aboutPanel.setVisible(false);
        }
        else if(e.getSource()==contactButton) {
            homeButton.setEnabled(true);
            bookButton.setEnabled(true);
            contactButton.setEnabled(false);
            aboutButton.setEnabled(true);
            homePanel.setVisible(false);
            bookPanel.setVisible(false);
            contactPanel.setVisible(true);
            aboutPanel.setVisible(false);
        }
        else if(e.getSource()==aboutButton) {
            homeButton.setEnabled(true);
            bookButton.setEnabled(true);
            contactButton.setEnabled(true);
            aboutButton.setEnabled(false);
            homePanel.setVisible(false);
            bookPanel.setVisible(false);
            contactPanel.setVisible(false);
            aboutPanel.setVisible(true);
        }
    }
}