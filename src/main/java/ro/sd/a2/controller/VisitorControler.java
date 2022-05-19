package ro.sd.a2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ro.sd.a2.dto.MovieDataDto;
import ro.sd.a2.dto.MovieNameDto;
import ro.sd.a2.entity.Movie;
import ro.sd.a2.service.MovieService;
import ro.sd.a2.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VisitorControler {
    private static final Logger log = LoggerFactory.getLogger(FirstController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    private ModelAndView movieList(){
        ModelAndView mav = new ModelAndView();

        List<Movie> movies = movieService.getMovieList();
        mav.addObject("movieList",movies);

        mav.setViewName("movies");
        return mav;
    }

    @PostMapping("/addmovie")
    public ModelAndView addMovie(MovieDataDto dto){
        ModelAndView mav = new ModelAndView();
        movieService.addMovie(dto);
        System.out.println(dto.getName());
        mav.setViewName("addmovie");
        return mav;
    }

    @PostMapping("/addmoviepg")
    public ModelAndView addMoviePg(){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("addmovie");
        return mav;
    }

    @PostMapping("/movie{param}")
    public  ModelAndView viewMovie(@PathVariable Double id){
        ModelAndView mav = new ModelAndView();

        Movie movie = movieService.findById(id);
        System.out.println(movie.getName());

        mav.setViewName("viewmovie");
        return mav;
    }

    @PostMapping("/searchmovie")
    public  ModelAndView searchMovie(MovieNameDto dto){
        ModelAndView mav = new ModelAndView();

        List<Movie> movies = movieService.searchMovie(dto);
        mav.addObject("movieList",movies);

        mav.setViewName("movies");
        return mav;
    }
}
