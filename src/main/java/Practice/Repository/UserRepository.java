package Practice.Repository;

import Practice.Model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
