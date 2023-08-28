package Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import classes.Curso;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {
    
}
