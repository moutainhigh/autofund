package com.xwguan.autofund.service.mapper.rule;

import com.xwguan.autofund.entity.plan.rule.SuppressCondition;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:10+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class CleanCopySuppressConditionMapperImpl implements CleanCopySuppressConditionMapper {

    @Override
    public SuppressCondition cleanCopy(SuppressCondition source) {
        if ( source == null ) {
            return null;
        }

        SuppressCondition suppressCondition = new SuppressCondition();

        suppressCondition.setLastActivatedDate( source.getLastActivatedDate() );
        suppressCondition.setSuppressBeforeDate( source.getSuppressBeforeDate() );
        suppressCondition.setSuppressTradeDays( source.getSuppressTradeDays() );

        suppressCondition.setRuleId( Long.parseLong( "-1" ) );
        suppressCondition.setId( Long.parseLong( "-1" ) );

        return suppressCondition;
    }
}
