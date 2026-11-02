package gestion.stock.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class Mvt {
    private UUID id;
    private LocalDateTime dateTime;
    private String note;
    private TypeMvt type;
    private Double qty;
    private Article article;

    public Mvt() {
        this.id = UUID.randomUUID();
        this.dateTime = LocalDateTime.now();
    }

    public Mvt(String note, TypeMvt type, Double qty, Article article) {
        this();
        this.note = note;
        this.type = type;
        this.qty = qty;
        this.article = article;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public LocalDateTime getDateTime() { return dateTime; }
    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
    public TypeMvt getType() { return type; }
    public void setType(TypeMvt type) { this.type = type; }
    public Double getQty() { return qty; }
    public void setQty(Double qty) { this.qty = qty; }
    public Article getArticle() { return article; }
    public void setArticle(Article article) { this.article = article; }
}