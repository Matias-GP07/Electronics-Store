/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author garci
 */
public class Controlador_Verificador {

    private double ganancia;
    private double impuestoGanancia;
    private double valorTotalVenta;

    public void gananciasProd(InfoProductos producto) {
        ganancia = producto.getPrecioProd() - producto.getCostoProd();

        if (ganancia > 50000) {
            impuestoGanancia = ganancia * 0.1;
        } else {
            impuestoGanancia = 0;
        }

        valorTotalVenta = ganancia - impuestoGanancia;

    }

    public String infoGananciasProd(InfoProductos producto) {
        String info = "INFORMACIÓN GANANCIAS PRODUCTO" + "\n";
        info += "PRECIO VENTA:" + producto.getPrecioProd() + "\n";
        info += "PRECIO COSTO:" + producto.getCostoProd() + "\n";
        info += "GANANCIAS:" + ganancia + "\n";
        info += "IMPUESTOS:" + impuestoGanancia + "\n";
        info += "VALOR TOTAL DE VENTAS:" + valorTotalVenta + "\n";

        return info;
    }
}
