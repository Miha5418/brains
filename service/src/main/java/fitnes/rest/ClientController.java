package fitnes.rest;

import fitnes.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.karpeikin.fitnes.rest.api.dto.ClientInfo;
import ru.karpeikin.fitnes.rest.api.dto.ClientInfoPageable;
import ru.karpeikin.fitnes.rest.api.dto.PageParams;
import ru.karpeikin.fitnes.rest.api.support.ClientApi;

import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ClientController implements ClientApi {

    private final ClientService clientService;

    @Override
    public ResponseEntity<ClientInfo> addNewClient(ClientInfo clientInfo) {
        return ClientApi.super.addNewClient(clientInfo);
    }

    @Override
    public ResponseEntity<ClientInfo> getClientInfoById(Long clientId) {
        return ClientApi.super.getClientInfoById(clientId);
    }

    @Override
    public ResponseEntity<ClientInfoPageable> getListClientInfo(Optional<PageParams> pageParams) {
        return ClientApi.super.getListClientInfo(pageParams);
    }
}
