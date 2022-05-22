package jac.fsd02.foodorder.repository;

import jac.fsd02.foodorder.entity.CategoryEO;
import jac.fsd02.foodorder.entity.ItemEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemEO, CategoryEO> {

    List<ItemEO> findByCategoryId(CategoryEO categoryEO);

}
