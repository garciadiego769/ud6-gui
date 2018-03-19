package garcia.diego;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tablero {
    private JPanel tablero;
    private JButton boton02;
    private JButton boton01;
    private JButton boton21;
    private JButton boton12;
    private JButton boton10;
    private JButton boton00;
    private JButton boton20;
    private JButton boton22;
    private JButton boton11;


    private int turno = 0; /* a quien le toca*/
    private int tiradas = 0;
    public Tablero() {

        boton00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boton00.getText().equalsIgnoreCase("X") || boton00.getText().equalsIgnoreCase("Y")){
                    //Está ocupado
                }else{
                    boton00.setText("Y");
                }
                if(turno==0){
                    turno=1;
                }else{
                    turno=0;
                }
            }

        });
        boton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boton01.getText().equalsIgnoreCase("X")){
                    //Está ocupado
                }else{
                    boton01.setText("Y");
                }
                if(turno==0){
                    turno=1;
                }else{
                    turno=0;
                }
            }
        });
        boton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boton02.getText().equalsIgnoreCase("X")){
                    //Está ocupado
                }else{
                    boton02.setText("Y");
                }
                if(turno==0){
                    turno=1;
                }else{
                    turno=0;
                }
            }
        });
        boton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boton10.getText().equalsIgnoreCase("X")){
                    //Está ocupado
                }else{
                    boton10.setText("Y");
                }
                if(turno==0){
                    turno=1;
                }else{
                    turno=0;
                }
            }

        });
        boton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boton11.getText().equalsIgnoreCase("X")){
                    //Está ocupado
                }else{
                    boton11.setText("Y");
                }
                if(turno==0){
                    turno=1;
                }else{
                    turno=0;
                }
            }
        });
        boton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boton12.getText().equalsIgnoreCase("X")){
                    //Está ocupado
                }else{
                    //quien escribe?
                    if(turno==0){
                    boton12.setText("Y");}
                    else{
                        boton12.setText();
                    }
                }
                if(turno==0){
                    turno=1;
                }else{
                    turno=0;
                }
            }
        });
        boton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boton20.getText().equalsIgnoreCase("X")){
                    //Está ocupado
                }else{
                    boton20.setText("Y");
                }
                if(turno==0){
                    turno=1;
                }else{
                    turno=0;
                }
            }
        });
        boton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boton21.getText().equalsIgnoreCase("X")){
                    //Está ocupado
                }else{
                    boton21.setText("Y");
                }
                if(turno==0){
                    turno=1;
                }else{
                    turno=0;
                }
            }
        });
        boton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boton22.getText().equalsIgnoreCase("X")){
                    //Está ocupado
                }else{
                    boton22.setText("Y");
                }
                if(turno==0){
                    turno=1;
                }else{
                    turno=0;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tablero");
        frame.setContentPane(new Tablero().tablero);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



        // Comprobar si el hueco está libre
   /*   if (m1[fila][columna] == 8) { //Está libre

            m1[fila][columna] = turno; //Escribimos un 0 o 1 (el turno de cada jugador)

            if (comprobarganador(m1, turno)) {
                System.out.println("¡ENHORABUENA!");
            } else {
                if (turno == 1) {
                    turno = 0;
                } else {
                    turno = 1;
                }
            }
            tiradas += 1;
        } else {
            //Si no está libre...
            System.out.println("Casilla ocupada, prueba otra vez");
        }*/
    }
}
