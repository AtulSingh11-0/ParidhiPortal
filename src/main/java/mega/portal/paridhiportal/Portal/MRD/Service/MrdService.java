package mega.portal.paridhiportal.Portal.MRD.Service;

import mega.portal.paridhiportal.Portal.MRD.Model.MrdModel;
import mega.portal.paridhiportal.Portal.MRD.Repository.MrdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class MrdService {

  @Autowired
  private MrdRepository mrdRepository;

  @Async
  public CompletableFuture<MrdModel> registerMember(MrdModel mrdModel) {
    return CompletableFuture.completedFuture(mrdRepository.save(mrdModel));
  }
}
