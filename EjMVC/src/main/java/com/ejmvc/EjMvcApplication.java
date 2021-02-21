package com.ejmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ejmvc.modelo.entidad.Usuario;
import com.ejmvc.modelo.entidad.Videojuego;
import com.ejmvc.modelo.persistencia.DaoUsuario;
import com.ejmvc.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class EjMvcApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(EjMvcApplication.class, args); 
		
		DaoUsuario du = context.getBean("daoUsuario", DaoUsuario.class);
		DaoVideojuego dvj = context.getBean("daoVideojuego", DaoVideojuego.class);
	
		Usuario u1 = new Usuario();
		u1.setNombre("pablo");
		u1.setPassword("lechuga");
		
		du.save(u1);		
				
		Videojuego vj1 = new Videojuego();		
		vj1.setNombre("God of War");
		vj1.setCompania("Ubisoft");
		vj1.setPrecio(69.99);
		vj1.setPuntuacion(9.8);		
		dvj.save(vj1);		
		
		Videojuego vj2 = new Videojuego();		
		vj2.setNombre("FIFA 21");
		vj2.setCompania("EA Sports");
		vj2.setPrecio(50.0);
		vj2.setPuntuacion(7.5);
		dvj.save(vj2);
		
		Videojuego vj3 = new Videojuego();		
		vj3.setNombre("Far Cry 6");
		vj3.setCompania("Cryteck");
		vj3.setPrecio(59.99);
		vj3.setPuntuacion(9.0);
		dvj.save(vj3);
		
		Videojuego vj4 = new Videojuego();		
		vj4.setNombre("Call of Duty MWF");
		vj4.setCompania("Infinity Ward");
		vj4.setPrecio(65.99);
		vj4.setPuntuacion(9.2);
		dvj.save(vj4);
		
		Videojuego vj5 = new Videojuego();		
		vj5.setNombre("Ghost of Tushima");
		vj5.setCompania("Sucker Punch");
		vj5.setPrecio(70);
		vj5.setPuntuacion(9.5);
		dvj.save(vj5);
		
		
		
	}

}
