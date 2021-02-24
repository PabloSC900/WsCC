package com.ejmvc.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ejmvc.modelo.entidad.Usuario;
import com.ejmvc.modelo.negocio.GestorUsuario;

@Controller
public class ControladorUsuario {

	@Autowired
	private GestorUsuario gestorUsuario;
	
	@GetMapping("doLogin")
	public String prueba() {
		
		
		return "videojuegos";
		
	}
	
	
	@PostMapping("doLogin")
	public String logarse(
			@RequestParam("nombre_usuario") String nombre,
			@RequestParam("pass") String password,
			Model model) {		
		
		System.out.println("---ENTRANDO EN DOLOGIN");
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		boolean validado = gestorUsuario.validarUsuario(usuario);		
		
		if(validado) {			
			model.addAttribute("nombreUsuario", nombre);			
			return "redirect:listaVideojuegos";			
		}else {			
			return "error_login";
		}
	}
	
}
