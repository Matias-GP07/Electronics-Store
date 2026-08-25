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
            if (productoAgg[i] != null &&productoAgg[i].getCodigoProd().equals(codigoProd)) {
                return productoAgg[i];
            }
        }

        return null;
    }

    public void metodoBurbuja() {
        for (int i = 0; i < productoAgg.length - 1; i++) { //Este for sirve para darle las vueltas al contenido del vector
            for (int j = 0; j < productoAgg.length - 1; j++) { //Este for sirve para ordenar el vector e ir cambiando las posicines mediante un condicional.
                if (productoAgg[j].ganancia() < productoAgg[j + 1].ganancia()) {
                    InfoProductos aux;
                    aux = productoAgg[j];
                    productoAgg[j] = productoAgg[j + 1];
                    productoAgg[j + 1] = aux;
                }
            }
        }
    }
    
    public String mostrarOrdenamientoBurbuja(){
        String info="GANANCIAS ORGANIZADAS DE MAYOR A MENOR\n\n";
        
        for(int i = 0; i < productoAgg.length; i++){
            
            info += "-----------------------------------------------------" + "\n";
            
            info += "Nombre producto: " + productoAgg[i].getNombreProd() + "\n";
            info += "Código proucto: " + productoAgg[i].getCodigoProd() + "\n";
            info += "Marca producto: " + productoAgg[i].getMarcaProd() + "\n";
            info += "Ganancia producto: " + productoAgg[i].ganancia() + "\n";
            
        }
        return info;
    }
}
