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
    T21("JP Approval Document RKPD"),
    T22("Partner Approval Document RKPD"),
    T23("Create Document Surat Tugas"),
    T24("Partner Approval Document Surat Tugas"),
    T25("Create Document LKPD"),
    T26("Create Document Bon Putih"),
    T27("Create Document Bon Hijau"),
    T28("Create Document Bon Kuning"),
    T29("Create Document Bon Merah"),
    T30("View Document RKPD"),
    T31("View Document Surat Tugas"),
    T32("View Document Bon Hijau"),
    T33("View Document Surat LKPD"),
    T34("View Document Surat Bon Putih"),
    T35("View Document Bon Kuning"),
    T36("View Business Trip Recap"),
    T37("View Business Trip Expenses Recap"),
    T38("Edit Document Bon Kuning"),
    T39("Delete Document Bon Kuning"),
    T40("Edit Document Bon Putih"),
    T41("Delete Document Bon Putih"),
    T42("Edit Document Bon Hijau"),
    T43("Delete Document Bon Hijau"),
    T44("Edit Document LKPD"),
    T45("Delete Document LKPD"),
    T46("Edit Document Surat Tugas"),
    T47("Delete Document Surat Tugas");



    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
