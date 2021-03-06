package com.github.lindenhoney.mapper;

import com.github.lindenhoney.domain.Song;
import com.github.lindenhoney.entity.SongEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {VerseMapper.class})
public interface SongMapper extends GenericMapper<Song, SongEntity> {
}
