package karmanchik.bounching.clientapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "MATERIALCOUNTHISTORY")
@EqualsAndHashCode(callSuper = true)
public class MaterialCountHistory extends AbstractEntity {
    private LocalDate changeDate;
    private Double countValue;

    @ManyToOne
    @JoinColumn(name = "MATERIALID")
    private Material material;

    public MaterialCountHistory() {

    }
}
