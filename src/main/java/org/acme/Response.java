package org.acme;

import java.util.List;
import java.util.Map;

public class Response {
    public String path;
    public String method;
    public String body;
    public Map<String, List<String>> query;
}
