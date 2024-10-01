package com.example.movies;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre1;
    private boolean popular;
    private LocalDate Date;
    private String Poster;
    private float rating;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre1() {
        return genre1;
    }
    public void setGenre1(String genre1) {
        this.genre1 = genre1;
    }
    public boolean isPopular() {
        return popular;
    }
    public void setPopular(boolean popular) {
        this.popular = popular;
    }
    public LocalDate getDate() {
        return Date;
    }
    public void setDate(LocalDate date) {
        Date = date;
    }
    public String getPoster() {
        return Poster;
    }
    public void setPoster(String poster) {
        Poster = poster;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    public movies(Long id, String name, String genre1, boolean popular, LocalDate date, String poster, float rating) {
        this.id = id;
        this.name = name;
        this.genre1 = genre1;
        this.popular = popular;
        this.Date = date;
        this.Poster = poster;
        this.rating = rating;
    }
    public movies() {
    }

    
}
