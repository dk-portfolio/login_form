package firstproject.sample.repository;
import firstproject.sample.entity.Formdata;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface FormRepo extends JpaRepository<Formdata,Integer> {
}
