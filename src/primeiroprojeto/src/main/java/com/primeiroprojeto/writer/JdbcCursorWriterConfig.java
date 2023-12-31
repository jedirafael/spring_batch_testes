package com.primeiroprojeto.writer;


import com.primeiroprojeto.dominio.Cliente;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcCursorWriterConfig {
	@Bean
	public ItemWriter<Cliente> jdbcCursorWriter() {
		return clientes -> clientes.forEach(System.out::println);
	}
}
