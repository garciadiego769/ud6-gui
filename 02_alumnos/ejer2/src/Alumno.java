import javax.swing.*;

public class Alumno {
    private JTextField nombre;
    private JTextField apellidos;
    private JTextField telefono;
    private JTextField email;

    private Formulario f= new Formulario(); //vuelta


    public Alumno(JTextField nombre, JTextField apellidos, JTextField telefono, JTextField email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre=" + nombre +
                ", apellidos=" + apellidos +
                ", telefono=" + telefono +
                ", email=" + email +
                ", f=" + f +
                '}';
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JTextField getApellidos() {
        return apellidos;
    }

    public void setApellidos(JTextField apellidos) {
        this.apellidos = apellidos;
    }

    public JTextField getTelefono() {
        return telefono;
    }

    public void setTelefono(JTextField telefono) {
        this.telefono = telefono;
    }

    public JTextField getEmail() {
        return email;
    }

    public void setEmail(JTextField email) {
        this.email = email;
    }

    public Formulario getF() {
        return f;
    }

    public void setF(Formulario f) {
        this.f = f;
    }
}
