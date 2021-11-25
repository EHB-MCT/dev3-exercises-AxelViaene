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
                ":" + "3306 " + "/" +
                credentials.userName,
        connectionProps)

    println("Where would you like to go?")
    var userDestination = readLine()

    val statement = connection.prepareStatement("SELECT name, departure_time, city.id FROM city " +
            "LEFT JOIN rides ON rides.destination_city_id = city.id " +
            "WHERE name = ? ORDER BY departure_time ASC LIMIT 1")
    statement.setString(1,userDestination)
    val result = statement.executeQuery()
    while(result.next()) {
        result.getString("id")
        println(result.getString("departure_time"))
    }





}

