package mega.portal.paridhiportal.Portal.RD.Model.Gaming;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

@Entity
@Setter
@Getter
@Table(name = "Gaming_3")
@NoArgsConstructor
@Async
public class Gaming3_Model {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}
