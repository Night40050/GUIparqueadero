package parq;

import java.util.ArrayList;

public class Hereda extends Vehiculo{

    public Hereda(ArrayList Nombre, ArrayList idPlaca, ArrayList tipoAuto) {
        super(Nombre, idPlaca, tipoAuto);
    }

    @Override
    public void IngresarNombre(String nombres) {
    super.Nombre.add(nombres);
    }
    @Override
    public void IngresarIdPlaca(String idplaca) {
    super.idPlaca.add(idplaca);
    }
    @Override
    public void IngresarTipoAuto(int tipoAuto) {
    super.tipoAuto.add(tipoAuto);
    }

    @Override
    public String BuscarNombre(String nombres) {
        String buscarnombre;
        if(super.Nombre.contains(nombres)==true){
            buscarnombre=super.Nombre.get(super.Nombre.indexOf(nombres)).toString();
        }else{
            buscarnombre="No hay nombre";
        }
        return buscarnombre;
    }
    @Override
    public String BuscarIdPlaca(String idplaca) {
        String buscaridPlaca ;
        if(super.idPlaca.contains(idplaca)==true){
            buscaridPlaca=super.idPlaca.get(super.idPlaca.indexOf(idplaca)).toString();
        }else{
            buscaridPlaca="No hay placa";
        }
        return buscaridPlaca;
    }
    @Override
    public int BuscarTipoAuto(int tipoAuto) {
        int buscarTipoAuto=0;
        if (super.tipoAuto.contains(tipoAuto)==true) {
           buscarTipoAuto=Integer.parseInt(super.tipoAuto.get(super.tipoAuto.indexOf(tipoAuto)).toString());
        }else{
            buscarTipoAuto=0;
        }
        return buscarTipoAuto;
    }
}
