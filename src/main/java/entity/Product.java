package entity;

import com.sun.jdi.PrimitiveValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Product {
    @Id
    private int id;
    private String productname;
    private int qty;
    private int price;


}
