package se.dimage.todoSchemeBackend.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import se.dimage.todoSchemeBackend.Dto.EntryDto;
import se.dimage.todoSchemeBackend.Model.Entry;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EntryMapper {
    @Mapping(source = "entry.text", target = "text")
    @Mapping(source = "entry.timestamp", target = "timestamp")
    EntryDto toDto(Entry entry);

    @Mapping(source = "entryDto.text", target = "text")
    @Mapping(source = "entryDto.timestamp", target = "timestamp")
    Entry toEntity(EntryDto entryDto);
}
