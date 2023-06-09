package com.mostafawahied.takenotewebapp.service;

import com.mostafawahied.takenotewebapp.model.Meeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.sql.Date;
import java.util.List;

public interface MeetingService {
    List<Meeting> getAllMeetings();

    void saveMeeting(Meeting meeting);

    Meeting getMeetingById(long id);
    void saveReading1on1Meeting(Meeting meeting, String id, Character readingLevel, String strength, String teachingPoint, String nextStep, Model model);
    void saveWriting1on1Meeting(Meeting meeting, String id, String strength, String teachingPoint, String nextStep, Model model);
    void saveMultipleGuidedReadingMeetings(String[] ids, Date date, Character readingLevel, String teachingPoint, Model model);
    void saveMultipleStrategyReadingMeetings(String[] ids, Date date, Character readingLevel, String teachingPoint, Model model);
    void saveMultipleStrategyWritingMeetings(String[] ids, Date date, String teachingPoint, Model model);
    void saveFollowUpMeetings(String[] ids, List<String> strengthList, List<String> nextStepsList);
    }
