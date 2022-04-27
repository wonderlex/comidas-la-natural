package Vistas.Ventas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

import Controladores.ControladorVentana;

public class Panel_cliente extends JPanel {
	
	JLabel etiqueta_nuevo_cliente;
	JLabel etiqueta_telefono;
	JTextField caja_nuevo_cliente;
	JTextField caja_telefono;
	JButton boton_aceptar_nuevo_cliente;
	JButton boton_nuevo_cliente_volver;

	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 150;
	int alto_boton = 40;
	
	int ancho_caja = 200;
	
	int ancho_etiqueta = 120;

	int alto_contenedor_texto = 40;

	int ancho_visualizador;
	int alto_visualizador;

	int separacion_y = 5;
	int separacion_x = 5;

	/*
	 * Constructores de la clase 
	 */
	
	//public Panel_receta() {

	//	ancho_panel = 0;
	//	alto_panel = 0;

	//	inicializar_panel();
	//	inicializar_componentes();
		
	//}
	
	public Panel_cliente(int ancho,int alto) {

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
	private void inicializar_componentes() {

		int pos_salir_x = this.getWidth();
		
		int pos_x_etq_nombre;
		int pos_x_caja_nombre;
		int pos_y_nombre;

		int pos_x_etq_telefono;
		int pos_x_caja_telefono;
		int pos_y_telefono;
		
		int pos_x_aceptar;
		int pos_y_aceptar;

		int alto;
		int ancho;
		
		alto = alto_boton + alto_contenedor_texto*2 + separacion_y*2;
		ancho = ancho_caja + ancho_etiqueta + separacion_x;

		pos_y_nombre = this.getHeight()/2 - alto/2;
		pos_y_telefono = pos_y_nombre + alto_contenedor_texto + separacion_y;
		pos_y_aceptar = pos_y_telefono + alto_contenedor_texto + separacion_y;
		pos_y_aceptar = pos_y_aceptar + alto_contenedor_texto + separacion_y;

		pos_x_etq_nombre =this.getWidth()/2 - ancho/2;
		pos_x_caja_nombre = pos_x_etq_nombre + ancho_etiqueta + separacion_y;
		pos_x_etq_telefono = pos_x_etq_nombre;
		pos_x_caja_telefono = pos_x_caja_nombre;
		pos_x_aceptar = this.getWidth()/2 - ancho_boton/2;

		etiqueta_nuevo_cliente= new JLabel("usuario");
		etiqueta_nuevo_cliente.setLocation(pos_x_etq_nombre,pos_y_nombre);
		etiqueta_nuevo_cliente.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_nuevo_cliente);

		etiqueta_telefono = new JLabel("telefono");
		etiqueta_telefono.setLocation(pos_x_etq_telefono,pos_y_telefono);
		etiqueta_telefono.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_telefono);

		caja_nuevo_cliente = new JTextField();
		caja_nuevo_cliente.setLocation(pos_x_caja_nombre,pos_y_nombre);
		caja_nuevo_cliente.setSize(ancho_caja,alto_contenedor_texto);
		this.add(caja_nuevo_cliente);

		caja_telefono = new JPasswordField();
		caja_telefono.setLocation(pos_x_caja_telefono,pos_y_telefono);
		caja_telefono.setSize(ancho_caja,alto_contenedor_texto);
		this.add(caja_telefono);

		boton_aceptar_nuevo_cliente = crear_boton("Aceptar","aceptar_nuevo_cliente",pos_x_aceptar,pos_y_aceptar);
		this.add(boton_aceptar_nuevo_cliente);

		
		boton_nuevo_cliente_volver = boton_volver("volver",pos_salir_x);//,pos_salir_y,ancho_boton,alto_boton);
		this.add(boton_nuevo_cliente_volver);
		
	}

	
	public void establecerManejador(ControladorVentana manejador) {
		

	}
	
	private JButton crear_boton(String texto,String nombre,int x, int y) {
		JButton resultado;
		resultado = new JButton(texto);
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho_boton,alto_boton);
		return resultado;
	}
	
	private JButton boton_volver(String nombre,int x) {
		JButton resultado;
		int y = 5;
		resultado = new JButton("Volver");
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho_boton,alto_boton);
		return resultado;	
	} 
	

}
