package com.wenbinwu.mapper;

import com.wenbinwu.domain.Subscriber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SubscriberMapper {

  @Select("select * from subscriber_${site} where username = #{username}")
  Subscriber findByUsername(@Param("site") String site, @Param("username") String username);
}
