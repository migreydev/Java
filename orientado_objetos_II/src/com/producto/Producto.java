package com.producto;

public class Producto {
	
	//Atributos
	private int codigo;
	private String descripcion;
	private double precio;
	public final double IVA = 0.20;
	
	
	//Constructor
	
	public Producto(int codigo, String descripcion, double precio) {
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.precio=precio;
	}
	
	//METODOS
	
	public double calcularPrecio (double precio, double IVA) {
		double suma;
		
		return suma=precio + IVA;
	}
	//toString
	@Override
	public String toString() {
		return "Producto con codigo " + codigo + ", es un " + descripcion + ", y su precio sin IVA es " + precio + ", y con el IVA es " + calcularPrecio(precio,IVA);
	}
	

	
	
}
