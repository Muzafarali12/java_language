package com.Student.TranscriptSemester;

public class Test {

    public static void main(String [] args){
        SemesterTranscript semesterTranscript = new TranscriptSemester1();
        semesterTranscript.setSemester("1st Semester. ");
        semesterTranscript.Gpa();
        semesterTranscript = new TranscriptSemester2();
        semesterTranscript.setSemester("2nd Semester. ");
        semesterTranscript.Gpa();
        semesterTranscript = new TranscriptSemester3();
        semesterTranscript.setSemester("3rd Semester. ");
        semesterTranscript.Gpa();
        semesterTranscript = new TranscriptSemester4();
        semesterTranscript.setSemester("4Th Semster. ");
        semesterTranscript.Gpa();
    }

}
