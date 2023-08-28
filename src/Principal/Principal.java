package Principal;

import Modelos.MinhasPreferidas;
import Modelos.Musica;
import Modelos.Podcast;

public class Principal {

	public static void main(String[] args) {
		Musica minhaMusica = new Musica();
		
		minhaMusica.setTitulo("Por me amar");
		minhaMusica.setCantor("Ariane");
		
		for(int i = 0; i < 1000; i++) {
			minhaMusica.reproduz();
		}
		
		for(int i = 0; i < 50; i++) {
			minhaMusica.curte();
		}
		
		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("bolhaDev");
		meuPodcast.setApresentador("Maria");
		
		for(int i = 0; i < 5000; i++) {
			meuPodcast.reproduz();
		}
		for(int i = 0; i < 1000; i++) {
			meuPodcast.curte();
		}
		
		MinhasPreferidas preferidas = new MinhasPreferidas();
		
		preferidas.inclui(meuPodcast);
		preferidas.inclui(minhaMusica);
}
}

