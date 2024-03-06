package mega.portal.paridhiportal.Portal.RD.Repository.Civil;

import mega.portal.paridhiportal.Portal.RD.Model.Civil.MegaArchModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MegaArchRepo extends JpaRepository<MegaArchModel, Long> {
}
