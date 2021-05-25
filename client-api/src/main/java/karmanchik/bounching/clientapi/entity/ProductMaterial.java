package karmanchik.bounching.clientapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "PRODUCTMATERIAL")
public class ProductMaterial {
    @EmbeddedId
    private ProductMaterialPK productMaterialPK;
    private Double count;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("materialId")
    private Material material;
    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("productId")
    private Product product;

    public ProductMaterial() {

    }
}
