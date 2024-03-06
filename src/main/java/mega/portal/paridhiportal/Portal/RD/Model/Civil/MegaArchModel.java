package mega.portal.paridhiportal.Portal.RD.Model.Civil;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

@Entity
@Setter
@Getter
@Table(name = "Mega_arch")
@NoArgsConstructor
@Async
public class MegaArchModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}
