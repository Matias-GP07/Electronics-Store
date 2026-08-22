/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author garci
 */
public class InfoProductos {
    
    private String nombreProd;
    private String codigoProd;
    private String marcaProd;
    private double precioProd;
    private double costoProd;
    private int cantidadProd;

    public InfoProductos(String nombreProd, String codigoProd, String marcaProd, double precioProd, double costoProd, int cantidadProd) {
        this.nombreProd = nombreProd;
        this.codigoProd = codigoProd;
        this.marcaProd = marcaProd;
        this.precioProd = precioProd;
        this.costoProd = costoProd;
        this.cantidadProd = cantidadProd;
    }
    
    public InfoProductos(){
        
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(String codigoProd) {
        this.codigoProd = codigoProd;
    }

    public String getMarcaProd() {
        return marcaProd;
    }

    public void setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }

    public double getCostoProd() {
        return costoProd;
    }

    public void setCostoProd(double costoProd) {
        this.costoProd = costoProd;
    }

    public int getCantidadProd() {
        return cantidadProd;
    }

    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }
    
}
