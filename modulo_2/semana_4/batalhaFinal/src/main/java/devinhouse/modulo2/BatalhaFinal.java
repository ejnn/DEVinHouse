package devinhouse.modulo2;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.InvocationTargetException;

import devinhouse.modulo2.Armadilha;

import devinhouse.modulo2.enums.Arma;
import devinhouse.modulo2.enums.Sexo;
import devinhouse.modulo2.enums.Motivacao;

import devinhouse.modulo2.classes.Guerreiro;
import devinhouse.modulo2.classes.Paladino;
import devinhouse.modulo2.classes.Arqueiro;
import devinhouse.modulo2.classes.Mago;

import devinhouse.modulo2.inimigos.Armeiro;
import devinhouse.modulo2.inimigos.Alquimista;
import devinhouse.modulo2.inimigos.Lider;

public class BatalhaFinal {
    
    public static void main(String[] args) throws Exception {
	
	Scanner input = new Scanner(System.in);
	
	System.out.printf("Seja bem vindo(a) à BATALHA FINAL!%n"
			  + "Hora da criação de personagem!%n"
			  + "Qual o seu nome?%n");
	String nome = input.nextLine().trim();
	
	System.out.printf("Masculino ou Feminino?%n");
	String idSexo = input.nextLine().trim().toLowerCase();
	Sexo sexo = idSexo == "masculino" ? Sexo.M : Sexo.F;
	
	System.out.printf("Selecione uma classe:%n"
			  + "Guerreiro, Paladino, Arqueiro ou Mago?%n");
	String idClasse = input.nextLine().trim().toLowerCase();
	Class<?> classe;
	switch (idClasse) {
	case "guerreiro":
	    classe = Guerreiro.class;
	case "paladino":
	    classe = Paladino.class;
	case "arqueiro":
	    classe = Arqueiro.class;
	default:
	    classe = Mago.class;
	}
	
	Arma[] armasDisponiveis = (Arma[]) classe.getDeclaredMethod("getArmasDisponiveis", null).invoke(null, null);
	System.out.printf("Escolha uma arma:%n");
	System.out.println(Arrays.toString(armasDisponiveis));
	String idArma = input.nextLine().trim();
	Arma arma = armasDisponiveis[0];
	for (Arma a : armasDisponiveis) {
	    if (idArma.equalsIgnoreCase(a.name())) {
		arma = a;
	    }
	}
	
	// intro
	System.out.printf("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo,%n"
			  + "e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão.%n"
			  + "Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.%n"
			  + "Memórias do caminho percorrido para chegar até aqui invadem sua mente.%n"
			  + "Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno.%n"
			  + "Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas.%n"
			  + "Você está a um passo de encerrar para sempre esse mal.%n"
			  + "Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.%n");
	
	System.out.printf("Vingança ou glória?%n");
	String idMotivacao = input.nextLine().trim();
	Motivacao motivacao = idMotivacao.equals("vinganca") ? Motivacao.VINGANCA : Motivacao.GLORIA;
	
	Jogador jogador = (Jogador) classe
	    .getDeclaredConstructor(String.class, Sexo.class, Motivacao.class, Arma.class)
	    .newInstance(nome, sexo, motivacao, arma);
	
	if (jogador.getMotivacao() == Motivacao.VINGANCA) {
	    System.out.println("Imagens daquela noite trágica invadem sua mente.\n"
			       + "Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes,\n"
			       + "mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram.\n"
			       + "Elas são o combustível que te fizeram chegar até aqui.\n"
			       + "E você sabe que não irá desistir até ter vingado a morte\n"
			       + "daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo.\n"
			       + "O maldito líder finalmente pagará por tanto mal causado na vida de tantos\n"
			       + "(e principalmente na sua).");
	} else {
	    System.out.println("Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos,\n"
			       + "bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas,\n"
			       + "taberneiros se recusando a cobrar por suas bebedeiras e comilanças.\n"
			       + "Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas,\n"
			       + "depois de destruir o vilão que tanto assombrou a paz de todos.\n"
			       + "Porém, você sabe que ainda falta o último ato dessa história.\n"
			       + "Você se concentra na missão.\n"
			       + "A glória o aguarda, mas não antes da última batalha.");
	}
	
	System.out.printf("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas,%n"
			  + "suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado.%n"
			  + "Você avança pelo portal%n."
			  + "A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas.%n"
			  + "À sua frente, só é possível perceber que você se encontra em um corredor extenso.%n"
			  + "Você só pode ir à frente, ou desistir.%n");
	
	System.out.printf("Digite sua escolha:%n");
	if (input.nextLine().trim().equalsIgnoreCase("desistir")) {
	    System.out.println("O medo invade o seu coração e você sente que ainda não está à altura do desafio.%n"
			       + "Você se volta para a noite lá fora, e corre em direção à segurança.");
	    System.exit(0);
	}
	
	System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros,\n"
			   + "até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha,\n"
			   + "vindo de dentro de uma porta aberta.\n"
			   + "Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha,\n"
			   + "e pondera sobre como passar pela porta.");
	
