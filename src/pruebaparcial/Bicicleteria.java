
package pruebaparcial;

import java.util.List;


public class Bicicleteria {
    private List <bicicleta>bicicletas;
    private float ganancias;
    private int cantidad_ventas;   

    public Bicicleteria(List<bicicleta> bicicletas, float ganancias, int cantidad_ventas) {
        this.bicicletas = bicicletas;
        this.ganancias = ganancias;
        this.cantidad_ventas = cantidad_ventas;
    }
    
    public Bicicleteria(){
    }

    public List<bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(List<bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }

    public int getCantidad_ventas() {
        return cantidad_ventas;
    }

    public void setCantidad_ventas(int cantidad_ventas) {
        this.cantidad_ventas = cantidad_ventas;
    }
    
    public void comprar_bicicleta(bicicleta bicicleta){
        
        
        
        
        
    }
    
    
    
    
    
}
