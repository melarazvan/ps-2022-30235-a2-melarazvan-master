package ro.sd.a2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.sd.a2.entity.Actor;
import ro.sd.a2.entity.Movie;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    Actor findFirstByName(String name);

    void deleteActorById(Long id);
}
