package gestion.stock.dao.impl;

import gestion.stock.dao.DAO;
import gestion.stock.models.Supplier;
import gestion.stock.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SupplierDAO implements DAO<Supplier> {

    @Override
    public void create(Supplier s) throws Exception {
        String sql = "INSERT INTO supplier (id, fullname, email, tel, vat) VALUES (?,?,?,?,?)";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, s.getId().toString());
            ps.setString(2, s.getFullname());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getTel());
            ps.setString(5, s.getVat());
            ps.executeUpdate();
        }
    }

    @Override
    public Supplier findById(UUID id) throws Exception {
        String sql = "SELECT * FROM supplier WHERE id = ?";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, id.toString());
            ResultSet rs = ps.executeQuery();
            return rs.next() ? map(rs) : null;
        }
    }

    @Override
    public List<Supplier> findAll() throws Exception {
        List<Supplier> list = new ArrayList<>();
        try (Connection c = DBConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM supplier")) {
            while (rs.next()) {
                list.add(map(rs));
            }
        }
        return list;
    }

    @Override
    public void update(Supplier s) throws Exception {
        String sql = "UPDATE supplier SET fullname=?, email=?, tel=?, vat=? WHERE id=?";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, s.getFullname());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getTel());
            ps.setString(4, s.getVat());
            ps.setString(5, s.getId().toString());
            ps.executeUpdate();
        }
    }

    @Override
    public void delete(UUID id) throws Exception {
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement("DELETE FROM supplier WHERE id=?")) {
            ps.setString(1, id.toString());
            ps.executeUpdate();
        }
    }

    private Supplier map(ResultSet rs) throws SQLException {
        Supplier s = new Supplier();
        s.setId(UUID.fromString(rs.getString("id")));
        s.setFullname(rs.getString("fullname"));
        s.setEmail(rs.getString("email"));
        s.setTel(rs.getString("tel"));
        s.setVat(rs.getString("vat"));
        return s;
    }
}