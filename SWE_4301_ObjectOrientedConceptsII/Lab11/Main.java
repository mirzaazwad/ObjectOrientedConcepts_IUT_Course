package Lab11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    @Deprecated
    public static void main(String[] args) throws IOException {
        Employee employee=new Employee(212,"Azwad",23,200);
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY/MM/dd");
        String dateString=sdf.format(new Date("2020/11/02"));
        Date date=new Date(dateString);
        employee.setExperience(date);
        System.out.println(employee.getExperience());
    }
}