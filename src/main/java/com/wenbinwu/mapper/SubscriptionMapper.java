package com.wenbinwu.mapper;

import com.wenbinwu.domain.Subscription;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SubscriptionMapper {

  @Select("select * from subscription_${site} where channel = #{channel}")
  Subscription findByChannel(@Param("site") String site, @Param("channel") String channel);

  @Select("select * from subscription_${site} where identifier = #{identifier}")
  Subscription findByIdentifier(@Param("site") String site, @Param("identifier") String identifier);
}
