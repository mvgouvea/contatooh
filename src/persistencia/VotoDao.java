package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import entidade.Voto;

public class VotoDao {
	
	
	public void salvar(Voto v) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/atendimento","postgres","123456");
			
			String sql = "INSERT INTO voto VALUES(default, ?)";
			PreparedStatement instrucao = con.prepareStatement(sql);
			
			
			instrucao.setInt(1, v.getNota());
			instrucao.execute();
			
			instrucao.close();
			con.close();			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
