package br.com.alura.screenMatch.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@Entity
@Table(name = "episodios")
public class Episodio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer temporada;
    private Integer numeroEp;
    private String titulo;
    private Double avaliacaoEp;
    private LocalDate dataLancamento;
    private String duracaoEP;
    private String diretorEp;
    private String generoEp;
    @ManyToOne
    private Serie serie;

    public Episodio(){}

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
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
