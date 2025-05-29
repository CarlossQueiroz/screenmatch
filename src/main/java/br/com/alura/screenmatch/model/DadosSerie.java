package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Para ingnorar os outros dados e bsucar apenas o que desejo
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String title,
                         @JsonAlias("totalSeasons")Integer totalTemporadas,
                         @JsonAlias("imdbRating")String avaliacao) {
}
