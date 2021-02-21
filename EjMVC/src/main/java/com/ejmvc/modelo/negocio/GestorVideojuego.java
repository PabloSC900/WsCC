package com.ejmvc.modelo.negocio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejmvc.modelo.entidad.Videojuego;
import com.ejmvc.modelo.persistencia.DaoVideojuego;

@Service
public class GestorVideojuego {
	
	@Autowired
	private DaoVideojuego daoVideojuego;
	
	public ArrayList<Videojuego> cargarListaVj() {
		
		ArrayList<Videojuego> listaVideojuego = new ArrayList<Videojuego>();
		listaVideojuego = (ArrayList<Videojuego>) daoVideojuego.findAll();
		
		return listaVideojuego;
		
	}
	
	public Videojuego cargarVj(int id) {
		
		Videojuego vj = new Videojuego();
		vj = daoVideojuego.findById(id);
		
		return vj;
		
	}
	
	

}
