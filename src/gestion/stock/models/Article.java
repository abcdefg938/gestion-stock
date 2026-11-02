package gestion.stock.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Article {
    private UUID id;
    private String label;
    private String description;
    private Double qty;
    private Double prixAchat;
    private Double prixVente;
    private Category category;
    private List<Supplier> suppliers = new ArrayList<>();

    public Article() {
        this.id = UUID.randomUUID();
    }

    public Article(String label, String description, Double qty,
                   Double prixAchat, Double prixVente, Category category) {
        this();
        this.label = label;
        this.description = description;
        this.qty = qty;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.category = category;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Double getQty() { return qty; }
    public void setQty(Double qty) { this.qty = qty; }
    public Double getPrixAchat() { return prixAchat; }
    public void setPrixAchat(Double prixAchat) { this.prixAchat = prixAchat; }
    public Double getPrixVente() { return prixVente; }
    public void setPrixVente(Double prixVente) { this.prixVente = prixVente; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
    public List<Supplier> getSuppliers() { return suppliers; }
    public void setSuppliers(List<Supplier> suppliers) { this.suppliers = suppliers; }

    @Override
    public String toString() {
        return label + " (" + qty + ")";
    }
}