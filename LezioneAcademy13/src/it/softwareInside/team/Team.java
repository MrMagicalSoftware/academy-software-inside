package it.softwareInside.team;


public class Team {

	private Player[] players; 
	private Allenatore allenatore;
	
	private int numeroTrofeiVinti;
	private String nome;
	
	
	public Team() {
		this("cervia", new Allenatore(), 3);
	}

	public Team(String nome , Allenatore allenatore , int numeroTrofeiVinti ) {
		
		setNome(nome);
		setNumeroTrofeiVinti(numeroTrofeiVinti);
		setAllenatore(allenatore);
		this.players = new Player[11];
	}
	
	public Team(String nome , Allenatore allenatore ) {
		
		setNome(nome);
		setNumeroTrofeiVinti(numeroTrofeiVinti);
		setAllenatore(allenatore);
		setNumeroTrofeiVinti(10);
		this.players = new Player[11];
	}
	

	
	
	
	
	//AGGIUNGI GIOCATORE
	
	public boolean addPlayer(Player player) {
		
		if(player == null)
			return false;
		
		for (int i = 0; i < players.length; i++) {
			// il posto è libero ??
			if(this.players[i] == null) {
				this.players[i] = player;
				return true;

			}
		}
		return false;
	}
	
	
	
	// if( removePlayer() == null ) ===> non  ho rimosso nulla
	
	
	public Player removePlayer(int posizione) {
		
		if(posizione < 0 || posizione >= this.players.length)
			return null;
		
		Player playerTmp = this.players[posizione] ;
		this.players[posizione] = null; // remove
		return playerTmp;
	}
	
	
	// fabio marco paolo luigi
	
	// ris  =  "fabio" 
	//+ "marco " + "paolo" . .. . . .
	
	@Override
	public String toString() {
		
		String ris = "";
		for(Player player : this.players)
			ris += player + "\n";   // ris = ris + player
		
		return "nome " + this.nome + " Trofey " + this.numeroTrofeiVinti + " " +
				"Allenatore " + this.allenatore + "players  " + "\n"+ ris ; 
	
	}
	
	
	public void stampaTeamConAllenatore() {
		
		
		System.out.println("Allenatore " + this.allenatore );
		
		// 	/ :  
		
		for(Player player : this.players)
			System.out.println(player);
		
		
		for (int i = 0; i < this.players.length; i++) {
			System.out.println(this.players[i]);
		}
		
		
//		esempio for each
//		int[] vett =  { 10 , 20 , 30};
//		for(int elemento : vett)
//			System.out.println(elemento);
		
	}
	
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// casa  10
	
	public void setNumeroTrofeiVinti(int numeroTrofeiVinti) {
		
		
		if(numeroTrofeiVinti > this.numeroTrofeiVinti)
			this.numeroTrofeiVinti = numeroTrofeiVinti;
	
//		this.numeroTrofeiVinti = numeroTrofeiVinti > this.numeroTrofeiVinti ? 
//				numeroTrofeiVinti : this.numeroTrofeiVinti; 
	}
	
	public void setAllenatore(Allenatore allenatore) {
		this.allenatore = allenatore;
	}
	
	public void setPlayers(Player[] players) {
		
		if(players.length == 11)
			this.players = players;
	}
	
	
	public Player[] getPlayers() {
		return players;
	}
	
	public Allenatore getAllenatore() {
		return allenatore;
	}
	
	public int getNumeroTrofeiVinti() {
		return numeroTrofeiVinti;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	
	
}
