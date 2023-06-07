package springbootkafkaproducer.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springbootkafkaproducer.bean.Order;

@Repository
public interface OrderCRUD extends CrudRepository<Order,Integer> {

}
