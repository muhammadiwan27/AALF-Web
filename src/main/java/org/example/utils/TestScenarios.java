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
    T20("Create Document RKPD");



    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
