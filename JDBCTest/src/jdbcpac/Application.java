package jdbcpac;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Application {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/employee_sal";
		try {
			Connection cn= DriverManager.getConnection(url,"root","root");
			Statement s= cn.createStatement();
//			ResultSet rs= s.executeQuery("select * from employee");
//            ResultSetMetaData metaData = rs.getMetaData();
//            int columnCount = metaData.getColumnCount();
//            for (int i = 1; i <= columnCount; i++) {
//                System.out.print(metaData.getColumnName(i) + "\t");
//            }
//            System.out.println();
//            while (rs.next()) {
//                for (int i = 1; i <= columnCount; i++) {
//                    System.out.print(rs.getString(i) + "\t");
//                }
//                System.out.println();
//            }
//			while(rs.next()) { 
//				System.out.println(rs.getRow());
//				
//			}
			int rowsaffected=s.executeUpdate("update employee set salary=62000 where id=1 ");
			System.out.println("rows updated: "+ rowsaffected);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
