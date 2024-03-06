package mega.portal.paridhiportal.Portal.RD.Model.Civil;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.annotation.Async;

@Entity
@Setter
@Getter
@Table(name = "Setu_bandhan")
@NoArgsConstructor
@Async
public class SetuBandhanModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}