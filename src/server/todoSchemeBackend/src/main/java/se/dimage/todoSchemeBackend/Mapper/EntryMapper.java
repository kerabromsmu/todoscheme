package se.dimage.todoSchemeBackend.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import se.dimage.todoSchemeBackend.Dto.EntryDto;
import se.dimage.todoSchemeBackend.Model.Entry;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EntryMapper {
    @Mapping(source = "entry.text", target = "text")
    @Mapping(source = "entry.createTimestamp", target = "createTimestamp")
    @Mapping(source = "entry.updateTimestamp", target = "updateTimestamp")
    EntryDto toDto(Entry entry);

    @Mapping(source = "entryDto.text", target = "text")
    @Mapping(source = "entryDto.createTimestamp", target = "createTimestamp")
    @Mapping(source = "entryDto.updateTimestamp", target = "updateTimestamp")
    Entry toEntity(EntryDto entryDto);
}
