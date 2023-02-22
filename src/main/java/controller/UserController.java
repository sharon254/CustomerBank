package controller;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Pageable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/{identification}")
    public ResponseEntity readUser(@PathVariable("identification") String identification) {
        return ResponseEntity.ok(userService.readUser(identification));
    }

    @GetMapping
    public ResponseEntity readUser(Pageable pageable) {
        return ResponseEntity.ok(userService.readUsers((SpringDataWebProperties.Pageable) pageable));
    }
}
