package mega.portal.paridhiportal.Portal.RD.Model.Coding;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Cp_all_year")
@NoArgsConstructor
public class CpAllYearModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
}
