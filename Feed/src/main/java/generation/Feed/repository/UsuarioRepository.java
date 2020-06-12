package generation.Feed.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import generation.Feed.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario>findAllByNomeContainingIgnoreCase(String nome);
}
