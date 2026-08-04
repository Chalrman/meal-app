package com.softdev.yourmeal;

import jakarta.persistence.*;

@Entity
@Table(name = "grocery_ingredients")
public class GroceryIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;

    private String name;

    private String normalizedName;

    protected GroceryIngredient() {
    }

    public GroceryIngredient(AppUser user, String name, String normalizedName) {
        this.user = user;
        this.name = name;
        this.normalizedName = normalizedName;
    }

    public Long getId() {
        return id;
    }

    public AppUser getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public String getNormalizedName() {
        return normalizedName;
    }
}
