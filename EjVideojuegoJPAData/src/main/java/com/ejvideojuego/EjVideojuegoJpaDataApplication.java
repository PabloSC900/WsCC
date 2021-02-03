package com.ejvideojuego;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ejvideojuego.modelo.entidad.Videojuego;
import com.ejvideojuego.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class EjVideojuegoJpaDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjVideojuegoJpaDataApplication.class, args);
		
		DaoVideojuego daoVj = context.getBean("daoVideojuego", DaoVideojuego.class);
		
		
		//Create
		Videojuego vj1 = new Videojuego();		
		vj1.setNombre("God of War");
		vj1.setCompania("Ubisoft");
		vj1.setPrecio(69.99);
		vj1.setPuntuacion(9.8);		
		daoVj.save(vj1);
		
		//Update
		Videojuego vj2 = new Videojuego();
		vj2.setId(1);
		vj2.setNombre("God of War");
		vj2.setCompania("Ubisoft Montreal");
		vj2.setPrecio(20.0);
		vj2.setPuntuacion(9.5);
		daoVj.save(vj2);
		
		//Read todos los videojuegos
		List<Videojuego> listaVj = daoVj.findAll();
		
		//Read un videojuego
		Videojuego vj3 = daoVj.findById(1).get();
		
		//Delete
		daoVj.deleteById(1);		
		
		
		
		
	}

}
