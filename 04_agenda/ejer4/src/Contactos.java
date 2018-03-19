import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contactos {
    Agenda agenda= new Agenda();

    private JTextField nombre;
    private JTextField telefono;
    private JTextField email;
    private JPanel panel;


    public Contactos() {

        JFrame frame = new JFrame("Contactos");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



        nombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        telefono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
