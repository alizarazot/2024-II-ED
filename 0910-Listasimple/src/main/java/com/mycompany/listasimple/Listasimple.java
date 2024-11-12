/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listasimple;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-01
 */
public class Listasimple {

    Nodo inicio;

    Listasimple() {
        inicio = null;
    }

    public void insertarInicio(String nombre, int edad, float promedio) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
            inicio = nuevo;
        } else {
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        }
    }

    public void insertarFinal(String nombre, int edad, float promedio) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
            inicio = nuevo;
        } else {
            Nodo temporal = inicio;
            while (temporal.getEnlace() != null) {
                temporal = temporal.getEnlace();

            }
            temporal.setEnlace(nuevo);

        }
    }

    public void consultar() {
        Nodo temporal = inicio;
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        } else {
            do {
                JOptionPane.showMessageDialog(null,
                        "Nombre:  " + temporal.getNombre() + " LA EDAD ES :"
                        + temporal.getEdad() + " EL PORMEDIO ES " + temporal.getPromedio());

                temporal = temporal.getEnlace();

            } while (temporal != null);

        }

    }

    public Nodo deleteIndex(int index) {
        if (index == 0) {
            Nodo aux = inicio;
            inicio = inicio.getEnlace();
            return aux;
        }

        Nodo prevNode = inicio;
        Nodo currentNode = inicio.getEnlace();
        int currentIndex = 1;

        while (currentNode != null) {
            if (currentIndex == index) {
                prevNode.setEnlace(currentNode.getEnlace());
                return currentNode;
            }

            prevNode = currentNode;
            currentNode = currentNode.getEnlace();
            currentIndex++;
        }

        return null;
    }
}
