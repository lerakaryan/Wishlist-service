package Practice.Repository;

import Practice.Model.Wish;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishReporitory extends PagingAndSortingRepository<Wish, Long> {

}
