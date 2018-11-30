package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springmvc.model.Consumo;
import com.example.springmvc.service.ConsumoService;

@Controller
public class ConsumoController {

private ConsumoService service = new ConsumoService();
	
    @RequestMapping(path = "/consumos/add", method = RequestMethod.GET)
    public String createConsumo(Model model) {
        model.addAttribute("consumo", new Consumo());
        return "consumoEdit";
    }

    @RequestMapping(path = "consumos", method = RequestMethod.POST)
    public String saveConsumo(Consumo consumo) {
        service.save(consumo);
        return "redirect:/";
    }

    @RequestMapping(path = "/consumos", method = RequestMethod.GET)
    public String getAllConsumos(Model model) {
        model.addAttribute("consumos", service.findAll());
        return "consumos";
    }

    @RequestMapping(path = "/consumos/edit/{id}", method = RequestMethod.GET)
    public String editConsumo(Model model, @PathVariable(value = "id") Integer id) {
        model.addAttribute("consumo", service.findOne(id));
        return "consumoEdit";
    }

    @RequestMapping(path = "/consumos/delete/{id}", method = RequestMethod.GET)
    public String deleteConsumo(@PathVariable(name = "id") Integer id) {
        service.delete(id);
        return "redirect:/consumos";
    }
}
