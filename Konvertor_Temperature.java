public class Konvertor_Temperature {
    double konvertCUF (double tc){
        double tf;
//5.0 i 9.0 a ne 5 i 9 da se ne bi pozvalo
//cijelobrojno DIV dijeljenje vec dijeljenje realnih brojeva
        tf = ((tc*9.0)/5.0)+32;
        return tf;
    }
    double konvertFUC (double tf){
        double tc;
//5.0/9.0 a ne 5/9 da se ne bi pozvalo
//cijelobrojno DIV dijeljenje vec dijeljenje realnih brojeva kao i gore
        tc = (tf-32)*(5.0/9.0);
        return tc;
    }


    public static void main (String[] args){
        Konvertor_Temperature k = new Konvertor_Temperature();
        System.out.println ("Temperatura 0 C je "+k.konvertCUF(0)+" F");
        System.out.println ("Temperatura 41 F je "+k.konvertFUC(41)+" C");
    }

}
