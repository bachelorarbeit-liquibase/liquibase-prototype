package myerpapp.inventory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "WAREHOUSE")
public class WarehouseEntity {

  @Id
  @Column(nullable = false)
  private Integer id;

  @Column(nullable = false)
  private String location;

  @Column(nullable = false)
  private Integer capacity;

}
