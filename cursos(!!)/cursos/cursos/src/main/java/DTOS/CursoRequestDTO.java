package DTOS;

import java.sql.Blob;
import java.sql.Time;

public record CursoRequestDTO(
          Long      curso_id,
          String    curso_descricao,
          String    curso_categoria,
          String    curso_fornecedor,
          String    curso_nome,
          String    curso_url,
          Character curso_presencial,
          Blob      curso_imagem,
          Integer   curso_vizualizacoes,
          Integer   curso_gostei,
          Time      curso_quantidade_horas)


{
}
    

