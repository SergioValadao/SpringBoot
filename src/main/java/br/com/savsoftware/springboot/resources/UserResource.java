package br.com.savsoftware.springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.savsoftware.springboot.entities.Usuario;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(null, "Maryah", "maryaholiver38@gmail.com", "27998503750", "123456");
		return ResponseEntity.ok().body(u);
	}
	
}
