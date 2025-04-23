package example.com.msestudiante.Servicio;

import example.com.msestudiante.entidad.Apoderado;

import java.util.List;
import java.util.Optional;

public interface ApoderadoServicio {
    List<Apoderado> Listar();
    Optional<Apoderado> Buscar(Long id);
    Apoderado Guardar(Apoderado apoderado);
    Apoderado Modificar(Long id, Apoderado apoderado);
    void Eliminar(Long id);
}

