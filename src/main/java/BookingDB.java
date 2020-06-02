import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class BookingDB {
    public void connection() {
        Connection connection = newConnection(
                "postgresql",
                "localhost",
                "5432",
                "booking",
                "postgres",
                "bastos2003"
        );

        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
//            createTableAccommodation(connection);
//            createTableRoomFair(connection);
//            createTableAccommodationToRoomFairRelation(connection);
//            insertIntoAccommodation(connection);
//            insertIntoRoomFair(connection);
//            insertIntoAccommodationToRoomFairRelation(connection);
            printAccommodation(connection);
            printRoomFair(connection);
            printAccommodationToRoomFairRelation(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printAccommodationToRoomFairRelation(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from accommodation_to_room_fair_relation");
        List<AccommodationToRoomFairRelation> accommodationToRoomFairRelations = new ArrayList<>();

        while (resultSet.next()) {
            AccommodationToRoomFairRelation accommodationToRoomFairRelation =
                    new AccommodationToRoomFairRelation(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(3));
            accommodationToRoomFairRelations.add(accommodationToRoomFairRelation);
        }

        for (AccommodationToRoomFairRelation i : accommodationToRoomFairRelations) {
            log.info(i);
        }

    }

    public void printRoomFair(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from room_fair");
        List<RoomFair> roomFairs = new ArrayList<>();

        while (resultSet.next()) {
            RoomFair roomFair = new RoomFair(resultSet.getInt(1), resultSet.getDouble(2), resultSet.getString(3));
            roomFairs.add(roomFair);
        }

        for (RoomFair i : roomFairs) {
            log.info(i);
        }

    }

    public void printAccommodation(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from accommodation");
        List<Accommodation> accommodations = new ArrayList<>();

        while (resultSet.next()) {
            Accommodation accommodation = new Accommodation(resultSet.getInt("id"), resultSet.getString("type"),
                    resultSet.getString("bed_type"), resultSet.getInt("max_guests"), resultSet.getString("description"));
            accommodations.add(accommodation);
        }


        for (Accommodation i : accommodations) {
            log.info(i);
        }

    }

    public void insertIntoAccommodationToRoomFairRelation(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into accommodation_to_room_fair_relation " +
                "(id, id_accommodation, id_room_fair) values (?, ?, ?)");

        preparedStatement.setInt(1, 1);
        preparedStatement.setInt(2, 1);
        preparedStatement.setInt(3, 1);
        preparedStatement.execute();
        connection.commit();

        PreparedStatement preparedStatement1 = connection.prepareStatement("insert into accommodation_to_room_fair_relation " +
                "(id, id_accommodation, id_room_fair) values (?, ?, ?)");

        preparedStatement1.setInt(1, 2);
        preparedStatement1.setInt(2, 2);
        preparedStatement1.setInt(3, 2);
        preparedStatement1.execute();
        connection.commit();

        PreparedStatement preparedStatement2 = connection.prepareStatement("insert into accommodation_to_room_fair_relation " +
                "(id, id_accommodation, id_room_fair) values (?, ?, ?)");

        preparedStatement2.setInt(1, 3);
        preparedStatement2.setInt(2, 2);
        preparedStatement2.setInt(3, 3);
        preparedStatement2.execute();
        connection.commit();

        PreparedStatement preparedStatement3 = connection.prepareStatement("insert into accommodation_to_room_fair_relation " +
                "(id, id_accommodation, id_room_fair) values (?, ?, ?)");

        preparedStatement3.setInt(1, 4);
        preparedStatement3.setInt(2, 3);
        preparedStatement3.setInt(3, 1);
        preparedStatement3.execute();
        connection.commit();

        PreparedStatement preparedStatement4 = connection.prepareStatement("insert into accommodation_to_room_fair_relation " +
                "(id, id_accommodation, id_room_fair) values (?, ?, ?)");

        preparedStatement4.setInt(1, 5);
        preparedStatement4.setInt(2, 3);
        preparedStatement4.setInt(3, 3);
        preparedStatement4.execute();
        connection.commit();


    }

    public void insertIntoRoomFair(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into room_fair " +
                "(id, value, season) values (?, ?, ?)");

        preparedStatement.setInt(1, 1);
        preparedStatement.setDouble(2, 150);
        preparedStatement.setString(3, "Summer");
        preparedStatement.executeUpdate();
        connection.commit();

        PreparedStatement preparedStatement1 = connection.prepareStatement("insert into room_fair " +
                "(id, value, season) values (?, ?, ?)");

        preparedStatement1.setInt(1, 2);
        preparedStatement1.setDouble(2, 170);
        preparedStatement1.setString(3, "All- Season");
        preparedStatement1.executeUpdate();
        connection.commit();

        PreparedStatement preparedStatement2 = connection.prepareStatement("insert into room_fair " +
                "(id, value, season) values (?, ?, ?)");

        preparedStatement2.setInt(1, 3);
        preparedStatement2.setDouble(2, 270);
        preparedStatement2.setString(3, "All- Season");
        preparedStatement2.executeUpdate();
        connection.commit();
    }

    public void insertIntoAccommodation(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into accommodation " +
                "(id, type, bed_type, max_guests, description) values (?, ?, ?, ?, ?)");

        preparedStatement.setInt(1, 1);
        preparedStatement.setString(2, "Motel");
        preparedStatement.setString(3, "Single");
        preparedStatement.setInt(4, 1);
        preparedStatement.setString(5, "GOOD");
        preparedStatement.executeUpdate();
        connection.commit();

        PreparedStatement preparedStatement1 = connection.prepareStatement("insert into accommodation " +
                "(id, type, bed_type, max_guests, description) values (?, ?, ?, ?, ?)");

        preparedStatement1.setInt(1, 2);
        preparedStatement1.setString(2, "Hotel");
        preparedStatement1.setString(3, "King");
        preparedStatement1.setInt(4, 2);
        preparedStatement1.setString(5, "Nice");
        preparedStatement1.executeUpdate();
        connection.commit();

        PreparedStatement preparedStatement2 = connection.prepareStatement("insert into accommodation " +
                "(id, type, bed_type, max_guests, description) values (?, ?, ?, ?, ?)");

        preparedStatement2.setInt(1, 3);
        preparedStatement2.setString(2, "Hostel");
        preparedStatement2.setString(3, "Double");
        preparedStatement2.setInt(4, 2);
        preparedStatement2.setString(5, "Excellent");
        preparedStatement2.executeUpdate();
        connection.commit();

    }


    public void createTableAccommodationToRoomFairRelation(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "create table accommodation_to_room_fair_relation " +
                        "(id serial primary key, " +
                        "id_accommodation serial references accommodation, " +
                        "id_room_fair serial references room_fair)"
        );

        preparedStatement.execute();
        connection.commit();
    }

    public void createTableRoomFair(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "create table room_fair " +
                        "(id serial primary key, " +
                        "value double precision, " +
                        "season varchar(32))"
        );

        preparedStatement.execute();
        connection.commit();
    }

    public void createTableAccommodation(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "create table accommodation " +
                        "(id serial, " +
                        "type varchar(32), " +
                        "bed_type varchar(32), " +
                        "max_guests int, " +
                        "description varchar(512), " +
                        "primary key(id))"
        );

        preparedStatement.execute();
        connection.commit();
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
