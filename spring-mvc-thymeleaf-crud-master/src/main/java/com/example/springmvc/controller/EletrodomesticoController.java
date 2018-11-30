package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springmvc.model.Eletrodomestico;
import com.example.springmvc.service.EletrodomesticoService;

@Controller
public class EletrodomesticoController {
	
	private EletrodomesticoService service = new EletrodomesticoService();
	
    @RequestMapping(path = "/eletrodomesticos/add", method = RequestMethod.GET)
    public String createEletrodomestico(Model model) {
        model.addAttribute("eletrodomestico", new Eletrodomestico());
        return "eletrodomesticoEdit";
    }

    @RequestMapping(path = "eletrodomesticos", method = RequestMethod.POST)
    public String saveEletrodomestico(Eletrodomestico eletrodomestico) {
        service.save(eletrodomestico);
        return "redirect:/";
    }

    @RequestMapping(path = "/eletrodomesticos", method = RequestMethod.GET)
    public String getAllEletrodomesticos(Model model) {
        model.addAttribute("eletrodomesticos", service.findAll());
        return "eletrodomesticos";
    }

    @RequestMapping(path = "/eletrodomesticos/edit/{id}", method = RequestMethod.GET)
    public String editEletrodomestico(Model model, @PathVariable(value = "id") Integer id) {
        model.addAttribute("eletrodomestico", service.findOne(id));
        return "eletrodomesticoEdit";
    }

    @RequestMapping(path = "/eletrodomesticos/delete/{id}", method = RequestMethod.GET)
    public String deleteEletrodomestico(@PathVariable(name = "id") Integer id) {
        service.delete(id);
        return "redirect:/eletrodomesticos";
    }
}