	System.out.printf("Passar pela porta ANDANDO CUIDADOSAMENTE, CORRENDO ou SALTANDO?%n");
	switch (input.nextLine().trim().toLowerCase()) {
	    
	case "saltando":
	    System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
	    
	case "correndo":
	    System.out.println("Você respira fundo e desata a correr em direção à sala.\n"
			       + "Quando passa pela porta, sente que pisou em uma pedra solta,\n"
			       + "mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos.\n"
			       + "Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você,\n"
			       + "e quando se vira, vê várias flechas no chão.\n"
			       + "Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\n"
			       + "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
	    
	default:
	    System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz.\n"
			       + "Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta.\n"
			       + "Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor.\n"
			       + "Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");
	    
	    new Armadilha().atacar(jogador);
	}
	
	System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede.\n"
			   + "Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas.\n"
			   + "A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler,\n"
			   + "mas reconhece como sendo a língua antiga utilizada pelo inimigo.\n"
			   + "Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas,\n"
			   + "e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais,\n"
			   + "antes de conseguir enfrentar o líder.");
	
	System.out.println("Você se dirige para a porta à direita.");
	
	System.out.println("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
			   + "Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra.\n"
			   + "Ao entrar, você se depara com uma sala espaçosa,\n"
			   + "com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas.\n"
			   + "Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados\n"
			   + "utilizam quando saem para espalhar o terror nas cidades e vilas da região.\n"
			   + "Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás.\n"
			   + "Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo.\n"
			   + "Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate.\n"
			   + "Ele avança em sua direção.");
	Armeiro armeiro = new Armeiro();
	// TODO: iniciar loop de combate, inimigo ataca primeiro
	
	System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados.\n"
			   + "Olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
	
	System.out.printf("Pegar as armaduras?%n");

	if (input.nextLine().trim().equalsIgnoreCase("sim")) {
	    System.out.println("Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas,\n"
			       + "que estavam danificadas, pelas peças de armaduras existentes na sala.\n"
			       + "De armadura nova, você se sente mais protegido para os desafios à sua frente.");
	    jogador.setDefesa(jogador.getDefesa() + 5);
	} else {
	    System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
	}
	
	System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo.\n"
			   + "Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");
	
	System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda.\n"
			   + "Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
			   + "Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra.\n"
			   + "Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras,\n"
			   + "existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas,\n"
			   + "e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes,\n"
			   + "criando poções utilizadas pelos soldados para aterrorizar a região.");
	System.out.println("No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo.\n"
			   + "Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");
	// TODO: instanciar objeto Alquimista
	Alquimista alquimista = new Alquimista();
	// TODO: iniciar loop de combate, inimigo ataca primeiro
	
	System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo.\n"
			   + "Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado,\n"
			   + "pega a garrafa e pondera se deve beber um gole.");

	System.out.printf("Beber?");

	if (input.nextLine().trim().equalsIgnoreCase("sim")) {
	    System.out.println("Você se sente revigorado para seguir adiante!");
	    jogador.setSaude(Jogador.SAUDE_MAXIMA);
	} else {
	    System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");
	}
	
	System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa,\n"
			   + "e sabe que aquela chave abre a outra fechadura da porta do líder inimigo.\n"
			   + "Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
	
	System.out.println("De volta à sala das portas, você se dirige à porta final.\n"
			   + "Coloca as chaves nas fechaduras, e a porta se abre.\n"
			   + "Seu coração acelera, memórias de toda a sua vida passam pela sua mente,\n"
			   + "e você percebe que está muito próximo do seu objetivo final.\n"
			   + "Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta.");
	
	System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes.");
	
	System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.");
	
	System.out.printf("Atacar ou se preparar para o combate?");

	// TODO: jogador deve decidir se ataca ou espera
	// TODO: iniciar loop de combate, dependendo da resposta do jogador, ele ataca primeiro
	if (input.nextLine().trim().equalsIgnoreCase("atacar")) {
	} else {
	    System.out.printf("Não há tempo! Ele ataca...%n");
	}
	
	System.out.println("Você conseguiu!");
	switch (jogador.getMotivacao()) {
	case Motivacao.VINGANCA:
	    System.out.printf("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por%n"
			      + "uma sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito.%n"
			      + "Agora você pode seguir sua vida.%n");
	case Motivacao.GLORIA:
	    System.out.printf("O êxtase em que você se encontra não cabe dentro de si.%n"
			      + "Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou.%n");
	}
	
	System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta,\n"
			   + "e todos vocês saem em direção à noite, retornando à cidade.\n"
			   + "Seu dever está cumprido.");
    }
    
    private void combate(/* parâmetros */) {		
	/*
	  Num combate, cada adversário possui um turno. Quem toma a iniciativa do início do combate possui a vantagem do primeiro turno. O inimigo sempre atacará, e o jogador pode escolher entre atacar e fugir (encerrando o jogo).
	  
	  Cada ataque leva em consideração os pontos de ataque do personagem + ataque da arma + “rolamento de dado” (valor entre 1-20) para definir o tanto de dano que o atacante irá desferir no defensor. Essa quantidade de dano é subtraída pelos pontos de defesa do defensor. Se o rolamento de dado do atacante for 1, ele erra, e o defensor não sofre nenhum dano. Se o rolamento de dado do atacante for 20, ele conseguirá um acerto crítico, e o seu ataque ignora a defesa do adversário (ou seja, o dano que ele desfere é 100%, sem subtrair pelos pontos de defesa do defensor).
	  
	  Quando o inimigo ataca, é realizado o cálculo do ataque e o jogo deve atualizar os pontos de vida do jogador, e exibir a mensagem: “O inimigo atacou! Você sofreu X de dano e agora possui Y pontos de vida.” substituindo X pela quantidade de dano do ataque e Y pela quantidade de pontos de vida atual do jogador. Se o inimigo errar, a mensagem exibida deve ser “O inimigo errou o ataque! Você não sofreu dano.”. Se o inimigo acertar um ataque crítico, a mensagem deve ser: "O inimigo acertou um ataque crítico! Você sofreu X de dano e agora possui Y pontos de vida.".
	  Caso o ataque do inimigo te leve a 0 pontos de vida, você morre, e a mensagem exibida deve ser “Você não estava preparado para a força do inimigo. {COMPLEMENTO DE ACORDO COM A MOTIVAÇÃO}”, substituindo o conteúdo entre chaves de acordo com a motivação do personagem selecionada no início do jogo. VINGANÇA: “Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.” GLÓRIA: “A glória que buscavas não será sua, e a cidade aguarda por seu(sua) próximo(a) herói(na).” (o gênero deve ser alterado para refletir o sexo do personagem escolhido pelo jogador no início do jogo). O jogo encerra quando o jogador morre.
	  
	  Quando é a vez do jogador fazer uma ação, deve ser perguntado a ele se ele deseja atacar ou fugir. Se escolher fugir, o jogo deve exibir a mensagem “Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.”.
	  Se escolher atacar, o jogo deve realizar o cálculo do ataque e atualizar os pontos de vida do inimigo. O jogo deve exibir a mensagem “Você atacou {COMPLEMENTO DA ARMA} e causou X de dano no inimigo!”, substituindo o conteúdo entre chaves de acordo com a arma do personagem. Espada, machado, martelo ou clava: “com sua/seu {ARMA}”. Arco+flecha ou besta+virote: “com seu/sua {ARMA}, a/o {MUNIÇÃO} atingiu”. Cajado: “com seu cajado, lançando uma bola de fogo”. Livro: “absorvendo energia do livro com uma mão e liberando com a outra”.
	  Se o jogador errar, a mensagem exibida deve ser “Você errou seu ataque! O inimigo não sofreu dano algum.”. Se o jogador acertar um ataque crítico, a mensagem deve ser: "Você acertou um ataque crítico! {COMPLEMENTO}” substituindo o conteúdo entre chaves pela mensagem de ataque normal.
	  Caso o inimigo morra com o seu ataque, o jogo deve exibir “O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.”
	*/
    }
    
}
