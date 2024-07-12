package Practice.Repository;

import Practice.Model.Board;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends PagingAndSortingRepository <Board, Long> {
}
