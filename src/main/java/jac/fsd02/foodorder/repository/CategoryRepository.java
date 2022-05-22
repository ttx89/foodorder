package jac.fsd02.foodorder.repository;

import jac.fsd02.foodorder.dto.CategoryEO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEO, Long> {
}
