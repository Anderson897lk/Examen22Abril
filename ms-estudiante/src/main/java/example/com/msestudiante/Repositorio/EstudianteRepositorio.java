package example.com.msestudiante.Repositorio;

import example.com.msestudiante.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {
}
