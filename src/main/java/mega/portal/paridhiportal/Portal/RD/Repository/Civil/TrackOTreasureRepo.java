package mega.portal.paridhiportal.Portal.RD.Repository.Civil;

import mega.portal.paridhiportal.Portal.RD.Model.Civil.TrackOTreasureModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackOTreasureRepo extends JpaRepository<TrackOTreasureModel, Long> {
}
