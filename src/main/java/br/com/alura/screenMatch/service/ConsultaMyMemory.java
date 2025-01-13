package br.com.alura.screenMatch.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class ConsultaMyMemory {
    public static String obterTraducao(String text) {
        ConverteDados conversor = new ConverteDados();
        ConsumoApi consumo = new ConsumoApi();

        try {
            String texto = URLEncoder.encode(text, "UTF-8");
            String langpair = URLEncoder.encode("autodetect|pt-br", "UTF-8");
            String url = "https://api.mymemory.translated.net/get?q=" + texto + "&langpair=" + langpair;

            String json = consumo.obterDados(url);

            DadosTraducao traducao = conversor.obterDados(json, DadosTraducao.class);

            return traducao.dadosResposta().translatedText;

        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Erro na codificação da URL", e);
        }
    }
}
