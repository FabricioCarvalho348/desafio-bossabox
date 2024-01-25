package fabriciocarvalho348.com.github.desafiobossabox.repository;

import fabriciocarvalho348.com.github.desafiobossabox.model.entity.Tools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ToolsRepository extends JpaRepository<Tools, Long> {


    @Query(value = "select * from tools where tags like %:tag%", nativeQuery = true)
    List<Tools> buscar(@Param("tag")String tag);



}