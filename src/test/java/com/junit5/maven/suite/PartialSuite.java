package com.junit5.maven.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import com.junit5.maven.ExternalSitesHealthCheckTest;

/**
 * @author sadhup
 * Sample Junit5 Suite class
 * This includes only one class from the repo
 *
 */

@Suite
//@SelectPackages("com.junit5.maven")
@SuiteDisplayName("JUnit5-maven Smoke Suite")
@SelectClasses(ExternalSitesHealthCheckTest.class)
public class PartialSuite {

}
