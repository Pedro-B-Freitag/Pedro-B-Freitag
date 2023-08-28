package classes;

import java.sql.Blob;
import java.sql.Time;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "curso")
@Entity(name = "curso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "curso_id")

public class Curso {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private     Long      curso_id;
    private     String    curso_descricao;
    private     String    curso_categoria;
    private     String    curso_fornecedor;
    private     String    curso_nome;
    private     String    curso_url;
    private     Character curso_presencial;
    private     Blob      curso_imagem;
    private     Integer   curso_vizualizacoes;
    private     Integer   curso_gostei;
    private     Time      curso_quantidade_horas;

    public Curso(DTOS.CursoRequestDTO data){
        curso_id = data.curso_id();
        curso_descricao = data.curso_descricao();
        curso_categoria = data.curso_categoria();
        curso_fornecedor = data.curso_fornecedor();
        curso_nome = data.curso_nome();
        curso_url = data.curso_url();
        curso_presencial = data.curso_presencial();
        curso_imagem = data.curso_imagem();
        curso_vizualizacoes = data.curso_vizualizacoes();
        curso_gostei = data.curso_gostei();
        curso_quantidade_horas = data.curso_quantidade_horas();
    }


    //adicionar curso
    public static void InserirCurso(List<Curso> listaCursos, Curso curso){
        listaCursos.add(curso);
    }

    //selecionar curso
    
}