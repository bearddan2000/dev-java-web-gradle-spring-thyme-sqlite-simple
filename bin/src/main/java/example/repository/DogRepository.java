package example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.model.Dog;

@Repository("dogRepository")
public interface DogRepository extends JpaRepository<Dog, Integer>{

}
