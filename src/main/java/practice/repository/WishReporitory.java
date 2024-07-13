package practice.repository;

import practice.model.Wish;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishReporitory extends PagingAndSortingRepository<Wish, Long> {

}
