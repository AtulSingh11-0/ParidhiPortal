package mega.portal.paridhiportal.Portal.RD.Model.Civil;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

@Entity
@Setter
@Getter
@Table(name = "Track_o_treasure")
@NoArgsConstructor
@Async
public class TrackOTreasureModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}
