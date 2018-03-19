import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Formulario {
    List<Alumno> alumnos= new ArrayList<>(); //ida

    public Formulario() {
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alumnos.add(new Alumno(nombre,apellidos,telefono,email));
                            }
        });
        verLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Alumno alumnosTemp:alumnos) {
                    verLista.setText(nombre,apellidos,telefono,email);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");
        frame.setContentPane(new Formulario().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel;
    private JTextField apellidos;
    private JTextField telefono;
    private JTextField email;
    private JButton verLista;
    private JButton guardar;
    private JTextField nombre;
}
