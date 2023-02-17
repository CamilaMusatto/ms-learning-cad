package br.com.cmarchi.client;

import br.com.cmarchi.http.CourseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@FeignClient(url = "http://localhost:8081/api/v1", name = "course")
public interface CourseClient {

    @GetMapping("/courses")
    List<CourseDto> buscaPeloCourseId(@RequestParam("courseId")UUID courseId);
}
