package loganalyzer;


public class LogAnalyzerHandwrittenMock {

    private WebService service;

    public LogAnalyzerHandwrittenMock(WebService service) {
        this.service = service;
    }

    public void analyze(String fileName) {
        if (fileName.length() < 8) {
            service.logError("Filename too short: " + fileName);
        }
    }

}

// vi:et:ts=4:sw=4:cc=80
