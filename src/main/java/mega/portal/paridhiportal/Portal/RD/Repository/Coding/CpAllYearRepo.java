package mega.portal.paridhiportal.Portal.RD.Repository.Coding;

import mega.portal.paridhiportal.Portal.RD.Model.Coding.CpAllYearModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CpAllYearRepo extends JpaRepository<CpAllYearModel, Long> {
}
