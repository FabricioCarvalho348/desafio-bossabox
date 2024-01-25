package fabriciocarvalho348.com.github.desafiobossabox.model.dto;

import java.util.List;

public record ToolsResponse(Long id, String title, String link, String description, List<String> tags) {
}
