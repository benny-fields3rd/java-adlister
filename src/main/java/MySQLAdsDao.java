import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
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
        String insertQuery = String.format("INSERT INTO ads (id, user_id, title, description) VALUES ('%d', '%d', '%s', '%s')",
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
}
