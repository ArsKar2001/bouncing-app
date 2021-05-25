package karmanchik.bounching.clientapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "PRODUCTTYPE")
@EqualsAndHashCode(callSuper = true)
public class ProductType extends AbstractEntity {
    private String title;
    private Double defectedPercent;

    @OneToMany(mappedBy = "productType")
    private List<Product> products;
}
