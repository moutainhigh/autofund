package com.xwguan.autofund.service.mapper.tactic;

import com.xwguan.autofund.entity.plan.tactic.NavChangeTactic;
import com.xwguan.autofund.service.mapper.rule.CleanCopyPeriodConditionMapper;
import com.xwguan.autofund.service.mapper.rule.CleanCopyRuleMapper;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:11+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class CleanCopyNavChangeTacticMapperImpl implements CleanCopyNavChangeTacticMapper {

    @Autowired
    private CleanCopyRuleMapper cleanCopyRuleMapper;
    @Autowired
    private CleanCopyPeriodConditionMapper cleanCopyPeriodConditionMapper;

    @Override
    public NavChangeTactic cleanCopy(NavChangeTactic source) {
        if ( source == null ) {
            return null;
        }

        NavChangeTactic navChangeTactic = new NavChangeTactic();

        navChangeTactic.setPeriodCondition( cleanCopyPeriodConditionMapper.cleanCopy( source.getPeriodCondition() ) );
        navChangeTactic.setRuleList( cleanCopyRuleMapper.cleanCopyList( source.getRuleList() ) );
        navChangeTactic.setInTradeDays( source.getInTradeDays() );

        navChangeTactic.setPlanId( Long.parseLong( "-1" ) );
        navChangeTactic.setId( Long.parseLong( "-1" ) );
        navChangeTactic.setActivated( Boolean.parseBoolean( "true" ) );

        return navChangeTactic;
    }
}
