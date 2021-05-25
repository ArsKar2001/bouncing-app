package karmanchik.bounching.clientapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "PRODUCT")
@EqualsAndHashCode(callSuper = true)
public class Product extends AbstractEntity {
    private String title;
    private String articleNumber;
    private String description;
    private String image;
    private Integer productionPersonCount;
    private Integer productionWorkshopNumber;
    private BigDecimal minCostForAgent;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductCostHistory> productCostHistories;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCTTYPEID")
    private ProductType productType;
}
