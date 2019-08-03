package br.com.fabiodmioto.cursomc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fabiodmioto.cursomc.Services.CategoriaService;
import br.com.fabiodmioto.cursomc.domain.Categoria;
import br.com.fabiodmioto.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository cr;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(new Categoria(null, "Informática"));
		categorias.add(new Categoria(null, "Escritório"));
		
		cr.saveAll(categorias);
		
	}

}
