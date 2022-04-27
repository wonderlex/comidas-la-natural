package Lanzador;

import Controladores.ControladorVentana;
import Vista.Ventana;

public class Principal {

	public static void main(String[] args) {
		Ventana miVentana = new Ventana();
		ControladorVentana manejador = new ControladorVentana(miVentana);
		miVentana.establecerManejador(manejador);
	}

}
