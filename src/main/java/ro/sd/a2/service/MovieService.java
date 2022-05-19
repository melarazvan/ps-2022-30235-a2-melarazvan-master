package ro.sd.a2.service;


import org.springframework.stereotype.Service;
import ro.sd.a2.dto.MovieDataDto;
import ro.sd.a2.dto.MovieNameDto;
import ro.sd.a2.entity.Movie;
import ro.sd.a2.entity.Review;
import ro.sd.a2.repository.MovieRepository;
import ro.sd.a2.repository.ReviewRepository;

import java.util.List;


@Service
public class MovieService {

    private final ReviewRepository reviewRepository;
    private final MovieRepository movieRepository;

    public MovieService(ReviewRepository reviewRepository, MovieRepository movieRepository) {
        this.reviewRepository = reviewRepository;
        this.movieRepository = movieRepository;
    }

    public float getMovieRating(Movie movie){
        List<Review> reviewList = reviewRepository.findAllByMovie(movie);

        float nr = reviewList.size();
        float total = 0f;
        for(int i=0;i<nr;i++){
            total += reviewList.get(i).getGrade();
        }
        return total/nr;
    }

    public void addMovie(MovieDataDto dto){
        Movie movie = Movie.builder().name(dto.name).description(dto.description).rateing(dto.rating).build();
        if(movie.getName()!=null)
            movieRepository.save(movie);
    }

    public List<Movie> getMovieList(){
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }

    public  Movie findByName(String name){
        return movieRepository.findAllByName(name);
    }

    public  List<Movie> searchMovie(MovieNameDto dto){return  movieRepository.findAllByNameIsContaining(dto.getName());}

    public Movie findById(Double id){
        return movieRepository.findById(id);
    }
}
