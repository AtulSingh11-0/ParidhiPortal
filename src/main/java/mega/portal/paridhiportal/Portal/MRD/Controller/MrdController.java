package mega.portal.paridhiportal.Portal.MRD.Controller;

import mega.portal.paridhiportal.Portal.MRD.Model.MrdModel;
import mega.portal.paridhiportal.Portal.MRD.Service.MrdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@EnableAsync
@RequestMapping("/paridhi")
public class MrdController {

  @Autowired
  private MrdService mrdService;

  @Autowired
  private AsyncTaskExecutor asyncTaskExecutor;

  /*
  * Post Request
  * */
  @PostMapping("/register")
  @Async
  public CompletableFuture<ResponseEntity<?>> registerMember (
      @RequestBody MrdModel mrdModel
  ) {
    return mrdService
        .registerMember(mrdModel)
        .thenApply(
            savedMember -> {
              if((savedMember != null) && (savedMember.getGid() != null)) {
                return ResponseEntity.ok().body(savedMember.getGid());
              } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
              }
            }
        ).exceptionally(
            ex -> ResponseEntity
                .status(
                    HttpStatus
                        .INTERNAL_SERVER_ERROR
                )
                .body(null)
        );
  }

  /*
  * Get Request
  * */
  @GetMapping("/registration")
  @Async
  public CompletableFuture<ResponseEntity<MrdModel>> registrationForm() {
    // Here you can perform any necessary processing to prepare your data
    CompletableFuture<MrdModel> future = CompletableFuture
        .supplyAsync(
            MrdModel::new,
            asyncTaskExecutor
        );

    return future.thenApply(
        result -> ResponseEntity
            .ok()
            .body(result)
        ).exceptionally(
            ex -> ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(null)
    );
  }
}
