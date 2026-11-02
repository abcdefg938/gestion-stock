package gestion.stock;

import gestion.stock.dao.impl.SupplierDAO;
import gestion.stock.models.Supplier;

public class GestionStock {

    public static void main(String[] args) {
        try {
            SupplierDAO dao = new SupplierDAO();
            dao.create(new Supplier("Ali Ben Salah", "ali@mail.tn", "20123456", "TN123"));
            dao.findAll().forEach(s -> System.out.println(s.getFullname()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}