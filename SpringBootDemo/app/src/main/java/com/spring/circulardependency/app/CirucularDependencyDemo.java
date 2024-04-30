/**
 * Reference: https://www.baeldung.com/circular-dependencies-in-spring
 *
 * A circular dependency occurs when a bean A depends on another bean B, and the bean B depends on bean A as well:
 * Bean A → Bean B → Bean A
 * Of course, we could have more beans implied:  Bean A → Bean B → Bean C → Bean D → Bean E → Bean A
 *
 *
 */


package com.spring.circulardependency.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CirucularDependencyDemo {

	public static void main(String[] args) {
		SpringApplication.run(CirucularDependencyDemo.class, args);
	}

}
