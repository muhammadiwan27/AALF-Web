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
    T32("JP Approval Document Bon Hijau"),
    T33("Partner Approval Document Bon Hijau"),
    T34("Create Document Bon Kuning"),
    T35("JP Approval Document Bon Kuning"),
    T36("Partner Approval Document Bon Kuning"),
    T37("Create Document Bon Merah"),
    T38("View Document RKPD"),
    T39("View Document Surat Tugas"),
    T40("View Document Bon Hijau"),
    T41("View Document Surat LKPD"),
    T42("View Document Surat Bon Putih"),
    T43("View Document Bon Kuning"),
    T44("View Business Trip Recap"),
    T45("View Business Trip Expenses Recap"),
    T46("Edit Document Bon Kuning"),
    T47("Delete Document Bon Kuning"),
    T48("Edit Document Bon Putih"),
    T49("Delete Document Bon Putih"),
    T50("Edit Document Bon Hijau"),
    T51("Delete Document Bon Hijau"),
    T52("Edit Document LKPD"),
    T53("Delete Document LKPD"),
    T54("Edit Document Surat Tugas"),
    T55("Delete Document Surat Tugas");



    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
