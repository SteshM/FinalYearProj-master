package com.example.FinalYearProj.controller;

import com.example.FinalYearProj.dto.*;
import com.example.FinalYearProj.services.ResourceServices;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequestMapping("/v1/resource")
public class ResourceController {
    @Autowired
    ResourceServices resourceServices;

    @GetMapping("/get-Level/{levelId}")
    public ResponseDTO getLevelById(@PathVariable long levelId){
        return resourceServices.getLevelById(levelId);
    }
  @GetMapping("/get-levels")
  public ResponseDTO getLevels(){
        return resourceServices.getLevels();
  }

    @GetMapping("/get-Grade/{gradeId}")
    public ResponseDTO getGradeById(@PathVariable long gradeId){
        return resourceServices.getGradeById(gradeId);
    }
    @GetMapping("/grades")
    public ResponseDTO getGrades(){
        return resourceServices.getGrades();
    }
//    @GetMapping("/get-grade/{levelName}")
//    public ResponseDTO getGradeByLevelName(@PathVariable String levelName){
//        return resourceServices.getGradesByLevelName(levelName);
//    }

    @PutMapping("/grade/{id}")
    public ResponseDTO updateGrade(@PathVariable long id , @RequestBody GradeDTO gradeDTO){
        return resourceServices.updateGrade(id , gradeDTO);
    }


@GetMapping("/subjects")
    public ResponseDTO getSubjects(){
        return resourceServices.getSubjects();
}
@GetMapping("/get-Subject/{subjectId}")
    public ResponseDTO getSubjectById(@PathVariable long subjectId){
        return resourceServices.getSubjectById(subjectId);
}
@PostMapping("/create-lesson")
    public ResponseDTO createLesson(@RequestBody LessonDTO lessonDTO){
        return resourceServices.createLesson(lessonDTO);
}
@GetMapping("/lessons")
    public ResponseDTO getLessons(){
        return resourceServices.getLessons();
}
@GetMapping("/get-Lesson/{lessonId}")
    public ResponseDTO getLessonsById(@PathVariable long lessonId){
        return resourceServices.getLessonById(lessonId);
}
@PostMapping("/create-Topic")
    public ResponseDTO createTopic(@RequestBody TopicDTO topicDTO){
        return resourceServices.createTopic(topicDTO);
}
@GetMapping("/topics")
    public ResponseDTO getTopics(){
        return resourceServices.getTopics();
}
@GetMapping("/get-Topic/{topicId}")
public ResponseDTO getTopicById(@PathVariable long topicId){
        return resourceServices.getTopicById(topicId);
}

@PostMapping("/create-Content")
    public ResponseDTO createContent(@RequestBody ContentDTO contentDTO){
        return resourceServices.createContent(contentDTO);
}
@GetMapping("/content")
    public ResponseDTO getContent(){
        return resourceServices.getContent();
}
@GetMapping("/get-Content/{contentId}")
    public ResponseDTO getContentById(@PathVariable long contentId){
        return resourceServices.getContentById(contentId);

}
@PutMapping("/content/{id}")
public  ResponseDTO updateContent(@PathVariable long id , @RequestBody ContentDTO contentDTO){
        return resourceServices.updateContent(id , contentDTO);
}
@GetMapping("/content-Types")
    public ResponseDTO getContentTypes(){
        return resourceServices.getContentTypes();
}

@PostMapping("/assignment")
    public ResponseDTO uploadAssignment(@RequestParam("file")MultipartFile file){
   return resourceServices.uploadAssignment(file);
}

}

