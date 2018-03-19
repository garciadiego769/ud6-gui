import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class NuevoContacto {

    private JButton guardar;
    private JButton cancelar;
    private JTextField nombre;
    private JTextField telefono;
    private JTextField mail;
    private JPanel panel;
    private Agenda agenda;

    public JButton getGuardar() {
        return guardar;
    }

    public void setGuardar(JButton guardar) {
        this.guardar = guardar;
    }

    public JButton getCancelar() {
        return cancelar;
    }

    public void setCancelar(JButton cancelar) {
        this.cancelar = cancelar;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JTextField getTelefono() {
        return telefono;
    }

    public void setTelefono(JTextField telefono) {
        this.telefono = telefono;
    }

    public JTextField getMail() {
        return mail;
    }

    public void setMail(JTextField mail) {
        this.mail = mail;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public NuevoContacto() {

        JFrame frame = new JFrame("NuevoContacto");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String vnombre=nombre.getText();
              String vmail=mail.getText();
              String vnumero=telefono.getText();

              Contacto c = new Contacto(vnombre,vnumero,vmail);

              agenda.ge
            }
        });

    }
}
