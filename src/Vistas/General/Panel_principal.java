package Vistas.General;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controladores.ControladorVentana;

public class Panel_principal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton boton_principal_ventas;
	JButton boton_principal_recetario;
	JButton boton_principal_almacen;
	JButton boton_principal_contabilidad;
	JButton boton_principal_usuario;
	JButton boton_principal_salir;

	int ancho_panel;
	int alto_panel;

	int ancho_boton = 150;
	int alto_boton = 40;
	int separacion_x = 5;
	
	//public Panel_principal() {
		
	//	ancho_panel = 0;
	//	alto_panel = 0;

	//	inicializar_panel();
	//	inicializar_componentes();
		
	//}
	
	public Panel_principal(int ancho,int alto) {

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
		setName("panel_principal");

	}

	/**
	 * inicializador de los componentes de la clase
	 */
	public void inicializar_componentes() {

		int pox_x_1 = this.getWidth()/2 - ancho_boton*5/2 - separacion_x*2;
		int pox_x_2 = pox_x_1 + ancho_boton + separacion_x;
		int pox_x_3 = pox_x_2 + ancho_boton + separacion_x;
		int pox_x_4 = pox_x_3 + ancho_boton + separacion_x;
		int pox_x_5 = pox_x_4 + ancho_boton + separacion_x;
		int pos_y = this.getHeight()/2 - alto_boton/2;

		int pos_x_salir = this.getWidth() - ancho_boton*5/4;
		int pos_y_salir = 15;
		
		boton_principal_ventas = crear_boton("ventas","ventas",pox_x_1,pos_y);
		this.add(boton_principal_ventas);

		boton_principal_recetario = crear_boton("recetario","recetario",pox_x_2,pos_y);
		this.add(boton_principal_recetario);

		boton_principal_almacen = crear_boton("almacen","almacen",pox_x_3,pos_y);
		this.add(boton_principal_almacen);

		boton_principal_contabilidad = crear_boton("contabilidad","contabilidad",pox_x_4,pos_y);
		this.add(boton_principal_contabilidad);

		boton_principal_usuario = crear_boton("gestión usuarios","usuarios",pox_x_5,pos_y);
		this.add(boton_principal_usuario);

		boton_principal_salir = crear_boton("salir","salir",pos_x_salir,pos_y_salir);
		this.add(boton_principal_salir);
		
	}
	
	public void establecerManejador(ControladorVentana manejador) {
		
		boton_principal_ventas.addActionListener(manejador);
		boton_principal_recetario.addActionListener(manejador);
		boton_principal_almacen.addActionListener(manejador);
		boton_principal_contabilidad.addActionListener(manejador);
		boton_principal_usuario.addActionListener(manejador);
		boton_principal_salir.addActionListener(manejador);
		
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
	
	/*
	 * Getter para comunicarse con el exterior
	 */
	public JButton getBoton_principal_ventas() {
		return boton_principal_ventas;
	}

	public JButton getBoton_principal_recetario() {
		return boton_principal_recetario;
	}

	public JButton getBoton_principal_almacen() {
		return boton_principal_almacen;
	}

	public JButton getBoton_principal_contabilidad() {
		return boton_principal_contabilidad;
	}

	public JButton getBoton_principal_usuario() {
		return boton_principal_usuario;
	}

	public JButton getBoton_principal_salir() {
		return boton_principal_salir;
	}


}
