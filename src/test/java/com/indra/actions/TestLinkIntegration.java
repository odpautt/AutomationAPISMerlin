package com.indra.actions;

import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;

public class TestLinkIntegration {
    //docker

    public static final String TESTLINK_KEY="43fd3605032c0d7f05bf99d3e820a53e";  // "27512226ed15126c18fca57818b72637";// "63a1847ead51525c1d87f5ee0c9fbda8";
    public static final String TESTLINK_URL="http://localhost/lib/api/xmlrpc/v1/xmlrpc.php"; //"http://testlink.tigoune.com/var/www/html/testlink-code-1.9.16/lib/api/xmlrpc.php";
    public static final String TEST_PROJECT_NAME="SanityFull"; //"Proyecto_2_Prueba_Automatico
    public static final String TEST_PLAN_NAME="SampleTestPlan"; //  TestPlan_SeleniumAutomation
    public static final String BUILD_NAME="SampleBuild"; // Build_SeleniumAutomation

//local
/*    public static final String TESTLINK_KEY="a56840c5f168f7c52d50490c38286d83";  // "27512226ed15126c18fca57818b72637";// "63a1847ead51525c1d87f5ee0c9fbda8";
    public static final String TESTLINK_URL="http://localhost/testlink-1.9.0/lib/api/xmlrpc.php";
    public static final String TEST_PROJECT_NAME="Proyecto_2_Prueba_Automatico"; //"
    public static final String TEST_PLAN_NAME="PruebaAutomatizacion"; //  TestPlan_SeleniumAutomation
    public static final String BUILD_NAME="BuildPruebasAutomatizas"; // Build_SeleniumAutomation*/

    public static void updateResults(String testCaseName, String exception,String results) throws TestLinkAPIException {
        TestLinkAPIClient testLink = new TestLinkAPIClient(TESTLINK_KEY,TESTLINK_URL);
        testLink.reportTestCaseResult(TEST_PROJECT_NAME,TEST_PLAN_NAME,testCaseName,BUILD_NAME,exception,results);
        System.out.println( testLink.about());;
    }
}
