/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import javax.swing.JOptionPane;

/**
 *
 * @author garci
 */
public class VectorProductos {

    private static InfoProductos[] productoAgg;

    public void crearVectorProd(int cantidadProdAgr) {
        if (cantidadProdAgr <= 0) {
            cantidadProdAgr = 0;
        } else {
            productoAgg = new InfoProductos[cantidadProdAgr];
        }
    }

    private int posicion = 0;

    public void AgregarProducto(InfoProductos producto) {
        if (posicion < productoAgg.length) {
            productoAgg[posicion] = producto;
            posicion++;
        } else {
            JOptionPane.showMessageDialog(null, "El vector ya se encuentra lleno.");
        }
    }

    public InfoProductos buscarCodigoProd(String codigoProd) {
        for (int i = 0; i < productoAgg.length; i++) {
            if (productoAgg[i].getCodigoProd().equals(codigoProd)) {
                return productoAgg[i];
            }
        }

        return null;
    }
}
