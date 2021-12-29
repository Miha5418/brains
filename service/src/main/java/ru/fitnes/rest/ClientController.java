package ru.fitnes.rest;

import ru.fitnes.mapper.restMapper.ClientRestMapper;
import ru.fitnes.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpStatus;
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
    private final ClientRestMapper clientRestMapper;

    @Override
    public ResponseEntity<ClientInfo> addNewClient(ClientInfo clientInfo) {

        val result = clientService.createClient(clientInfo);

        return ResponseEntity.status(HttpStatus.OK)
                .body(clientRestMapper.getClientInfoDtoFromClient(result));
    }

    @SneakyThrows
    @Override
    public ResponseEntity<ClientInfo> getClientInfoById(Integer clientId) {

        val result = clientService.getClientById(clientId);

        return ResponseEntity.status(HttpStatus.OK)
                .body(clientRestMapper.getClientInfoDtoFromClient(result));
    }

    @Override
    public ResponseEntity<ClientInfoPageable> getListClientInfo(Optional<PageParams> pageParams) {

        val result = clientService.getClientList(pageParams);

        return ResponseEntity.status(HttpStatus.OK)
                .body(result);
    }
}
