import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private JPanel panel1;
    private JButton nuevoContacto;
    private JButton verContacto;
    private JButton buscarContacto;
    private JLabel title;

    //conexiones
    private  NuevoContacto vNuevoContacto;
    private  Contactos vListaContactos;
    private  Buscar vBuscar;
    private List<Contacto> contactos=new ArrayList<>();
    private Agenda agenda;

    public Agenda() {
        agenda=this;
        nuevoContacto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevoContacto n= new NuevoContacto();
                vNuevoContacto.setAgenda(agenda);
            }
        });
        verContacto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Contactos c = new Contactos();
            }
        });
        buscarContacto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Agenda");
        frame.setContentPane(new Agenda().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
