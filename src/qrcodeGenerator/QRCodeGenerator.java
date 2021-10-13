package qrcodeGenerator;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.File;

public class QRCodeGenerator {
    public static void main(String[] args)throws Exception {
        String data = "https://www.google.com";


        String path = "C:\\Users\\pragya\\IdeaProjects\\QRCode";
        BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 80, 500 );
        MatrixToImageWriter.writeToFile(matrix, "JPG", new File(path+".jpg"));

        System.out.println("Finish Process!!");
    }
}
