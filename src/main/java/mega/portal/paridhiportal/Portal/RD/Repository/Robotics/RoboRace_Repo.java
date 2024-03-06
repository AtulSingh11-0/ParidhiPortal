package mega.portal.paridhiportal.Portal.RD.Repository.Robotics;

import mega.portal.paridhiportal.Portal.RD.Model.Robotics.RoboRace_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoboRace_Repo extends JpaRepository<RoboRace_Model, Long> {
}
