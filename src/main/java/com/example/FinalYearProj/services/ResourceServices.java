package com.example.FinalYearProj.services;

import com.example.FinalYearProj.Utilities.Utilities;
import com.example.FinalYearProj.dto.*;
import com.example.FinalYearProj.entities.*;
import com.example.FinalYearProj.repos.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ResourceServices {

    private final LevelRepo levelRepo;
    private final GradeRepo gradeRepo;
    private final SubjectRepo subjectRepo;
    private final LessonRepo lessonRepo;
    private final TopicRepo topicRepo;
    private final ContentRepo contentRepo;
    private final ContentTypeRepo contentTypeRepo;
    private final AssignmentsRepo assignmentsRepo;




    public ResponseDTO getLevelById(long levelId) {
        LevelEntity levelEntity = levelRepo.findBylevelId(levelId);
        return Utilities.createSuccessfulResponse("successfully retrieved levels", levelEntity);


    }

    public ResponseDTO getLevels() {
        List<LevelEntity>levelEntityList =levelRepo.findAll();
        return Utilities.createSuccessfulResponse("successfully fetched all levels",levelEntityList);
    }



    public  ResponseDTO getGradeById(long gradeId) {
        GradeEntity gradeEntity = gradeRepo.findById(gradeId).get();
        return Utilities.createSuccessfulResponse("Successfully fetched one grade", gradeEntity);
    }


    public ResponseDTO getGrades() {
        List<GradeEntity> gradeEntityList = gradeRepo.findAll();
        return Utilities.createSuccessfulResponse("Successfully fetched all grades", gradeEntityList);
    }

    public  ResponseDTO updateGrade(long id, GradeDTO gradeDTO) {
        GradeEntity gradeEntity = gradeRepo.findById(id).get();
        gradeEntity.setGradeName(gradeDTO.getGradeName());
        return Utilities.createSuccessfulResponse("Successfully updated grade",gradeDTO);
    }




    public ResponseDTO getSubjects() {
        List<SubjectEntity> subjectEntityList = subjectRepo.findAll();
        log.info("Received a payload to retrieve all subjects");
        return Utilities.createSuccessfulResponse("Successfully fetched all subjects", subjectEntityList);
    }

    public  ResponseDTO getSubjectById(long subjectId) {
        SubjectEntity subjectEntity = subjectRepo.findById(subjectId).get();
        return Utilities.createSuccessfulResponse("Successfully fetched a subject by its Id", subjectEntity);

    }

    public  ResponseDTO createLesson(LessonDTO lessonDTO) {
        LessonEntity lessonEntity = new LessonEntity();
        lessonEntity.setLessonName(lessonDTO.getLessonName());
        lessonEntity.setDuration(lessonDTO.getDuration());
        lessonEntity.setTopicId(lessonDTO.getTopicId());
        LessonEntity createdLesson = lessonRepo.save(lessonEntity);
        return Utilities.createSuccessfulResponse("Successfully created a lesson", createdLesson);
    }

    public  ResponseDTO getLessons() {
        List<LessonEntity> lessonEntityList = lessonRepo.findAll();
        return Utilities.createSuccessfulResponse("Successfully fetched all lessons", lessonEntityList);
    }

    public  ResponseDTO getLessonById(long lessonId) {
        LessonEntity lessonEntity = lessonRepo.findById(lessonId).get();
        return Utilities.createSuccessfulResponse("Successfully fetched a lesson", lessonEntity);
    }

    public  ResponseDTO createTopic(TopicDTO topicDTO) {
        TopicEntity topicEntity = new TopicEntity();
        topicEntity.setTopicName(topicDTO.getTopicName());
        topicEntity.setSubjectId(topicDTO.getSubjectId());
        TopicEntity createdTopic = topicRepo.save(topicEntity);
        return Utilities.createSuccessfulResponse("Successfully created a topic", createdTopic);
    }

    public  ResponseDTO getTopics() {
        List<TopicEntity> topicEntityList = topicRepo.findAll();
        return Utilities.createSuccessfulResponse("Successfully fetched all topics", topicEntityList);
    }

    public  ResponseDTO getTopicById(long topicId) {
        TopicEntity topicEntity = topicRepo.findById(topicId).get();
        return Utilities.createSuccessfulResponse("Successfully fetched topic by Id", topicEntity);
    }


    public  ResponseDTO createContent(ContentDTO contentDTO) {
        ContentEntity contentEntity = new ContentEntity();
        contentEntity.setContentUrl(contentDTO.getContentUrl());
        ContentEntity createdContent = contentRepo.save(contentEntity);
        return Utilities.createSuccessfulResponse("Successfully created content", createdContent);
    }

    public  ResponseDTO getContent() {
        List<ContentEntity> contentEntityList = contentRepo.findAll();
        return Utilities.createSuccessfulResponse("successfully fetched content", contentEntityList);
    }

    public  ResponseDTO getContentById(long contentId) {
        ContentEntity contentEntity = contentRepo.findById(contentId).get();
        return Utilities.createSuccessfulResponse("successfully fetched content by Id", contentEntity);
    }

    public  ResponseDTO createContentType(ContentTypeDTO contentTypeDTO) {
        ContentTypeEntity contentTypeEntity = new ContentTypeEntity();
        contentTypeEntity.setContentTypeId(contentTypeDTO.getContentTypeId());
        contentTypeEntity.setContentTypeName(contentTypeDTO.getContentTypeName());
        contentTypeEntity.setContentTypeId(contentTypeDTO.getContentTypeId());
        ContentTypeEntity createdContentType = contentTypeRepo.save(contentTypeEntity);
        return Utilities.createSuccessfulResponse("Successfully created contentType", createdContentType);
    }

    public  ResponseDTO updateContent(long id, ContentDTO contentDTO) {
        contentRepo.findById(id).get();
        return Utilities.createSuccessfulResponse("Successfully updated content",contentDTO);

    }

    public  ResponseDTO getContentTypes() {
        List<ContentTypeEntity> contentTypeEntityList = contentTypeRepo.findAll();
        return Utilities.createSuccessfulResponse("Successfully retrieved contentTypes", contentTypeEntityList);
    }

    public ResponseDTO uploadAssignment(MultipartFile file) {
        AssignmentsEntity assignmentsEntity =new AssignmentsEntity();
        String fileName = file.getOriginalFilename();
        assignmentsRepo.save(assignmentsEntity);
        return Utilities.createSuccessfulResponse("Successfully uploaded a file",fileName);
    }
}

