package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoApiController {
    public List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoApiController() {
        alunos.add(new Aluno("Daniel", "123", 7.0f, 8.0f));
        alunos.add(new Aluno("Leandro", "456", 6.0f, 5.0f));
    }

    @GetMapping
    public List<Aluno> getAlunos() {
        return alunos;
    }
}
