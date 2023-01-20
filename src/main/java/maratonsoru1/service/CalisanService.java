package maratonsoru1.service;

import maratonsoru1.entity.Calisan;
import maratonsoru1.entity.Sirket;
import maratonsoru1.util.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CalisanService implements ICrud<Calisan> {
    DB db = new DB();
    List<Calisan> list = new ArrayList<>();
    Calisan calisan;

    @Override
    public void create(Calisan calisan) {
        String sql = "INSERT INTO calisan(isim,yas,maas,departman,sirketId) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
            preparedStatement.setString(1, calisan.getIsim());
            preparedStatement.setInt(2, calisan.getYas());
            preparedStatement.setInt(3, calisan.getMaas());
            preparedStatement.setString(4, calisan.getDepartman());
            preparedStatement.setInt(5, calisan.getSirket().getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void read() {
        String sql = "SELECT c.id,c.isim,c.yas,c.maas,c.departman,s.sirketIsmi,s.id as 'sirketId' FROM calisan as c\n" +
                "INNER JOIN sirket as s ON c.sirketId = s.id";
        try {
            PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String isim = rs.getString("isim");
                int yas = rs.getInt("yas");
                int maas = rs.getInt("maas");
                String departman = rs.getString("departman");
                String sirketName = rs.getString("sirketIsmi");
                int sirketId = rs.getInt("sirketId");
                calisan = new Calisan(id, isim, yas, maas, departman, new Sirket(sirketId, sirketName));
                list.add(calisan);
            }
            list.forEach(System.out::println);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Calisan calisan) {
        String sql = "UPDATE calisan SET yas = ?,maas = ?,departman = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
            preparedStatement.setInt(1, calisan.getYas());
            preparedStatement.setInt(2, calisan.getMaas());
            preparedStatement.setString(3, calisan.getDepartman());
            preparedStatement.setInt(4, calisan.getCalisanId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM calisan WHERE id = ?";
        try {
            PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
