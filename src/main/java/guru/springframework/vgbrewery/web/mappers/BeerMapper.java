package guru.springframework.vgbrewery.web.mappers;

import guru.springframework.vgbrewery.web.model.BeerDto;
import guru.springframework.vgbrewery.domain.Beer;
import org.mapstruct.Mapper;

@Mapper( uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
