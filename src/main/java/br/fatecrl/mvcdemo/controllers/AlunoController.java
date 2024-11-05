package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

    public List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoController() {
        alunos.add(new Aluno("Daniel", "123", 7.0f, 8.0f));
        alunos.add(new Aluno("Leandro", "456", 6.0f, 5.0f));
    }
    @GetMapping
    public String getAlunos(Model model) {
        model.addAttribute("alunos", alunos);
        return "alunos";
    }

}
