package com.xwguan.autofund.service.mapper.stock;

import com.xwguan.autofund.dto.stock.LatestStockDto;
import com.xwguan.autofund.entity.stock.Stock;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:10+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
@Qualifier("delegate")
public class StockMapperImpl_ implements StockMapper {

    @Override
    public LatestStockDto toLatestStockDto(Stock stock) {
        if ( stock == null ) {
            return null;
        }

        LatestStockDto latestStockDto = new LatestStockDto();

        latestStockDto.setId( stock.getId() );
        latestStockDto.setName( stock.getName() );
        latestStockDto.setSymbol( stock.getSymbol() );

        return latestStockDto;
    }

    @Override
    public List<LatestStockDto> toLatestStockDtos(List<Stock> stocks) {
        if ( stocks == null ) {
            return null;
        }

        List<LatestStockDto> list = new ArrayList<LatestStockDto>( stocks.size() );
        for ( Stock stock : stocks ) {
            list.add( toLatestStockDto( stock ) );
        }

        return list;
    }
}
