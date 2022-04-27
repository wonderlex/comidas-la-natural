package Vistas.Recetario;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import Controladores.ControladorVentana;

public class Panel_recetario extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton boton_volver_productos_almacen;

	JTextField caja_busqueda;
	JButton boton_todos_productos;
	JButton boton_buscar_productos;
	JButton boton_ver;
	JButton boton_nuevo;
	JButton boton_modificar;
	JButton boton_cambiar_estado;
	JTable visualizador_productos_almacen;

	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 180;
	int alto_boton = 40;
	
	int ancho_caja = 400;
	int alto_caja = 40;
	
	int ancho_visualizador;
	int alto_visualizador;


	/*
	 * Constructores de la clase 
	 */
	
	//public Panel_recetario() {

	//	ancho_panel = 0;
	//	alto_panel = 0;

	//	inicializar_panel();
	//	inicializar_componentes();
		
	//}
	
	public Panel_recetario(int ancho,int alto) {

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
		setName("panel_productos_almacen");

	}

	/**
	 * inicializador de los componentes de la clase
	 */
	public void inicializar_componentes() {
		int pos_x_volver = this.getWidth() - ancho_boton*5/4;
		
		int pos_x;
		int pos_x_buscar;
		int pos_y_inicial;
		int pos_y_busqueda;
		int pos_y_visualizador;

		int pos_y_botones;
		int pos_x_nuevo;
		int pos_x_modificar;
		int pos_x_cambiar_estado;


		int alto;
		int separacion_y = 5;
		int separacion_x = 5;
		
		ancho_visualizador = this.getWidth()*4/5;
		alto_visualizador = this.getHeight()*2/5;
		
		pos_x = this.getWidth()/10;
		pos_x_buscar = pos_x + ancho_caja + separacion_x;
		
		alto = alto_visualizador + alto_boton*2 + alto_caja + separacion_y*3;
		
		pos_y_inicial = this.getHeight()/2 - alto/2;
		pos_y_busqueda = pos_y_inicial + alto_boton + separacion_y;
		pos_y_visualizador = pos_y_busqueda + alto_boton + separacion_y;

		pos_x_nuevo = pos_x + ancho_boton;
		pos_x_modificar = pos_x_nuevo + ancho_boton;
		pos_x_cambiar_estado = pos_x_modificar + ancho_boton;
		
		pos_y_botones = pos_y_visualizador + alto_visualizador + separacion_y;
		
		boton_todos_productos = crear_boton("Todos los productos","todos_los_productos",pos_x, pos_y_inicial);
		this.add(boton_todos_productos);

		caja_busqueda = new JTextField();
		caja_busqueda.setLocation(pos_x,pos_y_busqueda);
		caja_busqueda.setSize(ancho_caja,alto_caja);
		this.add(caja_busqueda);

		boton_buscar_productos = crear_boton("buscar","buscar",pos_x_buscar, pos_y_busqueda);
		this.add(boton_buscar_productos);

		visualizador_productos_almacen = new JTable();
		visualizador_productos_almacen.setLocation(pos_x,pos_y_visualizador);
		visualizador_productos_almacen.setSize(ancho_visualizador,alto_visualizador);
		this.add(visualizador_productos_almacen);

		boton_ver = crear_boton("ver","ver",pos_x, pos_y_botones);
		this.add(boton_ver);

		boton_nuevo = crear_boton("nuevo","nuevo",pos_x_nuevo, pos_y_botones);
		this.add(boton_nuevo);
		boton_modificar = crear_boton("modificar","modificar",pos_x_modificar, pos_y_botones);
		this.add(boton_modificar);
		boton_cambiar_estado = crear_boton("cambiar estado","cambiar estado",pos_x_cambiar_estado, pos_y_botones);
		this.add(boton_cambiar_estado);

		boton_volver_productos_almacen = boton_volver("volver",pos_x_volver);
		this.add(boton_volver_productos_almacen);

	}

	public void establecerManejador(ControladorVentana manejador) {

		boton_todos_productos.addActionListener(manejador);
		boton_buscar_productos.addActionListener(manejador);
		boton_ver.addActionListener(manejador);
		boton_nuevo.addActionListener(manejador);
		boton_modificar.addActionListener(manejador);
		boton_cambiar_estado.addActionListener(manejador);

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

