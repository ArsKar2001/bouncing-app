package karmanchik.bounching.clientapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "MATERIALSUPPLIER")
public class MaterialSupplier {
    @EmbeddedId
    private MaterialSupplierPK materialSupplierPK;

    @ManyToOne
    @MapsId("materialId")
    @JoinColumn(name = "MATERIALID")
    private Material material;

    @ManyToOne
    @MapsId("supplierId")
    @JoinColumn(name = "SUPPLIERID")
    private Supplier supplier;

    public MaterialSupplier() {

    }
}
