package Vistas.Contabilidad;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import Controladores.ControladorVentana;

public class Panel_contabilidad extends JPanel {

	JButton boton_volver;
	JButton boton_gastos;
	JButton boton_facturacion;
	
	JTable visualizador_ingedientes;

	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 150;
	int alto_boton = 40;


	/*
	 * Constructores de la clase 
	 */
	
	public Panel_contabilidad() {

		ancho_panel = 0;
		alto_panel = 0;

		inicializar_panel();
		inicializar_componentes();
		
	}
	
	public Panel_contabilidad(int ancho,int alto) {

		ancho_panel = ancho;
		alto_panel = alto;

		inicializar_panel();
		inicializar_componentes();
		
	}

	/**
	 * Inicializador de la clase
	 */
	public void inicializar_panel() {

		this.setLocation(0,0);
		this.setSize(ancho_panel,alto_panel);
		setLayout(null);
		setName("panel_contabilidad");

	}

	/**
	 * inicializador de los componentes de la clase
	 */
	public void inicializar_componentes() {

		int pos_x_volver = this.getWidth() - ancho_boton*5/4;
		
		int pos_x;
		int pos_y_gastos;
		int pos_y_facturacion;
		
		int separacion_y = 50;

		int alto;
		
		pos_x = this.getWidth()/2 - ancho_boton/2;
		
		alto = alto_boton*2 + separacion_y;

		pos_y_gastos = this.getHeight()/2 - alto/2;
		pos_y_facturacion = pos_y_gastos + alto_boton + separacion_y;

		
		boton_volver = boton_volver("volver",pos_x_volver);
		this.add(boton_volver);

		
		boton_gastos = crear_boton("gastos","gastos",pos_x, pos_y_gastos);
		this.add(boton_gastos);

		boton_facturacion = crear_boton("facturación","facturación",pos_x,pos_y_facturacion);
		this.add(boton_facturacion);

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
