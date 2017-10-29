package com.gs.dao;

import com.gs.bean.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/13.
 */
@Repository
public interface OrderDAO {

    List<Order> listByUserId(Integer userId);

    List<Order> listByOrderIds(List<Integer> orderIds);

}
