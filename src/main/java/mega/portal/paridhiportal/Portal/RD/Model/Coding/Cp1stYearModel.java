package mega.portal.paridhiportal.Portal.RD.Model.Coding;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

@Entity
@Setter
@Getter
@Table(name = "Cp_1st_year")
@NoArgsConstructor
@Async
public class Cp1stYearModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}
