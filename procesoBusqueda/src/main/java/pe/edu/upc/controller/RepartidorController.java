package pe.edu.upc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.el.parser.ParseException;

import pe.edu.upc.model.Repartidor;
import pe.edu.upc.service.IRepartidorService;

@Controller
@RequestMapping("/repartidor")
public class RepartidorController {

	@Autowired
	private IRepartidorService rService;

	@RequestMapping("/new")
	public String newRepartidor(Model model) {
		model.addAttribute("repartidor", new Repartidor());
		return "repartidor";
	}

	@RequestMapping("/registrar")
	public String registrar(@ModelAttribute Repartidor objRepartidor, BindingResult binRes, Model model)
			throws ParseException {
		if (binRes.hasErrors())
			return "repartidor";
		else {
			int rpta = rService.insertar(objRepartidor);
			if (rpta > 0) {
				model.addAttribute("mensaje", "El RUC del repartidor ya está registrado");
				return "repartidor";
			} else {
				model.addAttribute("mensaje", "Se guardó correctamente");
				return "redirect:/repartidor/listar";
			}
		}
	}

	@RequestMapping("/listar")
	public String listar(Map<String, Object> model) {
		model.put("listaRepartidores", rService.listar());
		return "listRepartidor";
	}

	@RequestMapping("/irBuscar")
	public String buscar(Model model) {
		model.addAttribute("repartidor", new Repartidor());
		return "buscar";
	}

	@RequestMapping("/buscar")
	public String findbyCategory(Map<String, Object> model, @ModelAttribute Repartidor repartidor)
			throws ParseException {
		List<Repartidor> listaRepartidores;
		repartidor.setNameRepartidor(repartidor.getNameRepartidor());
		listaRepartidores = rService.findByName(repartidor.getNameRepartidor());
		if(listaRepartidores.isEmpty()) {
			listaRepartidores = rService.findByRUC(repartidor.getNameRepartidor());
		}
		if(listaRepartidores.isEmpty()) {
			model.put("mensaje", "No se encontraron coincidencias");
		}
		model.put("listaRepartidores", listaRepartidores);
		return "buscar";
	}
}
