package ru.fitnes.mapper;

import ru.fitnes.model.entity.FintesClient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.karpeikin.fitnes.rest.api.dto.ClientInfo;
import ru.karpeikin.fitnes.rest.api.dto.ClientInfoPageable;

import java.time.Instant;
import java.util.List;

@Mapper(imports = {Instant.class})
public interface ClientMapper {


    @Mapping(target = "createDate", expression = "java(Instant.now())")
    @Mapping(target = "telegramId", ignore = true)
    FintesClient getClientDocumentFromClientInfoDto(ClientInfo src);

    List<ClientInfo> getClientInfoDtoFromClient(List<FintesClient> src);

    ClientInfo getClientInfoDtoFromClient(FintesClient src);

    @Mapping(target = "data", source = "src")
    default ClientInfoPageable getClientInfoPageableFromFitnesClienList(List<FintesClient> src){
        ClientInfoPageable result = new ClientInfoPageable();
        result.setData(getClientInfoDtoFromClient(src));

        return result;
    }

}
