package com.varian;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class TestOpencvDemo {
    static { System.load(System.getProperty("user.dir") + "/src/main/resources/opencv_java342.dll");}

    public static void main(String[] args) {
        Mat img = Imgcodecs.imread("D:/workspace/enjoy-opencv/src/main/resources/chuliqian.jpg");

        //中值滤波将图像的每个像素用邻域 (以当前像素为中心的正方形区域)像素的 中值 代替
        //图像平滑处理：中值滤波：输入、输出、基数
        Imgproc.medianBlur(img, img, 7);

        Imgcodecs.imwrite("D:/workspace/enjoy-opencv/src/main/resources/chulihou.jpg",img);

        img.release();
    }
}
