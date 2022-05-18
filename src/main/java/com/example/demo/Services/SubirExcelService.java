package com.example.demo.Services;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.Models.EstudianteModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

public class SubirExcelService {

    public static boolean verificarFormato(MultipartFile file){
        String contentType = file.getContentType();

        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")){
            return true;
        } else {
            return false;
        }
    }

    public static List<EstudianteModel> excelLista(InputStream is) throws IOException{

        List<EstudianteModel> list = new ArrayList<>();

        try{

            Workbook workbook = new XSSFWorkbook(is);
            XSSFSheet sheet = (XSSFSheet) workbook.getSheet("Hoja1");
            DataFormatter formatter = new DataFormatter();

            int rowNumber = 0;

            Iterator<Row> iterator = sheet.iterator();

            while(iterator.hasNext()){

                Row row = iterator.next();

                if(rowNumber==0){
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cells = row.iterator();

                int cid=0;

                EstudianteModel estudiante = new EstudianteModel();

                while(cells.hasNext()){

                    Cell cell = cells.next();

                    switch (cid){

                        case 0:
                            estudiante.setCodigo(formatter.formatCellValue(cell));
                            break;

                        case 1:
                            estudiante.setNombre(cell.getStringCellValue());
                            break;

                        case 2:
                            estudiante.setApellido(cell.getStringCellValue());
                            break;

                        case 3:
                            estudiante.setTelefono(formatter.formatCellValue(cell));
                            break;

                        case 4:
                            estudiante.setCorreo(cell.getStringCellValue());
                            break;

                        case 5:
                            estudiante.setPeriodoAspira(cell.getStringCellValue()); 
                            break;

                        default:
                            break;
                
                    }

                    cid++;

                }

                list.add(estudiante);

            }

            workbook.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
}
