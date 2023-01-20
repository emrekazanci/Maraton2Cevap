package maratonsoru1.service;

import maratonsoru1.entity.Sirket;
import maratonsoru1.util.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SirketService implements ICrud<Sirket> {

    DB db = new DB();
    List<Object> list = new ArrayList<>();
    Sirket sirket;

    @Override
    public void create(Sirket sirket) {
        String sql = "INSERT INTO sirket(sirketIsmi,sirketSahibi,unvan,faaliyetAlani,kurulusYili) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
            preparedStatement.setString(1, sirket.getSirketIsmi());
            preparedStatement.setString(2, sirket.getSirketSahibi());
            preparedStatement.setString(3, sirket.getUnvan());
            preparedStatement.setString(4, sirket.getFaaliyetAlani());
            preparedStatement.setInt(5, sirket.getKurulusYili());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void read() {
        String sql = "SELECT * FROM sirket";
        try {
            PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String sirketIsmi = rs.getString("sirketIsmi");
                String sirketSahibi = rs.getString("sirketSahibi");
                String unvan = rs.getString("unvan");
                String faaliyetAlani = rs.getString("faaliyetAlani");
                int kurulusYili = rs.getInt("kurulusYili");
                sirket = new Sirket(id, sirketIsmi, sirketSahibi, unvan, faaliyetAlani, kurulusYili);
                list.add(sirket);
            }
            list.forEach(System.out::println);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Sirket sirket) {

    }

    @Override
    public void delete(Integer id) {

    }

}
