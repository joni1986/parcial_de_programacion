
package pruebaparcial;

//clase bicicleta
public class bicicleta {
    private String  nro_de_serie;
    private String modelo;
    private int anio;
    private float precio;

    public bicicleta(String nro_de_serie, String modelo, int anio, float precio) {
        this.nro_de_serie = nro_de_serie;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

       public bicicleta(){

       }    

    public String getNro_de_serie() {
        return nro_de_serie;
    }

    public void setNro_de_serie(String nro_de_serie) {
        this.nro_de_serie = nro_de_serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
      
}
