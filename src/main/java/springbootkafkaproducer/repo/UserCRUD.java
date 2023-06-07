package springbootkafkaproducer.repo;

import org.springframework.data.repository.CrudRepository;

import springbootkafkaproducer.bean.User;

public interface UserCRUD extends CrudRepository<User,Integer> {

}
