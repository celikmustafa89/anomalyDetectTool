package com.anomalydetect;

import com.anomalydetect.BruteForce.BruteForceTool;
import com.anomalydetect.BruteForce.HeuristicTool;
import com.anomalydetect.Result.Result;
import com.anomalydetect.Tool.DisplayTool;
import com.anomalydetect.Tool.FileTool;
import com.anomalydetect.Util.MatrixUtil;

import java.io.FileNotFoundException;
import java.util.List;

public class AnomalyDetectionTest1 {
    public static void main(String[] args) {
        double[] series = null;
        double[] test = null;

        try {
            series = FileTool.getData("data.json");
            test = MatrixUtil.getTestSeries(series, 0, 360);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("------");

        BruteForceTool bruteForceTool = new BruteForceTool(15);
        bruteForceTool.timeSeriesAnalyse(test);
        System.out.println(bruteForceTool.getResults());
        DisplayTool.showResult(bruteForceTool);


    }
}
