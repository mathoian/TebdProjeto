
import java.sql.*;

public class BDjdbc extends BD implements java.io.Serializable {

	static BDjdbc bdjdbc = new BDjdbc();
	private String dataSource;
	public BDjdbc() {}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public void setConexao() throws Exception {
		try {
			String driver = "org.mariadb.jdbc.Driver";
			Class.forName(driver);
			String url = "jdbc:mariadb://localhost:3306/db_tebd";
			this.conn = DriverManager.getConnection(url, "root", "123456");
			conn.setAutoCommit(false);

		} catch (Exception e) {
			System.out.println(e);
			throw e;
		}
	}

	public String toString() {
		return "Login = " + this.login + " Senha = " + this.senha;
	}

	public static void main(String args[]) throws Exception {

		BDjdbc conexao = new BDjdbc();
		try {
			String driver = "org.mariadb.jdbc.Driver";// for win: String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);
			String url = "jdbc:mariadb://127.0.0.1:3306/db_tebd";// for win: String url =
			Connection c = DriverManager.getConnection(url, "root", "123456");
			System.out.println("Base: " + c.getCatalog() + " [conexao ok]");

		} catch (Exception e) {
			System.out.println("Erro:  " + e);
		}
	}
}
