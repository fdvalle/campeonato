
public class Programa {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		jogador1.nome = "Son";
		jogador1.dataNascimento = "05/05/95";
		jogador1.setPosicao("Atacante");
		
		Jogador jogador2 = new Jogador();
		jogador2.nome = "Kane";
		jogador2.dataNascimento = "05/05/95";
		jogador2.setPosicao("Atacante");
		
		Jogador jogador3 = new Jogador();
		jogador3.nome = "Eriksen";
		jogador3.dataNascimento = "05/05/95";
		jogador3.setPosicao("Meia");
		
		Jogador jogador4 = new Jogador();
		jogador4.nome = "Dele Alli";
		jogador4.dataNascimento = "05/05/95";
		jogador4.setPosicao("Meia");
		
		Jogador jogador5 = new Jogador();
		jogador5.nome = "Dembelé";
		jogador5.dataNascimento = "05/05/95";
		jogador5.setPosicao("Volante");
		
		Jogador jogador6 = new Jogador();
		jogador6.nome = "Dier";
		jogador6.dataNascimento = "05/05/95";
		jogador6.setPosicao("Volante");
		
		Jogador jogador7 = new Jogador();
		jogador7.nome = "Vertonghen";
		jogador7.dataNascimento = "05/05/95";
		jogador7.setPosicao("Zagueiro");
		
		Jogador jogador8 = new Jogador();
		jogador8.nome = "Alderweireld";
		jogador8.dataNascimento = "05/05/95";
		jogador8.setPosicao("Zagueiro");
		
		Jogador jogador9 = new Jogador();
		jogador9.nome = "Trippier";
		jogador9.dataNascimento = "05/05/95";
		jogador9.setPosicao("Lateral Direito");
		
		Jogador jogador10 = new Jogador();
		jogador10.nome = "Davies";
		jogador10.dataNascimento = "05/05/95";
		jogador10.setPosicao("Lateral Esquerdo");
		
		Jogador jogador11 = new Jogador();
		jogador11.nome = "Lloris";
		jogador11.dataNascimento = "05/05/95";
		jogador11.setPosicao("Goleiro");
		
		Jogador[] jogadores1 = new Jogador[11];
		
        Tecnico tecnico1 = new Tecnico();
        tecnico1.nome = "Mauricio Pochettino";
        tecnico1.dataNascimento = "05/05/75";
        tecnico1.setEspecialidade("Marcação Pressão"); 		
		
		Equipe equipe1 = new Equipe();
		equipe1.setNome("Spurs");
		equipe1.setCidade("Londres");
		equipe1.setTecnico(tecnico1);
		equipe1.setJogadores(jogadores1);
		equipe1.adicionaJogador(jogador1);
		equipe1.adicionaJogador(jogador2);
		equipe1.adicionaJogador(jogador3);
		equipe1.adicionaJogador(jogador4);
		equipe1.adicionaJogador(jogador5);
		equipe1.adicionaJogador(jogador6);
		equipe1.adicionaJogador(jogador7);
		equipe1.adicionaJogador(jogador8);
		equipe1.adicionaJogador(jogador9);
		equipe1.adicionaJogador(jogador10);
		equipe1.adicionaJogador(jogador11);
		
		Jogador jogador21 = new Jogador();
		jogador21.nome = "Borja";
		jogador21.dataNascimento = "05/05/95";
		jogador21.setPosicao("Atacante");
		
		Jogador jogador22 = new Jogador();
		jogador22.nome = "Dudu";
		jogador22.dataNascimento = "05/05/95";
		jogador22.setPosicao("Atacante");
		
		Jogador jogador23 = new Jogador();
		jogador23.nome = "William";
		jogador23.dataNascimento = "05/05/95";
		jogador23.setPosicao("Atacante");
		
		Jogador jogador24 = new Jogador();
		jogador24.nome = "Guerra";
		jogador24.dataNascimento = "05/05/95";
		jogador24.setPosicao("Meia");
		
		Jogador jogador25 = new Jogador();
		jogador25.nome = "Moises";
		jogador25.dataNascimento = "05/05/95";
		jogador25.setPosicao("Volante");
		
