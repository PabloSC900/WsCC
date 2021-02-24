package com.ejmvc.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ejmvc.modelo.entidad.Videojuego;
import com.ejmvc.modelo.negocio.GestorVideojuego;

@Controller
public class ControladorVideojuego {

	@Autowired
	private GestorVideojuego gestorVideojuego;
	
	@GetMapping("listaVideojuegos") 
	public String cargarListaVJ(Model model) {
		
		ArrayList<Videojuego> listaVideojuegos = gestorVideojuego.cargarListaVj();
		model.addAttribute("listaVideojuegos", listaVideojuegos);
		
		
		return "videojuegos";
		
	}
	
	@GetMapping("buscarVj") 
	public String buscar(@RequestParam("id_vj") String nombre,	Model model) {
		
		int idVj = Integer.parseInt(nombre);
		
		Videojuego vj = gestorVideojuego.cargarVj(idVj);
		
		model.addAttribute("vj", vj);
		
		return "videojuegos";
		
	}
	
	
	
	
	
	
}
