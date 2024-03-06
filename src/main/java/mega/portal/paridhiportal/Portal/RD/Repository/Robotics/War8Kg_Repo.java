package mega.portal.paridhiportal.Portal.RD.Repository.Robotics;

import mega.portal.paridhiportal.Portal.RD.Model.Robotics.War8Kg_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface War8Kg_Repo extends JpaRepository<War8Kg_Model, Long> {
}
