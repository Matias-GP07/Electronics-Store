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
    private int cantidadProductos = 0;

    public InfoProductos[] getProductoAgg() {
        return productoAgg;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }
    
    public void crearVectorProd(int cantidadProdAgr) {
        if (cantidadProdAgr <= 0) {
            JOptionPane.showMessageDialog(null, "Error, la cantidad debe ser mayor a cero");
            cantidadProdAgr = 0;
        } else {
            productoAgg = new InfoProductos[cantidadProdAgr];
            cantidadProductos = 0;
            posicion = 0;
        }
    }
    
    private int posicion = 0;

    public void AgregarProducto(InfoProductos producto) {
        if (posicion < productoAgg.length) {
            productoAgg[posicion] = producto;
            posicion++;
            cantidadProductos++;
        } else {
            JOptionPane.showMessageDialog(null, "El vector ya se encuentra lleno.");
        }
    }

    public InfoProductos buscarCodigoProd(String codigoProd) {
        for (int i = 0; i < cantidadProductos; i++) {
            if (productoAgg[i].getCodigoProd().equals(codigoProd)) {
                return productoAgg[i];
            }
        }

        return null;
    }

    public void metodoBurbuja() {
        for (int i = 0; i < cantidadProductos - 1; i++) { //Este for sirve para darle las vueltas al contenido del vector
            for (int j = 0; j < cantidadProductos - 1; j++) { //Este for sirve para ordenar el vector e ir cambiando las posicines mediante un condicional.
                if (productoAgg[j].ganancia() < productoAgg[j + 1].ganancia()) {
                    InfoProductos aux;
                    aux = productoAgg[j];
                    productoAgg[j] = productoAgg[j + 1];
                    productoAgg[j + 1] = aux;
                }
            }
        }
    }

    public void metodoInsercion() {
        for (int i = 1; i < cantidadProductos; i++) {
            InfoProductos aux = productoAgg[i];
            int j = i - 1;

            while (j >= 0 && productoAgg[j].getNombreProd().compareTo(aux.getNombreProd()) > 0) {
                productoAgg[j + 1] = productoAgg[j];

                j--;
            }

            productoAgg[j + 1] = aux;
        }
    }

    public void metodoSeleccion() {

        for (int i = 0; i < cantidadProductos - 1; i++) {
            
            int mayor = i;
            for (int j = i + 1; j < cantidadProductos; j++) {

                if (productoAgg[j].getCantidadProd() > productoAgg[mayor].getCantidadProd()) {
                    mayor = j;
                }
            }

            InfoProductos aux = productoAgg[i];
            productoAgg[i] = productoAgg[mayor];
            productoAgg[mayor] = aux;
        }
    }

}
