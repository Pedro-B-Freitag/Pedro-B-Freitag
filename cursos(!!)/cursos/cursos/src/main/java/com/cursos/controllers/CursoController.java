package com.cursos.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @GetMapping
    public ResponseEntity SelecionaTodosOsCursos(){
        return ResponseEntity.ok("aaaa");
    }
}
