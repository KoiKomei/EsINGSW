package it.unical.tests;

import org.junit.jupiter.api.runner.RunWith;
import org.junit.jupiter.api.runners.Suite;
import org.junit.jupiter.api.runners.Suite.SuiteClasses;

@RunWith(JunitPlatform.class)

@SelectClasses({Generic.class, Parametric.class, TestCalcultor.class})
class AllTests {



}
