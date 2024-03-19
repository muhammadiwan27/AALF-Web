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
    T26("JP Approval Document LKPD"),
    T27("Partner Approval Document LKPD"),
    T28("Create Document Bon Putih"),
    T29("JP Approval Document Bon Putih"),
    T30("Partner Approval Document Bon Putih"),
    T31("Create Document Bon Hijau"),
    T32("Create Document Bon Kuning"),
    T33("Create Document Bon Merah"),
    T34("View Document RKPD"),
    T35("View Document Surat Tugas"),
    T36("View Document Bon Hijau"),
    T37("View Document Surat LKPD"),
    T38("View Document Surat Bon Putih"),
    T39("View Document Bon Kuning"),
    T40("View Business Trip Recap"),
    T41("View Business Trip Expenses Recap"),
    T42("Edit Document Bon Kuning"),
    T43("Delete Document Bon Kuning"),
    T44("Edit Document Bon Putih"),
    T45("Delete Document Bon Putih"),
    T46("Edit Document Bon Hijau"),
    T47("Delete Document Bon Hijau"),
    T48("Edit Document LKPD"),
    T49("Delete Document LKPD"),
    T50("Edit Document Surat Tugas"),
    T51("Delete Document Surat Tugas");



    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
