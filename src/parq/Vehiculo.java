package parq;
import java.util.ArrayList;
/*
Daniel Eduardo Caicedo Castillo
Andres Julian Leon Montoya
Angie Tatiana Reyes Sanchez
*/
public abstract class Vehiculo {
    // Declaro el array list
    ArrayList Nombre;
    ArrayList idPlaca;
    ArrayList tipoAuto;
    
    String placa;
    String propietario;
    int tipo; //1. bicicleta / 2. moto / 3. automovil .... 
    int dE, mE, aE, hE, minE;
    int dS, mS, aS, hS, minS;
    int totAño, totMes, totDia, totHor, totMin;
    long totValor;
    final int VALOR1 = 10;
    final int VALOR2 = 50;
    final int VALOR3 = 100;
    String categoria;

    public Vehiculo(){   
    }
//constructor del arrayList
    public Vehiculo(ArrayList Nombre, ArrayList idPlaca, ArrayList tipoAuto) {
        this.Nombre = Nombre;
        this.idPlaca = idPlaca;
        this.tipoAuto = tipoAuto;
    }
    
// Geters y seters 
    public ArrayList getNombre() {
        return Nombre;
    }
    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }
    public ArrayList getIdPlaca() {
        return idPlaca;
    }
    public void setIdPlaca(ArrayList idPlaca) {
        this.idPlaca = idPlaca;
    }
    public ArrayList getTipoAuto() {
        return tipoAuto;
    }
    public void setTipoAuto(ArrayList tipoAuto) {
        this.tipoAuto = tipoAuto;
    }
//fin de getters y setters
    public abstract  void IngresarNombre (String nombres);
    public abstract  void IngresarIdPlaca (String idplaca);
    public abstract  void IngresarTipoAuto (int tipoAuto);
    public abstract  String BuscarNombre (String nombres);
    public abstract  String BuscarIdPlaca (String idplaca);
    public abstract  int BuscarTipoAuto (int tipoAuto);
