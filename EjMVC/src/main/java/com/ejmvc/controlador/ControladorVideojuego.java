package com.ejmvc.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.ejmvc.modelo.entidad.Videojuego;
import com.ejmvc.modelo.negocio.GestorVideojuego;

@Controller
public class ControladorVideojuego {

	@Autowired
	private GestorVideojuego gestorVideojuego;
	
	@PostMapping("listaVideojuegos") 
	public void cargarListaVJ(Model model) {
		
		ArrayList<Videojuego> listaVideojuegos = gestorVideojuego.cargarListaVj();
		model.addAttribute("listaVideojuegos", listaVideojuegos);
		
	}
	
	
	
	
	
	
	
	
}
