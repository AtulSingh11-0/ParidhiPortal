package mega.portal.paridhiportal.Portal.RD.Repository.Robotics;

import mega.portal.paridhiportal.Portal.RD.Model.Robotics.RoboSoccer_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoboSoccer_Repo extends JpaRepository<RoboSoccer_Model, Long> {
}
