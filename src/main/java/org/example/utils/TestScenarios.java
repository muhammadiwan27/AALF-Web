package org.example.utils;
public enum TestScenarios {
    T1("Login Valid Functionality Test"),
    T2("Login Invalid Functionality Test"),
    T3("Dashboard Valid Functionality Test"),
    T4("Search Task & Team Activity Graphs By Date"),
    T5("Search HO Team Graphs By Date"),
    T6("Enter HO Page"),
    T7("User Search Valid Data Based ID HO"),
    T8("Enter HO Working Plan Page"),
    T9("Add Task"),
    T10("Add Activity"),
    T11("Edit Task"),
    T12("View Task"),
    T13("Complete The Task"),
    T14("JP Approval Task"),
    T15("Revision Task"),
    T16("Partner Approval Task"),
    T17("JP Approval Activity"),
    T18("Revision Activity"),
    T19("Partner Approval Activity"),
    T20("Create Document RKPD"),
    T21("Create Document Surat Tugas"),
    T22("Create Document LKPD"),
    T23("Create Document Bon Putih"),
    T24("Create Document Bon Hijau"),
    T25("Create Document Bon Kuning"),
    T26("Create Document Bon Merah"),
    T27("View Document RKPD"),
    T28("View Document Surat Tugas"),
    T29("View Document Bon Hijau"),
    T30("View Document Surat LKPD"),
    T31("View Document Surat Bon Putih"),
    T32("View Document Bon Kuning"),
    T33("View Business Trip Recap"),
    T34("Edit Document RKPD");



    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
