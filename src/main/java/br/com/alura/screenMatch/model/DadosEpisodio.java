package br.com.alura.screenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Episode") Integer numeroEp,
                            @JsonAlias("Title") String titulo,
                            @JsonAlias("imdbRating") String avaliacaoEp,
                            @JsonAlias("Released") String dataLancamento,
                            @JsonAlias("Runtime") String duracaoEP,
                            @JsonAlias("Director") String diretorEp,
                            @JsonAlias("Genre") String generoEp) {

}
