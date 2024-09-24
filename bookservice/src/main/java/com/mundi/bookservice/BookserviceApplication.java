package com.mundi.bookservice;

import com.mundi.bookservice.entities.Book;
import com.mundi.bookservice.repositories.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookserviceApplication.class, args);
	}
@Bean
	CommandLineRunner commandLineRunner(BookRepo bookRepo){
		return args -> {
			Book book1 = Book.builder()
					.titre("Java OOP")
					.prix(199.99)
					.build();
			bookRepo.save(book1);

			String name = " Book";
			List<Book> bookList= new ArrayList<>();
			Book book = new Book();
			int counter;
			for ( counter = 0; counter<9; counter++){
				book = Book.builder()
						.titre(name +" " + counter)
						.prix(500*counter)
						.build();
				bookList.add(book);
				System.out.println(counter+ " : "+ book.getTitre()+ " \nprix : "+book.getPrix());
				bookRepo.save(book);
			}



		};
}
}


