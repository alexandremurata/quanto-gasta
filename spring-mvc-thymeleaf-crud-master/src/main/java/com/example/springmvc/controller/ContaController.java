package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springmvc.model.Conta;
import com.example.springmvc.service.ContaService;

@Controller
public class ContaController {

	private ContaService service = new ContaService();
	
	@RequestMapping(path = "/contas/add", method = RequestMethod.GET)
    public String createConta(Model model) {
        model.addAttribute("conta", new Conta());
        return "contaEdit";
    }

    @RequestMapping(path = "contas", method = RequestMethod.POST)
    public String saveConta(Conta conta) {
        service.save(conta);
        return "redirect:/";
    }

    @RequestMapping(path = "/contas", method = RequestMethod.GET)
    public String getAllContas(Model model) {
        model.addAttribute("contas", service.findAll());
        return "contas";
    }

    @RequestMapping(path = "/contas/fechar", method = RequestMethod.POST)
    public String fecharConta(Conta conta) {
        service.fecharConta(conta);
        return "redirect:/";
    }
}
