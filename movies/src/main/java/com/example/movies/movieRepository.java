package com.example.movies;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
public interface movieRepository extends JpaRepository<movies,Long> {
 @Query("select m from movies m where m.genre1=:genre1")
    List<movies> findByGenre1(@Param("genre1") String genre1);

    @Query("select m from movies m where m.popular=true")
    List<movies> findByIsPopularTrue();

    @Query("select m from movies m where m.name LIKE :name%")
    List<movies> findByName(@Param("name") String name);

    List<movies> findAll();

    @Modifying
    @Transactional // Required for modifying queries
    @Query("DELETE FROM movies m WHERE m.name =:name")
    void deleteByName(@Param("name") String name);

    @Query("select m from movies m where m.Date>=:today")
    List<movies> upcoming(@Param("today") LocalDate today);

    @Query("select m from movies m where m.Date<=:today")
    List<movies> past(@Param("today") LocalDate today);

    @Query("select m from movies m where m.Date >=:today order by m.Date desc")
    List<movies> findupcoming(@Param("today") LocalDate today);

    @Query("SELECT m FROM movies m ORDER BY m.Date DESC")
    List<movies> findallmovies(@Param("today") LocalDate today);

    @Query("SELECT AVG(m.rating) FROM movies m")
    float findAverageRating();

    @Query("from movies")
    List<movies> findAllMovies();

    @Modifying
    @Transactional
    @Query("Update movies m set m.name=:name where m.id=:id")
    void updateMovie(@Param("name") String name, @Param("id") Long id);

    @Query("select m from movies m where m.rating >2.0  AND m.rating <= :avgrating")
    List<movies> findmoviesByRating(@Param("avgrating") float avgrating);

}
