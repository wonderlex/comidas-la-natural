package Vistas.Ventas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import Controladores.ControladorVentana;

public class Panel_facturar extends JPanel {

	JButton boton_volver;
	JLabel etiqueta_cliente;
	JTable visualizador_servicio;
	JButton boton_pago_tarjeta;
	JButton boton_pagado;
	JLabel etiqueta_total;
	JLabel etiqueta_valor_total;
	JLabel etiqueta_total_iva;
	JLabel etiqueta_valor_total_iva;
	JLabel etiqueta_abonado;
	JTextField caja_abonado;
	JLabel etiqueta_devolver;
	JLabel etiqueta_valor_devolver;
	
	public void Panel_() {

	} 

	public void inicializar_componentes() {

	}

	public void establecerManejador(ControladorVentana manejador) {


	}

	private JButton crear_boton(String texto,String nombre,int x, int y) {
		JButton resultado;
		int ancho_boton = 150;
		int alto_boton = 40;
		resultado = new JButton(texto);
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho_boton,alto_boton);
		return resultado;
	}

	private JButton boton_volver(String nombre,int x) {
		JButton resultado;
		int y = 5;
		int ancho = 150;
		int alto = 40;
		resultado = new JButton("Volver");
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho,alto);
		return resultado;	
	} 


}
