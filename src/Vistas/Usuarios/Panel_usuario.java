package Vistas.Usuarios;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Controladores.ControladorVentana;

public class Panel_usuario extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	JButton boton_volver_usuarios;
	JLabel etiqueta_nombre;
	JLabel etiqueta_contrasenya;
	JLabel etiqueta_contrasenya_repetida;
	JLabel etiqueta_rol;
	JTextField caja_nombre;
	JTextField caja_contrasenya;
	JTextField caja_contrasenya_repetida;
	JButton boton_aceptar_usuario;
	JRadioButton radio_boton_ventas;
	JRadioButton radio_boton_cocina;
	JRadioButton radio_boton_admin;

	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 150;
	int alto_boton = 40;
	
	int ancho_caja = 200;
	
	int ancho_etiqueta = 120;

	int alto_contenedor_texto = 40;

	int ancho_radio_boton = 90;
	int alto_radio_boton = 40;

	/*
	 * Constructores de la clase 
	 */
	
	//public Panel_usuario() {

	//	ancho_panel = 0;
	//	alto_panel = 0;

	//	inicializar_panel();
	//	inicializar_componentes();
		
	//}
	
	public Panel_usuario(int ancho,int alto) {

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

		int separacion_y = 15;
		int desplazamiento_y = 40; 
		
		int ancho;
		
		int pos_x_etiquetas;
		int pos_x_cajas;
		int pos_y_nombre;
		int pos_y_contrasenya;
		int pos_y_contrasenya_repetida;

		int pos_x_rb_ventas;
		int pos_x_rb_cocina;
		int pos_x_rb_admin;
		
		int pos_y_radio_boton;
		
		int pos_x_aceptar = this.getWidth()/2 - ancho_boton/2;
		int pos_y_aceptar;

		if ((ancho_etiqueta+ancho_caja)>(ancho_radio_boton*4)) {
			ancho = ancho_etiqueta+ancho_caja;
		} else {
			ancho = ancho_etiqueta+ancho_radio_boton*3;
		}
		
		pos_x_etiquetas = this.getWidth()/2 - ancho/2;
		pos_x_cajas = this.getWidth()/2 + ancho/2 - ancho_caja;
		pos_x_rb_ventas = pos_x_etiquetas + ancho_radio_boton;
		pos_x_rb_cocina = pos_x_rb_ventas + ancho_radio_boton;
		pos_x_rb_admin = pos_x_rb_cocina + ancho_radio_boton;

		pos_y_nombre = this.getHeight()/2 - (alto_contenedor_texto*4 + separacion_y*3)/2 - desplazamiento_y;
		pos_y_contrasenya = pos_y_nombre + alto_contenedor_texto + separacion_y;
		pos_y_contrasenya_repetida = pos_y_contrasenya + alto_contenedor_texto + separacion_y;
		pos_y_radio_boton = pos_y_contrasenya_repetida + alto_contenedor_texto + separacion_y;
		pos_y_aceptar = pos_y_radio_boton + alto_contenedor_texto + separacion_y;

		
		etiqueta_nombre = new JLabel("Nombre");
		etiqueta_nombre.setLocation(pos_x_etiquetas,pos_y_nombre);
		etiqueta_nombre.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_nombre);
		
		etiqueta_contrasenya = new JLabel("Contraseña");
		etiqueta_contrasenya.setLocation(pos_x_etiquetas,pos_y_contrasenya);
		etiqueta_contrasenya.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_contrasenya);
		
		etiqueta_contrasenya_repetida = new JLabel("repetir contraseña");
		etiqueta_contrasenya_repetida.setLocation(pos_x_etiquetas,pos_y_contrasenya_repetida);
		etiqueta_contrasenya_repetida.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_contrasenya_repetida);
		
		etiqueta_rol = new JLabel("Rol");
		etiqueta_rol.setLocation(pos_x_etiquetas,pos_y_radio_boton);
		etiqueta_rol.setSize(ancho_radio_boton,alto_contenedor_texto);
		this.add(etiqueta_rol);
		
		caja_nombre = new JTextField();
		caja_nombre.setLocation(pos_x_cajas,pos_y_nombre);
		caja_nombre.setSize(ancho_caja,alto_contenedor_texto);
		this.add(caja_nombre);
		
		caja_contrasenya = new JTextField();
		caja_contrasenya.setLocation(pos_x_cajas,pos_y_contrasenya);
		caja_contrasenya.setSize(ancho_caja,alto_contenedor_texto);
		this.add(caja_contrasenya);
		
		caja_contrasenya_repetida = new JTextField();
		caja_contrasenya_repetida.setLocation(pos_x_cajas,pos_y_contrasenya_repetida);
		caja_contrasenya_repetida.setSize(ancho_caja,alto_contenedor_texto);
		this.add(caja_contrasenya_repetida);
		
		radio_boton_ventas = new JRadioButton("ventas");
		radio_boton_ventas.setLocation(pos_x_rb_ventas,pos_y_radio_boton);
		radio_boton_ventas.setSize(ancho_radio_boton,alto_radio_boton);
		this.add(radio_boton_ventas);
		
		radio_boton_cocina = new JRadioButton("cocina");
		radio_boton_cocina.setLocation(pos_x_rb_cocina,pos_y_radio_boton);
		radio_boton_cocina.setSize(ancho_radio_boton,alto_radio_boton);
		this.add(radio_boton_cocina);
		
		radio_boton_admin = new JRadioButton("admin");
		radio_boton_admin.setLocation(pos_x_rb_admin,pos_y_radio_boton);
		radio_boton_admin.setSize(ancho_radio_boton,alto_radio_boton);
		this.add(radio_boton_admin);
		
		boton_aceptar_usuario = crear_boton("aceptar","aceptar",pos_x_aceptar, pos_y_aceptar);
		this.add(boton_aceptar_usuario);
		
		boton_volver_usuarios = boton_volver("volver",pos_x_volver);
		this.add(boton_volver_usuarios);

	}

	public void establecerManejador(ControladorVentana manejador) {

		boton_volver_usuarios.addActionListener(manejador);
		boton_aceptar_usuario.addActionListener(manejador);


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

	/*
	 * Getter para comunicarse con el exterior
	 */

	public JButton getBoton_volver_usuarios() {
		return boton_volver_usuarios;
	}

	public JTextField getCaja_nombre() {
		return caja_nombre;
	}

	public JTextField getCaja_contrasenya() {
		return caja_contrasenya;
	}

	public JTextField getCaja_contrasenya_repetida() {
		return caja_contrasenya_repetida;
	}

	public JButton getBoton_aceptar_usuario() {
		return boton_aceptar_usuario;
	}


}

