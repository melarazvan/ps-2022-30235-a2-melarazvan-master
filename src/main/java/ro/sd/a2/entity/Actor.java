package ro.sd.a2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    //@ManyToMany(cascade = CascadeType.ALL)
    //@JoinTable(name = "Actor_Movie",
    //joinColumns = @JoinColumn(name = "movie_id"),
    //inverseJoinColumns = @JoinColumn(name = "actor id"))
    ///private List<Movie> movieList;
}
