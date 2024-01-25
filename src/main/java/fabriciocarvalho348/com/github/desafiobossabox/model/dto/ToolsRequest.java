package fabriciocarvalho348.com.github.desafiobossabox.model.dto;

import fabriciocarvalho348.com.github.desafiobossabox.model.entity.Tools;

import java.util.List;

public record ToolsRequest(String title, String link, String description, List<String> tags) {
    public Tools toModel() {
        return new Tools(title, link, description, tags);
    }
}