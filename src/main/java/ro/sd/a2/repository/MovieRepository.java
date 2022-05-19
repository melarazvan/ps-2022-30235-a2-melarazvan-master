package ro.sd.a2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.sd.a2.entity.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findFirstByName(String name);
    Movie findAllByName(String name);
    Movie findById(Double id);

    List<Movie> findAllByNameIsContaining(String name);

    Movie deleteMovieByName(String name);
}
