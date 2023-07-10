package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/") 
public class MainController {

    @Autowired
    private CursoRepository repository;

    @GetMapping(path="/")
    public @ResponseBody String home() {
        return "AT70719936 - Maryorie Yulissa Sanchez Perez";
    }

    @GetMapping(path="/codigo")
    public @ResponseBody String codigo() {
        return "AT70719936";
    }

    @GetMapping(path="/onombre-complet")
    public @ResponseBody String nombre() {
        return "Maryorie Yulissa Sanchez Perez";
    }

    @GetMapping(path = "/api/curso/listar")
    public @ResponseBody Iterable<Curso> listar(){
        return repository.findAll();
    }


    @PostMapping(path="/api/curso/nuevo")
    public @ResponseBody String nuevo(@RequestParam String nombre,@RequestParam Integer creditos){
        Curso c = new Curso();
        c.setNombre(nombre);
        c.setCreditos(creditos);
        repository.save(c);
        return "Curso Guardado";
    }


    @DeleteMapping(path = "/api/curso/eliminar")
    public @ResponseBody String elminar (@RequestParam Integer id){
        Curso c = new Curso();
        c.setId(id);
        repository.delete(c);
        return "Curso Eliminado";
    }
}
