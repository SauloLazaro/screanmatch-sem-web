package br.com.alura.screanmatch;

import br.com.alura.screanmatch.Service.ConverteDados;
import br.com.alura.screanmatch.Service.consumoApi;
import br.com.alura.screanmatch.model.DadosSerie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ScreanmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreanmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new consumoApi();
			var json = consumoApi.obterDados("http://www.omdbapi.com/?t=breaking+bad&apikey=bea1d7a8");
		System.out.println(json);
		ConverteDados conversor  = new ConverteDados();
		DadosSerie dados =  conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
