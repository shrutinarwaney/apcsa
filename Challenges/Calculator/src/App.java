import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.*;
import java.awt.event.*;
import java.awt.EventQueue;
import java.util.*;
import java.awt.Dimension;
import java.lang.Math;

import static javax.swing.GroupLayout.Alignment.LEADING;
import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;

public class App extends JFrame implements ActionListener {
    
    public App() {
        setSize( 350, 240 );
        initUI();
    }
    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater( () -> {
            var ex = new App();
            ex.setVisible( true );
        } );
    }

    private void initUI() {

        var pane = getContentPane();
        var g1 = new GroupLayout( pane );
        pane.setLayout( g1 );

        g1.setAutoCreateGaps(true);
        g1.setAutoCreateContainerGaps(true);

        var resultField = new JTextField( 20 );
        resultField.setEditable(false);

        var clear = new JButton( "AC" );

        clear.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                resultField.setText("");
            }
        } );
        

        var one = new JButton( "1" );
        var two = new JButton( "2" );
        var three = new JButton( "3" );

        var divide = new JButton( "/" );

        var four = new JButton( "4" );
        var five = new JButton( "5" );
        var six = new JButton( "6" );

        var multiply = new JButton( "*" );

        var seven = new JButton( "7" );
        var eight = new JButton( "8" );
        var nine = new JButton( "9" );

        var minus = new JButton( "-" );

        var zero = new JButton( "0" );
        var sqrt = new JButton( "sqrt" );

        sqrt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                resultField.setText(resultField.getText() + "s");
            }
        });

        var equals = new JButton( "=" );

        equals.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                resultField.setText( calculate( resultField.getText() ) );
            }
        } 

        );

        var plus = new JButton( "+" );

        JButton[] buttons = { one, two, three, four, five, six, seven, eight, nine, zero, divide, multiply, plus, minus };

        for (JButton x : buttons){
            x.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    resultField.setText(resultField.getText() + x.getText());
                }
            });
        }

        g1.setHorizontalGroup( g1.createSequentialGroup()
            .addComponent(resultField)
            .addGroup( g1.createParallelGroup()
                .addComponent(one)
                .addComponent(four)
                .addComponent(seven)
                .addComponent(zero))
            .addGroup( g1.createParallelGroup()
                .addComponent(two)
                .addComponent(five)
                .addComponent(eight)
                .addComponent(sqrt))
            .addGroup( g1.createParallelGroup()
                .addComponent(three)
                .addComponent(six)
                .addComponent(nine)
                .addComponent(equals))
            .addGroup( g1.createParallelGroup()
                .addComponent( clear )
                .addComponent(divide)
                .addComponent(multiply)
                .addComponent(minus)
                .addComponent(plus))
            .addGroup(g1.createParallelGroup(GroupLayout.Alignment.LEADING))
        );

        g1.setVerticalGroup( g1.createSequentialGroup()
            .addComponent(resultField)
            .addGroup(g1.createParallelGroup( Alignment.BASELINE)
                .addComponent( clear ))
            .addGroup( g1.createParallelGroup( Alignment.LEADING )
                .addComponent(one)
                .addComponent(two)
                .addComponent(three)
                .addComponent(divide))
            .addGroup( g1.createParallelGroup( Alignment.LEADING )
                .addComponent(four)
                .addComponent(five)
                .addComponent(six)
                .addComponent(multiply))
            .addGroup( g1.createParallelGroup( Alignment.LEADING )
                .addComponent(seven)
                .addComponent(eight)
                .addComponent(nine)
                .addComponent(minus))
            .addGroup( g1.createParallelGroup( Alignment.LEADING )
                .addComponent(zero)
                .addComponent(sqrt)
                .addComponent(equals)
                .addComponent(plus))
        );

        pack();
    }

    static String calculate(String equation){
        
        char[] eq = equation.toCharArray();
        String a = "";
        String b = "";
        String op = "";
        double result = 0;

        for (char c : eq){
            if(c >= '0' && c <= '9' || c =='.'){
                if ( op.isEmpty() ) a += c;
                else b += c;
            }

            if (c == '+' || c == '-' || c == '*' || c == '/' || c == 's'){
                op += c;
            }
        }

        if (op.equals("+")) result = ( Double.parseDouble(a) + Double.parseDouble(b) );
        else if ( op.equals("-")) result = ( Double.parseDouble(a) - Double.parseDouble(b) );
        else if (op.equals("*")) result = (Double.parseDouble(a) * Double.parseDouble(b));
        else if (op.equals("/")) result = (Double.parseDouble(a) / Double.parseDouble(b));
        else if (op.equals("s")) result = (Math.sqrt(Double.parseDouble(a)));

        return String.valueOf(result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }


}
