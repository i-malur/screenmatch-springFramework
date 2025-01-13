package br.com.alura.screenMatch.service;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTraducao(@JsonAlias("responseData") DadosResposta dadosResposta) {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DadosResposta {
        public String translatedText;
    }
}