package com.smusik.games.lotrback;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class LotrBackApplication {

	private static final Logger logger
			= LoggerFactory.logger(LotrBackApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LotrBackApplication.class, args);
		logger.info("Example log from " + LotrBackApplication.class.getSimpleName());
	}

}
