package mega.portal.paridhiportal.Portal.RD.Model.Gaming;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

@Entity
@Setter
@Getter
@Table(name = "Gaming_2")
@NoArgsConstructor
@Async
public class Gaming2_Model {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}