//fin metodos abstractos
   
    // codigo principal
    public Vehiculo (String placa, String propietario, int tipo){
        this.placa = placa;
        this.propietario = propietario;
        this.tipo = tipo;                
    }
    public void registrarEntrada( int aE, int mE,int dE, int hE, int minE ){
        this.dE = dE;
        this.mE = mE;
        this.aE= aE;
        this.hE = hE;
        this.minE = minE;
    }
    public void registrarSalida(int aS, int mS,int dS, int hS, int minS ){
        this.dS = dS;
        this.mS = mS;
        this.aS = aS;
        this.hS= hS;
        this.minS = minS;
    }
    public void calcularTiempo(){
        if(aE == aS){
            if(mE==mS){
                //calcular total de dias
                if (dE == dS) {
                totHor = hS-hE;
                    //calcular total minutos
                    if (minS >= minE){
                    totMin = totHor*60+(minS-minE) ;
                    }
                    else{
                    totMin = totHor*60 -(minE-minS);
                    }
                }
                else{
                totDia = dS-dE;
                    if (hS>=hE) {
                       totHor = totDia*24 + (hS-hE); 
                    }
                    else{
                       totHor = totDia*24 - (hE-mS);
                    }
                    if (minS >= minE){
                    totMin = totHor*60+(minS-minE) ;
                    }
                    else{
                    totMin = totHor*60 -(minE-minS);
                    }
                }
            }
            //calcular total meses si no es el mismo mes
            else{
            totMes = mS-mE;
            if(mE==1 || mE==3 || mE==5 || mE==7 || mE==8 || mE==10 || mE==12){
                if (dS>=dE) {
                    totDia = totMes*31 +(dS-dE);
                }
                else{
                    totDia= totMes*31 -(dE-dS);
                }
                if (hS>=hE) {
                       totHor = totDia*24 + (hS-hE); 
                    }
                    else{
                       totHor = totDia*24 - (hE-mS);
                    }
                        if (minS >= minE){
                        totMin = totHor*60+(minS-minE) ;
                        }
                        else{
                        totMin = totHor*60 -(minE-minS);
                        }
                }
            if(mE==4 || mE==6 || mE==9 || mE==11  ){
                 if (dS>=dE) {
                    totDia = totMes*30 +(dS-dE);
                }
                else{
                    totDia= totMes*30 -(dE-dS);
                }
                if (hS>=hE) {
                       totHor = totDia*24 + (hS-hE); 
                    }
                    else{
                       totHor = totDia*24 - (hE-mS);
                    }
                        if (minS >= minE){
                        totMin = totHor*60+(minS-minE) ;
                        }
                        else{
                        totMin = totHor*60 -(minE-minS);
                        }
            }
                if (mE==2) {
                    if (dS>=dE) {
                    totDia = totMes*28 +(dS-dE);
                }
                else{
                    totDia= totMes*28 -(dE-dS);
                }
                if (hS>=hE) {
                       totHor = totDia*24 + (hS-hE); 
                    }
                    else{
                       totHor = totDia*24 - (hE-mS);
                    }
                        if (minS >= minE){
                        totMin = totHor*60+(minS-minE) ;
                        }
                        else{
                        totMin = totHor*60 -(minE-minS);
                        }
                }
            }
        }
        // calcular años total si no es en el mismo año
        else{
        totAño= aS-aE;
            if (mS>=mE) {
                totMes = totAño*12 + (mS-mE);
                if(mE==1 || mE==3 || mE==5 || mE==7 || mE==8 || mE==10 || mE==12){
                if (dS>=dE) {
                    totDia = totMes*31 +(dS-dE);
                }
                else{
                    totDia= totMes*31 -(dE-dS);
                }
                if (hS>=hE) {
                       totHor = totDia*24 + (hS-hE); 
                    }
                    else{
                       totHor = totDia*24 - (hE-mS);
                    }
                        if (minS >= minE){
                        totMin = totHor*60+(minS-minE) ;
                        }
                        else{
                        totMin = totHor*60 -(minE-minS);
                        }
                }
                if(mE==4 || mE==6 || mE==9 || mE==11  ){
                    if (dS>=dE) {
                    totDia = totMes*30 +(dS-dE);
                }
                else{
                    totDia= totMes*30 -(dE-dS);
                }
                if (hS>=hE) {
                       totHor = totDia*24 + (hS-hE); 
                    }
                    else{
                       totHor = totDia*24 - (hE-mS);
                    }
                        if (minS >= minE){
                        totMin = totHor*60+(minS-minE) ;
                        }
                        else{
                        totMin = totHor*60 -(minE-minS);
                        }
                }
                if (mE==2) {
                    if (dS>=dE) {
                    totDia = totMes*28 +(dS-dE);
                }
                else{
                    totDia= totMes*28 -(dE-dS);
                }
                if (hS>=hE) {
                       totHor = totDia*24 + (hS-hE); 
                    }
                    else{
                       totHor = totDia*24 - (hE-mS);
                    }
                        if (minS >= minE){
                        totMin = totHor*60+(minS-minE) ;
                        }
                        else{
                        totMin = totHor*60 -(minE-minS);
                        }
                }
            }
            // si el mes de entrad es mayor que el mes de salida
            else{
                totMes= totAño*12 - (mE-mS);
                if(mE==1 || mE==3 || mE==5 || mE==7 || mE==8 || mE==10 || mE==12){
                if (dS>=dE) {
                    totDia = totMes*31 +(dS-dE);
                }
                else{
                    totDia= totMes*31 -(dE-dS);
                }
                if (hS>=hE) {
                       totHor = totDia*24 + (hS-hE); 
                    }
                    else{
                       totHor = totDia*24 - (hE-mS);
                    }
                        if (minS >= minE){
                        totMin = totHor*60+(minS-minE) ;
                        }
                        else{
                        totMin = totHor*60 -(minE-minS);
                        }
                }
            if(mE==4 || mE==6 || mE==9 || mE==11  ){
                 if (dS>=dE) {
                    totDia = totMes*30 +(dS-dE);
                }
                else{
                    totDia= totMes*30 -(dE-dS);
                }
                if (hS>=hE) {
                       totHor = totDia*24 + (hS-hE); 
                    }
                    else{
                       totHor = totDia*24 - (hE-mS);
                    }
                        if (minS >= minE){
                        totMin = totHor*60+(minS-minE) ;
                        }
                        else{
                        totMin = totHor*60 -(minE-minS);
                        }
            }
                if (mE==2) {
                    if (dS>=dE) {
                    totDia = totMes*28 +(dS-dE);
                }
                else{
                    totDia= totMes*28 -(dE-dS);
                }
                if (hS>=hE) {
                       totHor = totDia*24 + (hS-hE); 
                    }
                    else{
                       totHor = totDia*24 - (hE-mS);
                    }
                        if (minS >= minE){
                        totMin = totHor*60+(minS-minE) ;
                        }
                        else{
                        totMin = totHor*60 -(minE-minS);
                        }
                }
            }
        }
    }
    //fin calcular tiempo 
    
    public int calcularValor(){
        if (tipo==1){
            totValor = totMin * VALOR1;
        }else{
        if (tipo==2){
            totValor = totMin * VALOR2;
        }else{
        if (tipo==3){
            totValor = totMin * VALOR3;
        }}}
        return (int) totValor;
    }
    public String calcularTipo(){
        if(tipo==0){
            categoria="bicicleta";
        }else{
            if(tipo==1){
                categoria="moto";
            }else{
                if(tipo==2){
                    categoria="automovil";
                }
            }
        }
        return categoria;
    }
}
