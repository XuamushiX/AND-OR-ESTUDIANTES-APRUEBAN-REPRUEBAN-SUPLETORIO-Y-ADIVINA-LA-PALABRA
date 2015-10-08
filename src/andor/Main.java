/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package andor;
import java.io.*;
/**
 *
 * @author electrica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStreamReader DATO = new InputStreamReader (System.in);
        BufferedReader DATO1= new BufferedReader (DATO);
        int NUMEST,i,CONAPRO,CONREPRO,CONGRACIA;
        double NOTA;
        String PALABRA;
        i=1;
        CONAPRO=0;
        CONREPRO=0;
        CONGRACIA=0;
        try
       {
            System.out.println("REALIZAR UN PROGRAMA PARA VISUALIZAR CUANTOS");
            System.out.println("ESTUDIANTES PASAN, CUANTOS ESTUDIANTES REPITEN");
            System.out.println("Y CUANTOS ESTUDIANTES VAN AL DE GRACIA,");
            System.out.println("CONSIDERANDO QUE PASAN CON 70 O MAS, QUE PIERDEN ");
            System.out.println("CON 50 O MENOS Y EL RESTO AL DE GRACIA. ");
            System.out.println("");
            System.out.println("INGRESE EL NUMERO DE ESTUDIANTES:");
            NUMEST=Integer.parseInt(DATO1.readLine());
            while (i<=NUMEST)
            {
                System.out.println("INGRESE LA NOTA DEL ESTUDIANTE"+i);
                NOTA=Double.parseDouble(DATO1.readLine());
                if (NOTA>0 && NOTA<=100)
                {
                if(NOTA>=70)
                {
                    CONAPRO=CONAPRO+1;
                }
                else
                {
                    if (NOTA>50 && NOTA<70)
                    {
                        CONGRACIA=CONGRACIA+1;
                    }
                    else
                    {
                      CONREPRO=CONREPRO+1;
                    }
                }

                }
                else
                {
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                i=i-1;
                }
                
                i=i+1;
            }
            System.out.println("LOS ESTUDIANTES APROBADOS SON: "+" "+CONAPRO);
            System.out.println("LOS ESTUDIANTES REPROBADOS SON: "+" "+CONREPRO);
            System.out.println("LOS ESTUDIANTES A REPECHAJE SON: "+" "+CONGRACIA);
 System.out.println("");
 System.out.println("");
 System.out.println("REALIZAR UN PROGRAMA QUE SIMULE UN JUEGO DE ACIERTO DE UNA CLAVE");
 System.out.println("MEDIANTE EL INGRESO DE PALABRAS.");
 System.out.println("");
 System.out.println("INGRESA UNA PALABRA PARA VER SI ADIVINAS");
 PALABRA=DATO1.readLine();
 if(PALABRA.equals("BALET") || PALABRA.equals("balet") || PALABRA.equals("Balet"))
 {
 System.out.println("VERY GOOD");
 }
 else
    {
System.out.println("OH MEY GET");
 }


        }
         catch (IOException e)
        {
            System.out.println("ERROR");
        }
    }

}
