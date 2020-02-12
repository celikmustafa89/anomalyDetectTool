package com.anomalydetect;

import com.anomalydetect.LOF.LOFDetectTool;
import com.anomalydetect.Tool.DisplayTool;
import com.anomalydetect.Tool.FileTool;

import java.io.FileNotFoundException;

public class AnomalyDetectionLOF {
    public static void main(String[] args) throws FileNotFoundException {
        double[] testData = FileTool.getData("data.json");
        LOFDetectTool lofDetectTool = new LOFDetectTool(200, 20);
        lofDetectTool.timeSeriesAnalyse(testData);
        System.out.println(lofDetectTool.getResults());

    }
}
