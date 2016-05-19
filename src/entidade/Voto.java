package entidade;

public class Voto {
	
	private Integer id = null;
	
	private Integer nota;
	
	
	
	public Voto(Integer nota) {
		super();
		this.nota = nota;
	}

	public Integer getNota() {
		return nota;
	}

	public void setVoto(Integer nota) {
		this.nota = nota;
	}

	public Integer getId() {
		return id;
	}
	
	
}
