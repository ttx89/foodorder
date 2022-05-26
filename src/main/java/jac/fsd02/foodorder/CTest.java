package jac.fsd02.foodorder;

import com.fasterxml.jackson.databind.ObjectMapper;
import jac.fsd02.foodorder.model.Item;

import java.util.Map;

public class CTest {

    public static void main(String[] args) {
        Item item = new Item();
        item.setId(111L);
        item.setItemName("aaaaaaaaaa");


        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> dataMap = mapper.convertValue(item, Map.class);

        for (Map.Entry<String, Object> entry: dataMap.entrySet()){
            System.out.println("key="+entry.getKey()+", value="+entry.getValue());
            System.out.println("-------------------------");
        }
    }
}
