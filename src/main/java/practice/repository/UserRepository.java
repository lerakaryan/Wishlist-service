package practice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import practice.model.User;
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
