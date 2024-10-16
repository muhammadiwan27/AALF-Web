package org.example.utils;
public enum TestScenarios {

    T1("Login Valid Functionality Test"),
    T2("Login Invalid Functionality Test (Input invalid username & Input invalid password)"),
    T3("Login Invalid Functionality Test (Input valid username & Input invalid password)"),
    T4("Dashboard Valid Functionality Test"),
    T5("Check Total HO Overall Dashboard Aplikasi Sipanda-Unik"),
    T6("Check HO On Progress Dashboard Aplikasi Sipanda-Unik"),
    T7("Check HO Completed Dashboard Aplikasi Sipanda-Unik"),
    T8("Check Total Task Dashboard Aplikasi Sipanda-Unik"),
    T9("Check Task Has Not Proceed Dashboard Aplikasi Sipanda-Unik"),
    T10("Check Task Need Approval JP Dashboard Aplikasi Sipanda-Unik"),
    T11("Check Task Need Approval Partner Dashboard Aplikasi Sipanda-Unik"),
    T12("Check Task Finished Dashboard Aplikasi Sipanda-Unik"),
    T13("Check Total Activity Dashboard Aplikasi Sipanda-Unik"),
    T14("Check Activity Need Revision Dashboard Aplikasi Sipanda-Unik"),
    T15("Check Activity Need Approval JP Dashboard Aplikasi Sipanda-Unik"),
    T16("Check Activity Need Approval Partner Dashboard Aplikasi Sipanda-Unik"),
    T17("Check Activity Finished Dashboard Aplikasi Sipanda-Unik"),
    T18("Proceed overdue deadline task Dashboard Aplikasi Sipanda-Unik"),
    T19("Proceed upcoming deadline task Dashboard Aplikasi Sipanda-Unik"),
    T20("Add event dashboard"),
    T21("Edit event dashboard"),
    T22("Enter HO Page"),
    T23("User Search Valid Data Based ID HO"),
    T24("Enter HO Working Plan Page"),
    T25("Add Task"),
    T26("Add Activity"),
    T27("Edit Task"),
    T28("View Task"),
    T29("Complete The Task"),
    T30("JP Approval Task"),
    T31("Revision Task"),
    T32("Partner Approval Task"),
    T33("JP Approval Activity"),
    T34("Revision Activity"),
    T35("Partner Approval Activity"),
    T36("Create Document RKPD"),
    T37("JP Approval Document RKPD"),
    T38("Partner Approval Document RKPD"),
    T39("Create Document Surat Tugas"),
    T40("Partner Approval Document Surat Tugas"),
    T41("Create Document LKPD"),
    T42("JP Approval Document LKPD"),
    T43("Partner Approval Document LKPD"),
    T44("Create Document Bon Putih"),
    T45("JP Approval Document Bon Putih"),
    T46("Partner Approval Document Bon Putih"),
    T47("Create Document Bon Hijau"),
    T48("JP Approval Document Bon Hijau"),
    T49("Partner Approval Document Bon Hijau"),
    T50("Create Document Bon Kuning"),
    T51("JP Approval Document Bon Kuning"),
    T52("Partner Approval Document Bon Kuning"),
    T53("Create Document Bon Merah"),
    T54("View Document RKPD"),
    T55("View Document Surat Tugas"),
    T56("View Document Bon Hijau"),
    T57("View Document Surat LKPD"),
    T58("View Document Surat Bon Putih"),
    T59("View Document Bon Kuning"),
    T60("View Business Trip Recap"),
    T61("View Business Trip Expenses Recap"),
    T62("Edit Document Bon Kuning"),
    T63("Delete Document Bon Kuning"),
    T64("Edit Document Bon Putih"),
    T65("Delete Document Bon Putih"),
    T66("Edit Document Bon Hijau"),
    T67("Delete Document Bon Hijau"),
    T68("Edit Document LKPD"),
    T69("Delete Document LKPD"),
    T70("Edit Document Surat Tugas"),
    T71("Delete Document Surat Tugas"),
    T72("Edit Document RKPD"),
    T73("Delete Document RKPD"),
    T74("Upload Document HO Working Plan"),
    T75("Delete Upload Document HO Working Plan"),
    T76("Create Notulen HO Working Plan"),
    T77("Create HO Reimbursement HO Working Plan"),
    T78("Edit HO Reimbursement HO Working Plan"),
    T79("View HO Reimbursement HO Working Plan"),
    T80("JP Approval HO Reimbursement HO Working Plan"),
    T81("Delete HO Reimbursement HO Working Plan"),
    T82("View HO Activities HO Working Plan"),
    T83("Enter Calendar Page"),
    T84("Enter Finance Page"),
    T85("Enter HO Report Finance Page"),
    T86("Enter Task & Activity Report Finance Page"),
    T87("Enter Task & Activity Summary Report Finance Page"),
    T88("Enter Client Report Finance Page"),
    T89("Enter Administrative Report Finance Page"),
    T90("Enter Administrative Summary Report Finance Page"),
    T91("Enter Administrative Approval Report Finance Page"),
    T92("Enter HO Reimbursement Finance Page"),
    T93("Enter Client Page"),
    T94("Add Client"),
    T95("Edit Client"),
    T96("Delete Client"),
    T97("Enter HO Completed Page"),
    T98("View HO Completed Page"),
    T99("Enter Finance Document Page"),
    T100("Create Finance Document Number"),
    T101("Edit Finance Document Number"),
    T102("Delete Finance Document Number"),
    T103("Enter Finance List Document Page"),
    T104("Create Finance List Document"),
    T105("Upload document Finance List Document"),
    T106("Edit Finance List Document"),
    T107("Delete Finance List Document"),
    T108("Enter Finance Payroll Page"),
    T109("Create Finance Payroll Periode"),
    T110("Enter Finance Detail Periode Payroll"),
    T111("Edit Finance Payroll Employee");



    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
