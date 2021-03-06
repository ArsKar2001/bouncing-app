package karmanchik.bounching.clientapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Data
@Entity
@Table(name = "PRODUCTCOSTHISTORY")
@EqualsAndHashCode(callSuper = true)
public class ProductCostHistory extends AbstractEntity {
    private LocalDate changeDate;
    private BigDecimal costValue;

    @ManyToOne
    @JoinColumn(name = "PRODUCTID")
    private Product product;
}
