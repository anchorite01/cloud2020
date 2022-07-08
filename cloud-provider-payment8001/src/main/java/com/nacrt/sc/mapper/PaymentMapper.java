package com.nacrt.sc.mapper;

import com.nacrt.sc.common.entities.Payment;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * PaymentMapper
 */
@Mapper
public interface PaymentMapper {
    @Insert("update payment set serial = #{serial} where id = #{id}")
    int update(Payment payment);

    @Insert("insert into payment(id, serial) values(#{id}, #{serial})")
    int insert(Payment payment);

    @Delete("delete from payment where id = #{id}")
    int delete(Long id);

    @Select("select * from payment where id = #{id}")
    Payment selectById(@Param("id") Long id);

    @Select("select * from payment")
    List<Payment> selectAll();

}
