package com.ejmvc.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejmvc.modelo.entidad.Usuario;
import com.ejmvc.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {
	
	@Autowired
	private DaoUsuario daoUsuario;
		
	public boolean validarUsuario(Usuario usuario) {
		
		Usuario usuarioDB = daoUsuario.findByNombreAndPassword(usuario.getNombre(), usuario.getPassword());	
				
		if(usuarioDB == null) {			
			return false;			
		}else {			
			return true;			
		}
	}

}
