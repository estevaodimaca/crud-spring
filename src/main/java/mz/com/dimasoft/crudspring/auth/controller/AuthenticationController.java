package mz.com.dimasoft.crudspring.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mz.com.dimasoft.crudspring.auth.dto.AuthenticationDTO;
import mz.com.dimasoft.crudspring.auth.dto.LoginResponseDTO;
import mz.com.dimasoft.crudspring.auth.entity.user.User;
import mz.com.dimasoft.crudspring.auth.infra.security.TokenService;
import mz.com.dimasoft.crudspring.auth.repositories.UserRepository;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthenticationController {

	@Autowired
	private TokenService tokenService;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/login")
	public ResponseEntity<LoginResponseDTO> login(@RequestBody AuthenticationDTO data) {

		User user = this.userRepository.findByNuit(data.username());

		if (passwordEncoder.matches(data.password(), user.getPassword())) {
			String token = tokenService.generateToken(user);
			return ResponseEntity.ok(new LoginResponseDTO(token, user.getName()));
		}

		return ResponseEntity.badRequest().build();

	}

}
