package value;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:resources/db.properties")

public class JDBCConnection {
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.userName}")
	private String userName;
	@Value("${mysql.password}")
	private String password;
	@Value("${mysql.driver}")
	private String driver;

	public void features() {
		System.out.println("SQL URL: "+url);
		System.out.println("SQL User Name: "+userName);
		System.out.println("SQL Password: "+password);
		System.out.println("SQL Driver: "+driver);
	}
	public void getJDBCConnection() throws Exception {
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("connection sucesfful : " +con );
	}
	
	
	
	
}
