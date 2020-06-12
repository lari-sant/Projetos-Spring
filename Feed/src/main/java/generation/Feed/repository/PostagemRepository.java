package generation.Feed.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import generation.Feed.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
 
	public List<Postagem> findAllTituloContainingIgnoreCase(String titulo);
}
