package ru.fitnes.mapper.restMapper;

import ru.fitnes.model.entity.FintesClient;
import org.mapstruct.Mapper;
import ru.karpeikin.fitnes.rest.api.dto.ClientInfo;

@Mapper
public interface ClientRestMapper {

    ClientInfo getClientInfoDtoFromClient(FintesClient src);
}
