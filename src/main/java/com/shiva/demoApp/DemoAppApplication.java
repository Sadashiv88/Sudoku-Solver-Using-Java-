package com.shiva.demoApp;

import com.shiva.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.shiva.entites.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@EnableJpaRepositories(basePackages = "com.shiva.dao")
@EntityScan(basePackages = "com.shiva.entites")


@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoAppApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);

//		User user=new User();
//		user.setName("Sadashiv Kane");
//		user.setCity("Ch.Sambhajinagar");
//		user.setStatus("I am Ethan Hunt");
//
//		User use=new User();
//		use.setName("baby hunt");
//		use.setStatus("Python developer");
//		use.setCity("New York");
//
//		User user1=userRepository.save(user);
//		System.out.println(user1);
//
//		User user2=userRepository.save(use);
//		System.out.println(user2);

//		Optional<User> optional =userRepository.findById(1);
//		User usa=optional.get();
//		usa.setName("Sadashiv Kanse");
//		System.out.println(usa);
//
//		Iterable<User> itr=userRepository.findAll();
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//			}
//		});

//	    userRepository.deleteById(1);
//
//		Iterable<User> itr=userRepository.findAll();
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//			}
//		});

//		List<User> user=userRepository.findByNameAndCity("baby hunt","New York");
//		System.out.println(user);
//		List<User> alluser=userRepository.getAllUser();
//		alluser.forEach(e->{
//			System.out.println(e);
//		});

//		List<User> alluser1=userRepository.getUserByName("baby hunt");
//		alluser1.forEach(e->{
//			System.out.println(e);
//		});
//
//		List<User> alluser=userRepository.getUsers();
//		alluser.forEach(e->{
//			System.out.println(e);
//		});
		List<User> list=userRepository.findByCity("New York");
		list.forEach(e-> System.out.println(e));

	}

}
