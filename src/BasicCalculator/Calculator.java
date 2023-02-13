package BasicCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton,eightButton,nineButton,divButton;
    JButton fourButton,fiveButton,sixButton,multiButton;
    JButton oneButton,twoButton,threeButton,minusButton;
    JButton dotButton,zeroButton,equalButton,plusButton;
    JButton clearButton;
    boolean isClicked = false;
    String oldValue;
    char flag;
    public Calculator(){
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(550,600);
        jf.setLocation(150,150);
        displayLabel = new JLabel();
        displayLabel.setFont(new Font("Arial",Font.PLAIN,50));
        displayLabel.setBounds(30,30,440,80);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
        sevenButton.setBounds(30,130,80,80);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setFont(new Font("Arial",Font.PLAIN,40));
        eightButton.setBounds(130,130,80,80);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setFont(new Font("Arial",Font.PLAIN,40));
        nineButton.setBounds(230,130,80,80);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setFont(new Font("Arial",Font.PLAIN,40));
        fourButton.setBounds(30,230,80,80);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
        fiveButton.setBounds(130,230,80,80);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setFont(new Font("Arial",Font.PLAIN,40));
        sixButton.setBounds(230,230,80,80);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setFont(new Font("Arial",Font.PLAIN,40));
        oneButton.setBounds(30,330,80,80);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setFont(new Font("Arial",Font.PLAIN,40));
        twoButton.setBounds(130,330,80,80);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setFont(new Font("Arial",Font.PLAIN,40));
        threeButton.setBounds(230,330,80,80);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton = new JButton(".");
        dotButton.setFont(new Font("Arial",Font.PLAIN,40));
        dotButton.setBounds(30,430,80,80);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
        zeroButton.setBounds(130,430,80,80);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setFont(new Font("Arial",Font.PLAIN,40));
        equalButton.setBounds(230,430,80,80);
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.setFont(new Font("Arial",Font.PLAIN,40));
        divButton.setBounds(330,130,80,80);
        divButton.addActionListener(this);
        jf.add(divButton);

        multiButton = new JButton("*");
        multiButton.setFont(new Font("Arial",Font.PLAIN,40));
        multiButton.setBounds(330,230,80,80);
        multiButton.addActionListener(this);
        jf.add(multiButton);

        minusButton = new JButton("-");
        minusButton.setFont(new Font("Arial",Font.PLAIN,40));
        minusButton.setBounds(330,330,80,80);
        minusButton.addActionListener(this);
        jf.add(minusButton);

        plusButton = new JButton("+");
        plusButton.setFont(new Font("Arial",Font.PLAIN,40));
        plusButton.setBounds(330,430,80,80);
        plusButton.addActionListener(this);
        jf.add(plusButton);

        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial",Font.PLAIN,27));
        clearButton.setBounds(430,430,100,80);
        clearButton.addActionListener(this);
        jf.add(clearButton);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
                new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e){
//        jf.getContentPane().setBackground(Color.blue);
        if(e.getSource()==sevenButton){             // no need to declare a String.We can directly call the method.
            if(isClicked){
                displayLabel.setText("7");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + "7");
            }
        }else if(e.getSource()==eightButton){
            if(isClicked){
                displayLabel.setText("8");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + "8");
            }
        }else if(e.getSource()==nineButton){
            if(isClicked){
                displayLabel.setText("9");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + "9");
            }
        }else if(e.getSource()==fourButton){
            if(isClicked){
                displayLabel.setText("4");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        }else if(e.getSource()==fiveButton){
            if(isClicked){
                displayLabel.setText("5");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        }else if(e.getSource()==sixButton){
            if(isClicked){
                displayLabel.setText("6");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        }else if(e.getSource()==oneButton){
            if(isClicked){
                displayLabel.setText("1");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        }else if(e.getSource()==twoButton){
            if(isClicked){
                displayLabel.setText("2");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
        }else if(e.getSource()==threeButton){
            if(isClicked){
                displayLabel.setText("3");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
        }else if(e.getSource()==dotButton){
            if(isClicked){
                displayLabel.setText(".");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + ".");
            }
        }else if(e.getSource()==zeroButton){
            if(isClicked){
                displayLabel.setText("0");
                isClicked = false;
            }else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        }else if(e.getSource()==equalButton){
            String newVal = displayLabel.getText();
            float oldValue_f = Float.parseFloat(oldValue);
            float newValue_f = Float.parseFloat(newVal);
            float result =0;
            if(flag=='a')
                result = oldValue_f+newValue_f;
            if(flag=='s')
                result = oldValue_f-newValue_f;
            if(flag=='d')
                result = oldValue_f/newValue_f;
            if(flag=='x')
                result = oldValue_f*newValue_f;

            displayLabel.setText(result+"");
            
        }else if(e.getSource()==divButton){
            isClicked = true;
            flag='d';
            oldValue = displayLabel.getText();
        }else if(e.getSource()==multiButton){
            flag = 'x';
            isClicked = true;
            oldValue = displayLabel.getText();
        }else if(e.getSource()==minusButton){
            isClicked = true;
            flag = 's';
            oldValue = displayLabel.getText();
        }else if(e.getSource()==plusButton){
            isClicked = true;
            flag = 'a';
            oldValue = displayLabel.getText();
        }else if(e.getSource()==clearButton){
            displayLabel.setText("");
        }

    }
}