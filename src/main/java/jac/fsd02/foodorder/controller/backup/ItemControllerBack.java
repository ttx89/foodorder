package jac.fsd02.foodorder.controller.backup;

import jac.fsd02.foodorder.model.Category;
import org.springframework.ui.Model;

public interface ItemControllerBack {

    String getItemListByCategoryId(Long categoryId, Model model);
}
