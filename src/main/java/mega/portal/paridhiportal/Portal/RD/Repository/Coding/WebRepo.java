package mega.portal.paridhiportal.Portal.RD.Repository.Coding;

import mega.portal.paridhiportal.Portal.RD.Model.Coding.WebModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebRepo extends JpaRepository<WebModel, Long> {
}
