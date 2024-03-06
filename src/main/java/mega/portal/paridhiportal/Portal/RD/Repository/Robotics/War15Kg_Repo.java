package mega.portal.paridhiportal.Portal.RD.Repository.Robotics;

import mega.portal.paridhiportal.Portal.RD.Model.Robotics.War15Kg_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface War15Kg_Repo extends JpaRepository<War15Kg_Model, Long> {
}