		Jogador jogador26 = new Jogador();
		jogador26.nome = "Felipe Mello";
		jogador26.dataNascimento = "05/05/95";
		jogador26.setPosicao("Volante");
		
		Jogador jogador27 = new Jogador();
		jogador27.nome = "Thiago Martins";
		jogador27.dataNascimento = "05/05/95";
		jogador27.setPosicao("Zagueiro");
		
		Jogador jogador28 = new Jogador();
		jogador28.nome = "Anthonio Carlos";
		jogador28.dataNascimento = "05/05/95";
		jogador28.setPosicao("Zagueiro");
		
		Jogador jogador29 = new Jogador();
		jogador29.nome = "Tche Tche";
		jogador29.dataNascimento = "05/05/95";
		jogador29.setPosicao("Lateral Direito");
		
		Jogador jogador210 = new Jogador();
		jogador210.nome = "Michel Bastos";
		jogador210.dataNascimento = "05/05/95";
		jogador210.setPosicao("Lateral Esquerdo");
		
		Jogador jogador211 = new Jogador();
		jogador211.nome = "Jailson";
		jogador211.dataNascimento = "05/05/95";
		jogador211.setPosicao("Goleiro");
		
		Jogador[] jogadores2 = new Jogador[11];
		
        Tecnico tecnico2 = new Tecnico();
        tecnico2.nome = "Roger Machado";
        tecnico2.dataNascimento = "05/05/75";
        tecnico2.setEspecialidade("Sem Padrão"); 		
		
		Equipe equipe2 = new Equipe();
		equipe2.setNome("Palmeiras");
		equipe2.setCidade("São Paulo");
		equipe2.setTecnico(tecnico2);
		equipe2.setJogadores(jogadores2);
		equipe2.adicionaJogador(jogador21);
		equipe2.adicionaJogador(jogador22);
		equipe2.adicionaJogador(jogador23);
		equipe2.adicionaJogador(jogador24);
		equipe2.adicionaJogador(jogador25);
		equipe2.adicionaJogador(jogador26);
		equipe2.adicionaJogador(jogador27);
		equipe2.adicionaJogador(jogador28);
		equipe2.adicionaJogador(jogador29);
		equipe2.adicionaJogador(jogador210);
		equipe2.adicionaJogador(jogador211);
		
		Partida p = new Partida();
		p.setEquipe(equipe1);
		p.setEquipe(equipe2);
		p.setData("08/03/2018");
		p.setEstadio("White Hart Lane");
		
		
		System.out.println("~~~~~~~~~~ Mundial Interclubes FIFA ~~~~~~~~~~~");
		System.out.println("Partida: " + p.getEquipe(equipe1).getNome() + " X " + p.getEquipe(equipe2).getNome());
		System.out.println("Estádio: " + p.getEstadio());
		System.out.println("Data: " + p.getData());
		
		System.out.println(" ");

		
		System.out.println("~~~~~~~~~~ Informações Time da Casa ~~~~~~~~~~");
		System.out.println("Nome do Clube: " + equipe1.getNome());
		System.out.println("Técnico: " + equipe1.getTecnico().nome);
		System.out.println("Especialidade: " + equipe1.getTecnico().getEspecialidade());
		System.out.println("Destaque do time: " + jogador2.nome + " - " + jogador2.getPosicao() + " - Data de Nascimento: " + jogador2.dataNascimento);
		
		System.out.println("-- Escalação " + equipe1.getNome() + " --");
		for(Jogador j : equipe1.getJogadores()) {
			System.out.println(j.nome + " - " + j.getPosicao());
		}
		
		System.out.println(" ");

		System.out.println("~~~~~~~~~~ Informações Time Visitante ~~~~~~~~~~");
		System.out.println("Nome do Clube: " + equipe2.getNome());
		System.out.println("Técnico: " + equipe2.getTecnico().nome);
		System.out.println("Especialidade: " + equipe2.getTecnico().getEspecialidade());
		System.out.println("Destaque do time: " + jogador22.nome + " - " + jogador22.getPosicao() + " - Data de Nascimento: " + jogador22.dataNascimento);
		
		System.out.println("-- Escalação " + equipe2.getNome() + " --");
		for(Jogador j : equipe2.getJogadores()) {
			System.out.println(j.nome + " - " + j.getPosicao());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
