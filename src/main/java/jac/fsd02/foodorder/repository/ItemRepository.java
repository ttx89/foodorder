package jac.fsd02.foodorder.repository;

import jac.fsd02.foodorder.dto.CategoryEO;
import jac.fsd02.foodorder.dto.ItemEO;
import jac.fsd02.foodorder.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemEO, Long> {

    List<ItemEO> findByCategoryId(Long categoryId);

}
