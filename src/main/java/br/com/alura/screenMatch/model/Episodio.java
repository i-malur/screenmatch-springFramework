package br.com.alura.screenMatch.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEp;
    private Double avaliacaoEp;
    private LocalDate dataLancamento;
    private String duracaoEP;
    private String diretorEp;
    private String generoEp;

    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
        this.numeroEp = dadosEpisodio.numeroEp();
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodio.titulo();
        try{
            this.avaliacaoEp = Double.valueOf(dadosEpisodio.avaliacaoEp());
        }catch (NumberFormatException ex){
            this.avaliacaoEp = 0.0;
        }
        try{
            this.dataLancamento = LocalDate.parse(dadosEpisodio.dataLancamento());
        }catch(DateTimeParseException ex){
            this.dataLancamento = null;
        }
        this.duracaoEP = dadosEpisodio.duracaoEP();
        this.diretorEp = dadosEpisodio.diretorEp();
        this.generoEp = dadosEpisodio.generoEp();

    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEp() {
        return numeroEp;
    }

    public void setNumeroEp(Integer numeroEp) {
        this.numeroEp = numeroEp;
    }

    public Double getAvaliacaoEp() {
        return avaliacaoEp;
    }

    public void setAvaliacaoEp(Double avaliacaoEp) {
        this.avaliacaoEp = avaliacaoEp;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDuracaoEP() {
        return duracaoEP;
    }

    public void setDuracaoEP(String duracaoEP) {
        this.duracaoEP = duracaoEP;
    }

    public String getDiretorEp() {
        return diretorEp;
    }

    public void setDiretorEp(String diretorEp) {
        this.diretorEp = diretorEp;
    }

    public String getGeneroEp() {
        return generoEp;
    }

    public void setGeneroEp(String generoEp) {
        this.generoEp = generoEp;
    }

    @Override
    public String toString() {
        return
                "temporada = " + temporada +
                        ", título = " + titulo +
                        ", numeroEp = " + numeroEp +
                        ", avaliacaoEp = " + avaliacaoEp +
                        ", dataLancamento = " + dataLancamento +
                        ", duracaoEP ='" + duracaoEP + '\'' +
                        ", diretorEp ='" + diretorEp + '\'' +
                        ", generoEp= '" + generoEp + '\'';
    }
}
