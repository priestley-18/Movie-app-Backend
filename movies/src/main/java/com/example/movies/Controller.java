package com.example.movies;

import java.util.List;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
     private final service1 ms;

    public Controller(service1 ms) {
        this.ms = ms;
    }

    @PostMapping("saved")
    public movies savedata(@RequestBody movies entity) {

        return ms.savedata(entity);
    }

    @PostMapping("savebulk")
    public List<movies> savebulk1(@RequestBody List<movies> entity) {
        return ms.savebulk(entity);
    }

    @GetMapping("/{genre}")
    public List<movies> getMoviesByGenre(@PathVariable String genre1) throws Exception {
        return ms.getMoviesByGenre(genre1);
    }

    @GetMapping("/popular")
    public List<movies> PopularMovies() {
        return ms.getPopularMovies();
    }

    @GetMapping("/allmovies1")
    public List<movies> getallmovies432() {
        return ms.getallmovies123();
    }

    @PostMapping("/byname/{entity}")
    public List<movies> postMethodName(@PathVariable String entity) {
        return ms.getnames(entity.toLowerCase());
    }

    @PutMapping("/movies/{id}/{newTitle}")
    public void updateMovieName(@PathVariable Long id, @PathVariable String newTitle) {
        ms.updateMovieName(id, newTitle); // Update movie title
    }

    @PostMapping("/delete/{name}")
    public List<movies> deleteByName(@PathVariable String name) throws Exception {
        return ms.deleteMovieByName(name);
    }

    @GetMapping("/upcoming")
    public List<movies> getMethodName() {
        return ms.getnewmovies();
    }

    @GetMapping("/pastmovies")
    public List<movies> pastmovies() {
        return ms.getpast();
    }

    @GetMapping("/findupcoming")
    public List<movies> getfindbyupcoming() {
        return ms.getmoviesupcoming();
    }

    @GetMapping("/allmovies")
    public List<movies> getmovies() {
        return ms.getsmovies();
    }

    @GetMapping("/rating")
    public float getRating() {
        return ms.getAvgMovieRating();
    }

    @GetMapping("/avgrating")
    public List<movies> getavgratings() {
        return ms.getmovierating();
    }


}
