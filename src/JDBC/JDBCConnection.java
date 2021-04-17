package JDBC;
import java.sql.*;
public class JDBCConnection {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@hostname:1521:xe","user","password");
				Statement st = connect.createStatement();
				String sql = "select * from jdbc_table";
				ResultSet rs = st.executeQuery(sql);
				ResultSetMetaData resultSetMetadata = rs.getMetaData();
				System.out.println(resultSetMetadata.getColumnName(1)+"|"+resultSetMetadata.getColumnName(2)+"|"
				+resultSetMetadata.getColumnName(3)+"|"+resultSetMetadata.getColumnName(4)+"|"+resultSetMetadata.getColumnName(5));	
				while(rs.next())
				System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4)+"|"+rs.getString(5));
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		  } catch (ClassNotFoundException e) {
			    e.printStackTrace();
		}
	}
}
