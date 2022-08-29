package guru.springframework.vgbrewery.domain;

import guru.springframework.vgbrewery.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;

    private Timestamp createdDate;
    private Timestamp lastUpdateDate;
}
