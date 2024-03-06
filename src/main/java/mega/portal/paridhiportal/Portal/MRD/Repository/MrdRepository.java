package mega.portal.paridhiportal.Portal.MRD.Repository;

import mega.portal.paridhiportal.Portal.MRD.Model.MrdModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MrdRepository extends JpaRepository<MrdModel, Long> {
}
