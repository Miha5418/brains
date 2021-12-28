package fitnes.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.karpeikin.fitnes.rest.api.dto.LoginRequestMessage;
import ru.karpeikin.fitnes.rest.api.dto.LoginResponseMessage;
import ru.karpeikin.fitnes.rest.api.support.AuthzApi;

@Slf4j
@RestController
public class AuthController implements AuthzApi {


    @Override
    public ResponseEntity<LoginResponseMessage> login(LoginRequestMessage loginRequestMessage) {
        return AuthzApi.super.login(loginRequestMessage);
    }
}
