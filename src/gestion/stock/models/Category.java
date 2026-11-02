package gestion.stock.models;

import java.util.UUID;

public class Category {
    private UUID id;
    private String name;
    private String description;
    private Category parent;

    public Category() {
        this.id = UUID.randomUUID();
    }

    public Category(String name, String description, Category parent) {
        this();
        this.name = name;
        this.description = description;
        this.parent = parent;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Category getParent() { return parent; }
    public void setParent(Category parent) { this.parent = parent; }

    @Override
    public String toString() {
        return name;
    }
}