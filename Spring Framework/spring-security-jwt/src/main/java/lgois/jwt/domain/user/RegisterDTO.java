package lgois.jwt.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
