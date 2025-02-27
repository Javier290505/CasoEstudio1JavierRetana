/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estudio_de_caso_1_javierretanagarcia;

import javax.swing.JOptionPane;

/**
 *
 * @author jareg
 */
public class Estudio_de_Caso_1_JavierRetanaGarcia {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        class clientes {
//Se utilizan privates para cada consigna y de este modo organizarlo
            private String nombre;
            private String cedula;
            private String codigo;
            private String monto;
            private String Mes;
            private String electricos;
            private String automotrices;
            private String construccion;

            //Se utiliza un constructor para continuar con la programacion de los procesos
            public clientes(String nombre, String cedula, String codigo, String monto, String Mes, String electricos, String automotrices, String construccion) {
                this.nombre = nombre;
                this.cedula = cedula;
                this.codigo = codigo;
                this.monto = monto;
                this.Mes = Mes;
                this.electricos = electricos;
                this.automotrices = automotrices;
                this.construccion = construccion;
            }

            //Metdodo ultilizado para especificar las respuestas que queremos que el sistema nos de
            public String getNombre() {
                return nombre;
            }

            public String getCedula() {
                return cedula;
            }

            public String getCodigo() {
                return codigo;
            }

            public String getMonto() {
                return monto;
            }

            public String getMes() {
                return Mes;
            }

            public String getElectricos() {
                return electricos;
            }

            public String getAutomotrices() {
                return automotrices;
            }

            public String getConstruccion() {
                return construccion;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public void setCedula(String cedula) {
                this.cedula = cedula;
            }

            public void setCodigo(String codigo) {
                this.codigo = codigo;
            }

            public void setMonto(String monto) {
                this.monto = monto;
            }

            public void setMes(String Mes) {
                this.Mes = Mes;
            }

            public void setElectricos(String electricos) {
                this.electricos = electricos;
            }

            public void setAutomotrices(String automotrices) {
                this.automotrices = automotrices;
            }

            public void setConstruccion(String construccion) {
                this.construccion = construccion;
            }
       
            String Factura="";
            
        if Factura==20000{
            System.out.println("La factura pertenece a Julio S");
        }else {
            if Factura==35000{
                Sstem.out.println("La Factura pertenece a Ramon");
                }else {
            if Factura==60000{
                Sstem.out.println("La Factura pertenece a Julio V");
                }else {
            if Factura==25000{
                Sstem.out.println("La Factura pertenece a Natalia");
                }else {
            if Factura==45000{
                Sstem.out.println("La Factura pertenece a Jimena");
            }
            }
            }
            }
        }
        }

