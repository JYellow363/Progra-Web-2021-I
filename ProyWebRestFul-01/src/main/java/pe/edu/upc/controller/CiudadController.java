package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.model.Ciudad;
import pe.edu.upc.service.ICiudadService;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {

	@Autowired
	private ICiudadService cService;

	@PostMapping
	public void insertar(@RequestBody Ciudad c) {
		cService.registrar(c);
	}

	@PutMapping
	public void modificar(@RequestBody Ciudad c) {
		cService.registrar(c);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		cService.eliminar(id);
	}

	@GetMapping
	public List<Ciudad> listar() {
		return cService.listar();
	}

}