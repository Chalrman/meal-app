package com.softdev.yourmeal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "dietary_profiles")
public class DietaryProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private AppUser user;

    private boolean vegetarian;
    private boolean vegan;
    private boolean glutenFree;
    private boolean dairyFree;
    private boolean nutFree;
    private boolean eggFree;
    private boolean peanutFree;
    private boolean shellfishFree;
    private boolean soyFree;
    private boolean fishFree;
    private boolean diabetes;
    private boolean HBP;
    private boolean kidneyDisease;
    private boolean IBS;
    private boolean celiac;

    @Column(length = 100)
    private String goal;

//    @Column(length = 500)
//    private String notes;

    protected DietaryProfile() {
    }

    public DietaryProfile(AppUser user) {
        this.user = user;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public boolean isDairyFree() {
        return dairyFree;
    }

    public void setDairyFree(boolean dairyFree) {
        this.dairyFree = dairyFree;
    }

    public boolean isNutFree() {
        return nutFree;
    }

    public void setNutFree(boolean nutFree) {
        this.nutFree = nutFree;
    }

    public void setEggFree(boolean egg) { eggFree = egg; }

    public boolean isEggFree() { return eggFree; }

    public void setPeanutFree(boolean peanuts) { peanutFree = peanuts; }

    public boolean isPeanutFree(){ return peanutFree; }

    public void setShellfishFree(boolean shellfish) { shellfishFree = shellfish; }

    public boolean isShellfishFree(){ return shellfishFree; }

    public void setSoyFree(boolean soy) { soyFree = soy; }

    public boolean isSoyFree() { return soyFree; }

    public void setFishFree(boolean fish) { fishFree = fish; }

    public boolean isFishFree() {return fishFree;}

    public void setDiabetes(boolean diabetes) { this.diabetes = diabetes; }

    public boolean isDiabetes() {return diabetes;}

    public void setHBP(boolean hbp) { HBP = hbp; }

    public boolean isHBP() {return HBP;}

    public void setKidneyDisease(boolean kidney) { kidneyDisease = kidney; }

    public boolean isKidneyDisease() {return kidneyDisease;}

    public void setIBS(boolean ibs) { IBS = ibs; }

    public boolean isIBS() {return IBS;}

    public void setCeliacDisease(boolean celiac) { this.celiac = celiac; }

    public boolean isCeliac() {return celiac;}

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

//    public String getNotes() {
//        return notes;
//    }
//
//    public void setNotes(String notes) {
//        this.notes = notes;
//    }
}
