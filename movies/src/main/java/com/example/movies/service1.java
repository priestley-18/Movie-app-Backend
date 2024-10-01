package com.example.movies;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class service1 {
    private final movieRepository Movierepositorys;

    public service1 (movieRepository movierepositorys) {
        this.Movierepositorys = movierepositorys;
    }

    public movies savedata(movies movies) {
        return Movierepositorys.save(movies);
    }

    @Transactional
    public List<movies> deleteMovieByName(String name) throws Exception {
        Movierepositorys.deleteByName(name);
        return Movierepositorys.findAll();
    }

    public List<movies> savedbulk(List<movies> movies) {
        return Movierepositorys.saveAll(movies);
    }

    public List<movies> savebulk(List<movies> movies) {
        return Movierepositorys.saveAll(movies);
    }

    public List<movies> getMoviesByGenre(String genre) {
        return Movierepositorys.findByGenre1(genre);
    }

    public List<movies> getPopularMovies() {
        return Movierepositorys.findByIsPopularTrue();
    }

    public List<movies> getnames(String name) {
        return Movierepositorys.findByName(name);
    }

    public List<movies> getnewmovies() {
        LocalDate id = LocalDate.now();
        return Movierepositorys.upcoming(id);

    }

    public List<movies> getallmovies123() {
        return Movierepositorys.findAllMovies();
    }

    public List<movies> getpast() {
        LocalDate id = LocalDate.now();
        return Movierepositorys.past(id);
    }

    public void updateMovieName(Long id, String newTitle) {
        Movierepositorys.updateMovie(newTitle, id); // Call the update method
    }

    public List<movies> getmoviesupcoming() {
        LocalDate id = LocalDate.now();
        return Movierepositorys.findupcoming(id);
    }

    public List<movies> getsmovies() {
        LocalDate id = LocalDate.now();
        return Movierepositorys.findallmovies(id);
    }

    public float getAvgMovieRating() {
        return Movierepositorys.findAverageRating();
    }

    public List<movies> getmovierating() {
        float ar = Movierepositorys.findAverageRating();
        return Movierepositorys.findmoviesByRating(ar);
    }

    
}
