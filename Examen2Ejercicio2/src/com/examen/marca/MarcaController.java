package com.examen.marca;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;
	
	@RequestMapping("/listMarca")
	public ModelAndView home() {
		List<Marca> marca = marcaService.listAll();
		ModelAndView mav = new ModelAndView("marca");
		mav.addObject("listMarca", marca);
		return mav;
	}
	
	@RequestMapping("/new_marca")
	public String newMarcaForm(Map<String, Object> model) {
		Marca marca = new Marca();
		model.put("marca", marca);
		return "new_marca";
	}
	
	@RequestMapping(value = "/save_marca", method = RequestMethod.POST)
	public String saveMarca(@ModelAttribute("marca") Marca  marca) {
		marcaService.save(marca);
		return "redirect:/listMarca";
	}
	
	@RequestMapping("/edit_marca")
	public ModelAndView editMarcaForm(@RequestParam Integer id) {
		ModelAndView mav = new ModelAndView("edit_marca");
		Marca marca = marcaService.get(id);
		mav.addObject("marca", marca);
		return mav;
	}
	
	@RequestMapping("/delete_marca")
	public String deleteMarcaForm(@RequestParam Integer id) {
		marcaService.delete(id);
		return "redirect:/";		
	}
	
}
