package br.com.gustavo.inscitopro.controller;

import br.com.gustavo.inscitopro.model.Inscricao;
import br.com.gustavo.inscitopro.model.LoteInscricao;
import br.com.gustavo.inscitopro.model.StatusPagamento;
import br.com.gustavo.inscitopro.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InscricaoController {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @GetMapping("/inscricoes")
    public ModelAndView listarInscricoes() {
        ModelAndView mv = new ModelAndView("lista-inscricoes");
        mv.addObject("inscricoes", inscricaoRepository.findAll());
        return mv;
    }

    @GetMapping("/nova-inscricao")
    public ModelAndView formularioInscricao() {
        ModelAndView mv = new ModelAndView("form-inscricao");
        mv.addObject("inscricao", new Inscricao());
        mv.addObject("lotes", LoteInscricao.values());
        mv.addObject("status", StatusPagamento.values());
        return mv;
    }

    @PostMapping("/salvar")
    public String salvarInscricao(Inscricao inscricao) {
        inscricaoRepository.save(inscricao);
        return "redirect:/inscricoes";
    }
}