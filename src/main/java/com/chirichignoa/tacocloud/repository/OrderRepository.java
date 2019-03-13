package com.chirichignoa.tacocloud.repository;

import com.chirichignoa.tacocloud.model.Order;

public interface OrderRepository {

    Order save(Order order);
}
