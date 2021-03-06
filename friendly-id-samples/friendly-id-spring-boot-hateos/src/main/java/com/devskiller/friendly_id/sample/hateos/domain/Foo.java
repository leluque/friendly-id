package com.devskiller.friendly_id.sample.hateos.domain;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.hateoas.Identifiable;

@Data
@AllArgsConstructor
public class Foo implements Identifiable<UUID> {

	private UUID id;
	private String name;

	@Override
	public UUID getId() {
		return id;
	}

}
