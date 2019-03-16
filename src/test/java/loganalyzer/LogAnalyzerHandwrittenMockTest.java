package loganalyzer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class LogAnalyzerHandwrittenMockTest {

    @Test
    public void analyze_TooShortFileName_CallsWebService() {
        FakeWebService mockService = new FakeWebService();
        LogAnalyzerHandwrittenMock log = new LogAnalyzerHandwrittenMock(mockService);
        String fileName = "abc.ext";

        log.analyze(fileName);

        assertEquals("Filename too short: abc.ext", mockService.lastError);
    }

    @Test
    public void analyze_ValidFileName_NotCallsWebService() {
        FakeWebService mockService = new FakeWebService();
        LogAnalyzerHandwrittenMock log = new LogAnalyzerHandwrittenMock(mockService);
        String fileName = "abcdefghijk.ext";

        log.analyze(fileName);

        assertEquals(null, mockService.lastError);
    }

}

// vi:et:ts=4:sw=4:cc=80
