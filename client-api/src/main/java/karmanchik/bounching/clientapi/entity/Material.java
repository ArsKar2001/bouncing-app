package karmanchik.bounching.clientapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "MATERIAL")
@EqualsAndHashCode(callSuper = true)
public class Material extends AbstractEntity {
    private String title;
    private Integer countInPack;
    private String unit;
    private Double countInStock;
    private Double minCount;
    private String description;
    private BigDecimal cost;
    private String image;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "material")
    private List<MaterialCountHistory> materialCountHistories;

    @ManyToOne
    @JoinColumn(name = "MATERIALTYPEID")
    private MaterialType materialType;

    public Material() {

    }
}
