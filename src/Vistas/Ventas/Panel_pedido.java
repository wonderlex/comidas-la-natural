package Vistas.Ventas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import Controladores.ControladorVentana;

public class Panel_pedido extends JPanel {

	JButton boton_volver;
	JLabel etiqueta_mesa;
	JButton boton_guardar;
	JTable visualizador_servicio;
	JButton boton_nueva;
	JButton boton_modificar_cantidad;
	JButton boton_eliminar;
	JButton boton_facturar;
	
	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 150;
	int alto_boton = 40;
	
	int ancho_caja = 200;
	
	int ancho_etiqueta = 120;

	int alto_contenedor_texto = 40;

	int ancho_visualizador;
	int alto_visualizador;

	int separacion_y = 8;
	int separacion_x = 5;

	/*
	 * Constructores de la clase 
	 */
	
	//public Panel_pedido() {

	//	ancho_panel = 0;
	//	alto_panel = 0;

	//	inicializar_panel();
	//	inicializar_componentes();
		
	//}
	
	public Panel_pedido(int ancho,int alto) {

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
		setName("panel_login");

	}

	/**
	 * inicializador de los componentes de la clase
	 */
	public void inicializar_componentes() {

		int pos_x_volver = this.getWidth() - ancho_boton*5/4;

		int pos_x_mesa;
		int pos_y_mesa;
		int pos_x_guardar; 
		int pos_y_guardar;
		int pos_x_visualizador;
		int pos_y_visualizador;
		int pos_x_nuevo; 
		int pos_y_botones;
		int pos_x_modificar; 
		int pos_x_eliminar; 
		int pos_x_facturar; 
		int pos_y_facturar;
		
		int ancho;
		int alto;
		int desplazamiento_y = 15;
		
		alto_visualizador = this.getHeight()*4/7;
		ancho_visualizador = this.getWidth()*4/5;

		ancho = ancho_visualizador; 
		alto =  alto_visualizador + alto_boton*2 + separacion_y*3;
		
		separacion_x = (ancho_visualizador - ancho_boton*4)/3; 
				
		pos_y_mesa = this.getHeight()/2 - alto/2 - desplazamiento_y;
		pos_y_guardar = pos_y_mesa; 
		pos_y_visualizador = pos_y_guardar + alto_boton + separacion_y;
		pos_y_botones = pos_y_visualizador + alto_visualizador + separacion_y;
		pos_y_facturar = pos_y_botones + alto_boton + separacion_y;
		
		pos_x_mesa = this.getWidth()/2 - ancho/2;
		pos_x_guardar = pos_x_volver - ancho_boton - separacion_x;
		pos_x_visualizador = pos_x_mesa;
		pos_x_nuevo = pos_x_mesa; 
		pos_x_modificar = pos_x_nuevo + ancho_boton + separacion_x;  
		pos_x_eliminar = pos_x_modificar + ancho_boton + separacion_x;
		pos_x_facturar = pos_x_eliminar + ancho_boton + separacion_x; 
		
		boton_volver = boton_volver("volver",pos_x_volver);
		this.add(boton_volver);

		etiqueta_mesa = new JLabel("ingredientes");
		etiqueta_mesa.setLocation(pos_x_mesa,pos_y_mesa);
		etiqueta_mesa.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_mesa);

		boton_guardar = crear_boton("guardar","guardar",pos_x_guardar, pos_y_guardar);
		this.add(boton_guardar);

		visualizador_servicio = new JTable();
		visualizador_servicio.setLocation(pos_x_visualizador,pos_y_visualizador);
		visualizador_servicio.setSize(ancho_visualizador,alto_visualizador);
		this.add(visualizador_servicio);

		boton_nueva = crear_boton("nuevo","nuevo",pos_x_nuevo, pos_y_botones);
		this.add(boton_nueva);

		boton_modificar_cantidad = crear_boton("modificar","modificar",pos_x_modificar, pos_y_botones);
		this.add(boton_modificar_cantidad);

		boton_eliminar = crear_boton("eliminar","eliminar",pos_x_eliminar, pos_y_botones);
		this.add(boton_eliminar);

		boton_facturar = crear_boton("facturar","facturar",pos_x_facturar, pos_y_facturar);
		this.add(boton_facturar);


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
