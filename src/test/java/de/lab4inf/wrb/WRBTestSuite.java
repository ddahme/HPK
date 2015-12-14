package de.lab4inf.wrb;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    SimpleWRBScriptTest.class,
    VariablesWRBScriptTest.class,
    
    
    // Own test classes
    //WRBLexerTest2.class,
    //WRBParserTest2.class,
    AdvancedWRBScriptTest.class,
    FunctionTest.class,
    ScriptTest.class
})
public class WRBTestSuite {}

