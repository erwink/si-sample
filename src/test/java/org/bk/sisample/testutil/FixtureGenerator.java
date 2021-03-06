package org.bk.sisample.testutil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bk.sisample.types.Context;
import org.bk.sisample.types.ReportRequest;
import org.bk.sisample.types.ReportRequestPart;
import org.bk.sisample.types.Section;

public class FixtureGenerator {
    public static ReportRequest generateReportRequest(){
        List<ReportRequestPart> requestParts = new ArrayList<ReportRequestPart>();
        Map<String, String> attributes = new HashMap<String, String>();
        attributes.put("user","user");
        Context context = new Context(attributes );
    
        ReportRequestPart part1 = new ReportRequestPart(Section.HEADER, context);
        ReportRequestPart part2 = new ReportRequestPart(Section.SECTION1, context);
        ReportRequestPart part3 = new ReportRequestPart(Section.SECTION2, context);
        ReportRequestPart part4 = new ReportRequestPart(Section.SECTION3, context);
        ReportRequestPart part5 = new ReportRequestPart(Section.FOOTER, context);   
        
        requestParts.add(part1);        
        requestParts.add(part2);
        requestParts.add(part3);
        requestParts.add(part4);
        requestParts.add(part5);
        
        ReportRequest reportRequest  = new ReportRequest(requestParts );
        return reportRequest;
    }

}
