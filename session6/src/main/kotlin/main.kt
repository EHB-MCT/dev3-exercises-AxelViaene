import java.sql.DriverManager
import java.util.*

fun main() {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    // Prepare credentials
    val connectionProps = Properties()
    val credentials = Credentials()
    connectionProps["user"] = credentials.userName
    connectionProps["password"] = credentials.userPassword

// Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                credentials.host +
                ":" + "3306" + "/" +
                credentials.userName,
        connectionProps)

}

