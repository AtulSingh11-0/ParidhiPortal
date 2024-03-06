package mega.portal.paridhiportal.Portal.RD.Repository.Robotics;

import mega.portal.paridhiportal.Portal.RD.Model.Robotics.LFR_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LFR_Repo extends JpaRepository<LFR_Model, Long> {
}
