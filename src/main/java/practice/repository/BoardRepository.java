package practice.repository;

import practice.model.Board;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends PagingAndSortingRepository <Board, Long> {
}
