package mega.portal.paridhiportal.Portal.RD.Model.Electrical;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

@Entity
@Setter
@Getter
@Table(name = "Electrical_2")
@NoArgsConstructor
@Async
public class Electrical2_Model {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}
