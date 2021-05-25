package karmanchik.bounching.clientapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "PRODUCTSALE")
@EqualsAndHashCode(callSuper = true)
public class ProductSale extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "AGENTID")
    private Agent agent;
    @ManyToOne
    @JoinColumn(name = "PRODUCTID")
    private Product product;
    private LocalDate saleDate;
    private Integer productCount;

    public ProductSale() {

    }
}
