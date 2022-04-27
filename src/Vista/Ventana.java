package Vista;

import java.awt.Component;

import javax.swing.JFrame;

import Controladores.ControladorVentana;
import Vistas.Contabilidad.*;
import Vistas.General.*;
import Vistas.Recetario.*;
import Vistas.Usuarios.*;
import Vistas.Ventas.*;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	//Panel_login panel_login;
	//Panel_principal panel_principal;
	
	//Panel_gestion_usuarios panel_gestion_usuarios;
	//Panel_usuario panel_usuario;
	
	//Panel_productos_almacen panel_productos_almacen;
	//Panel_recetario panel_recetario;
	//Panel_receta panel_receta;

	//Panel_cliente panel_cliente;
	//Panel_pedido panel_pedido;
	
	
	//Panel_contabilidad panel_contabilidad;
	//Panel_lista_gastos panel_lista_gastos;
	//Panel_lista_facturacion panel_lista_facturacion
	//Panel_detalle_gastos panel_detalle_gastos;
	//Panel_detalle_factura panel_detalle_factura;
	Panel_lista_compra panel_lista_compra;	
	
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,600);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle("Comidas la natural");
		inicializarComponentes();
		setVisible(true);
	}
		
	private void inicializarComponentes() {

		//panel_login = new Panel_login(this.getWidth(), this.getHeight());
		//panel_login.setVisible(false);
		//this.add(panel_login);

		//panel_principal = new Panel_principal(this.getWidth(), this.getHeight());
		//panel_principal.setVisible(false);
		//this.add(panel_principal);

		//panel_gestion_usuarios = new Panel_gestion_usuarios(this.getWidth(), this.getHeight());
		//panel_gestion_usuarios.setVisible(false);
		//this.add(panel_gestion_usuarios);

		//panel_usuario = new Panel_usuario(this.getWidth(), this.getHeight());
		//panel_usuario.setVisible(false);
		//this.add(panel_usuario);

		//panel_productos_almacen = new Panel_productos_almacen(this.getWidth(), this.getHeight());
		//panel_productos_almacen.setVisible(false);
		//this.add(panel_productos_almacen);		

		//panel_recetario = new Panel_recetario(this.getWidth(), this.getHeight());
		//panel_recetario.setVisible(false);
		//this.add(panel_recetario);
		
		//panel_receta = new Panel_receta(this.getWidth(), this.getHeight());
		//panel_receta.setVisible(false);
		//this.add(panel_receta);

		//panel_cliente = new Panel_cliente(this.getWidth(), this.getHeight());
		//panel_cliente.setVisible(false);
		//this.add(panel_cliente);

		
		//panel_pedido = new Panel_pedido(this.getWidth(), this.getHeight());
		//panel_pedido.setVisible(false);
		//this.add(panel_pedido);

		//panel_contabilidad = new Panel_contabilidad(this.getWidth(), this.getHeight());
		//panel_contabilidad.setVisible(false);
		//this.add(panel_contabilidad);

		//panel_lista_gastos = new Panel_lista_gastos(this.getWidth(), this.getHeight());
		//panel_lista_gastos.setVisible(false);
		//this.add(panel_lista_gastos);
		
		//panel_lista_facturacion = new Panel_lista_facturacion(this.getWidth(), this.getHeight());
		//panel_lista_facturacion.setVisible(false);
		//this.add(panel_lista_facturacion);
		
		
		//panel_detalle_gastos = new Panel_detalle_gastos(this.getWidth(), this.getHeight());
		//panel_lista_facturacion.setVisible(false);
		//this.add(panel_detalle_gastos);
		
		//panel_detalle_factura = new Panel_detalle_factura(this.getWidth(), this.getHeight());
		//panel_detalle_factura.setVisible(false);
		//this.add(panel_detalle_factura);

		panel_lista_compra = new Panel_lista_compra(this.getWidth(), this.getHeight()); 
		//panel_lista_compra.setVisible(false);
		this.add(panel_lista_compra);
	}
		

	
	public void establecerManejador(ControladorVentana manejador) {

		//panel_login.establecerManejador(manejador);
		//panel_principal.establecerManejador(manejador);

	    //for(Component c : this.getComponents()) {
		//       System.out.println(c);
		//    }

	}
	
	
}
