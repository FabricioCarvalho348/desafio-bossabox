package fabriciocarvalho348.com.github.desafiobossabox.service;

import fabriciocarvalho348.com.github.desafiobossabox.model.dto.ToolsResponse;
import fabriciocarvalho348.com.github.desafiobossabox.model.entity.Tools;
import fabriciocarvalho348.com.github.desafiobossabox.repository.ToolsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolsService {

    @Autowired
    private ToolsRepository toolsRepository;


    public List<Tools> getAllTools(){
        List<Tools> toolsList = toolsRepository.findAll();
        return toolsList;
    }

    public List<Tools> findTollByTag(String tags){
        List<Tools> toolsList = toolsRepository.buscar(tags);
        return toolsList;
    }

    public ToolsResponse saveTools(Tools tools){


        Tools toolsSaved = toolsRepository.save(tools);

        ToolsResponse toolsResponse = new ToolsResponse(
                toolsSaved.getId(),
                toolsSaved.getTitle(),
                toolsSaved.getLink(),
                toolsSaved.getDescription(),
                toolsSaved.getTags());

        return toolsResponse;
    }
    public void deleteToolsById(Long id){
        toolsRepository.deleteById(id);
    }
}
