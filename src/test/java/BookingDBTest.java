import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class BookingDBTest {
    @Test
    public void TestInsertAccommodation() throws SQLException {
        Connection connection = newConnection("postgresql", "localhost", "5432", "booking", "postgres", "bastos2003");
        connection.setAutoCommit(false);

        try{
            PreparedStatement preparedStatement = connection.prepareStatement("insert into accommodation_to_room_fair_relation " +
                    "(id, id_accommodation, id_room_fair) values (?, ?, ?)");
            preparedStatement.setInt(1,4);
            preparedStatement.setString(2,"test00");
            preparedStatement.setString(3, "test01");
            preparedStatement.setInt(4,2);
            preparedStatement.setString(5,"test02");
            preparedStatement.executeUpdate();
            connection.commit();
        } finally {
            connection.rollback();
            connection.close();
        }

    }

    @Test
    public void testPrintAccommodationToRoomFairRelation() throws SQLException {
        Connection connection = newConnection("postgresql", "localhost", "5432", "booking", "postgres", "bastos2003");
        BookingDB database = new BookingDB();
        database.printAccommodationToRoomFairRelation(connection);
    }

    public Connection newConnection(String type, String localhost, String port, String dataBaseName, String user, String password) {
        String url;
        url = "jdbc:" + type + "://" + localhost + ":" + port +
                "/" + dataBaseName + "?user=" + user + "&password=" + password;
        System.out.println(url);

        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}