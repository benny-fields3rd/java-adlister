import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config) {
        if(connection == null) // Daniel added this portion on walktrhough
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(connection);
    }
    @Override
    public List<Ad> all() {
        Statement stmt;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from ads");
            return adResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("There was an error obtaining all ads.", e);
        }
    }
    @Override
    public Long insert(Ad ad){
        Statement stmt;
        long lastInsertID = 0;
        String insertQuery = String.format(
                "INSERT INTO ads (id, user_id, title, description) VALUES (%d, %d, '%s', '%s')", // use single quotes for strings
                //otherwise it becomes part of the SQL statement
                ad.getId(),
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription());
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate(insertQuery, stmt.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                lastInsertID = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lastInsertID;
    }

    private List<Ad> adResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while(rs.next()) {
        Long id = rs.getLong("id");
        Long userId = rs.getLong("user_id");
        String title = rs.getString("title") ;
        String description = rs.getString("description");
        Ad ad = new Ad(id, userId, title, description);
            ads.add(ad);
        }
        return ads;
    }

    public static void main( String[] args ) {
        MySQLAdsDao dao = new MySQLAdsDao(new Config());
        List<Ad> ads = dao.all();
        System.out.println(ads.get(1).getTitle());
        for (Ad ad : ads){
            System.out.println();
        }

    }
}

