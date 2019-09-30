package com.examen.producto;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examen.marca.Marca;
import com.examen.marca.MarcaService;



@Controller
public class ProductoController {
@Autowired ProductoService productoService;
@Autowired MarcaService marcaService;
	
	@RequestMapping("/")
	
	public ModelAndView home() {
		List<Producto> p = productoService.listAll();
		
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("producto", p);
		return mav;
	}
	
	@RequestMapping("/new_producto")
	public ModelAndView newProductoForm() {
		ModelAndView mav = new ModelAndView("new_producto");
		//List<Marca> m = marcaService.listAll();
		//mav.addObject("listMarcas", m);
		
		
		return mav ;
	}
	
	@RequestMapping(value = "/save_producto", method = RequestMethod.POST)
	public String saveMarca(@ModelAttribute("producto") Producto  producto) {
		productoService.save(producto);
		return "redirect:/listaProdcutos";
	}
	
	@RequestMapping("/edit_prodcuto")
	public ModelAndView editMarcaForm(@RequestParam Integer id) {
		ModelAndView mav = new ModelAndView("edit_producto");
		Producto p = productoService.get(id);
		mav.addObject("producto", p);
		return mav;
	}
	
	@RequestMapping("/delete_producto")
	public String deleteMarcaForm(@RequestParam Integer id) {
		productoService.delete(id);
		return "redirect:/listaProdcutos";		
	}
	

}
