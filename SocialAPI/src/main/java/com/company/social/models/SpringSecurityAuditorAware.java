package com.company.social.models;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class SpringSecurityAuditorAware implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {

		return Optional.ofNullable("Elvar").filter(s -> !s.isEmpty());
	}
}
