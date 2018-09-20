package com.mercado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mercado.model.Compra;
import com.mercado.repository.CompraRepository;

@Controller
@RequestMapping("/compras")
public class CompraController {

	@Autowired
	private CompraRepository cpRp;
	
	@RequestMapping("/novo")
	public ModelAndView pgNovo(){
		ModelAndView mv = new ModelAndView("novo");
		Compra compra= new Compra();
		
		mv.addObject("itemNotinha", compra.getItem());
		mv.addObject("compra", compra);
		return mv;
	}
	
}
