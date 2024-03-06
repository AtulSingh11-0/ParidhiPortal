package mega.portal.paridhiportal.Portal.RD.Model.Robotics;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

@Entity
@Setter
@Getter
@Table(name = "Lfr")
@NoArgsConstructor
@Async
public class LFR_Model {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
}
