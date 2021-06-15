
package dominio;

public class Curso {
    private double [] notas;
    private double promedio; 
    private int estudiantesEncimaPromedio;
    public Curso(){
        notas = new double [12];
    }

    public void setNotas(double notas []) {
        this.notas = notas;
    }
    public void mostrarNotas(){
        for(int i = 0;i<12; i++){
            System.out.println("Estudiantes "+(i+1)+" = "+this.notas[i]);
        }
        }
    public void setPromedio(){
        double promedio=0;
        for(int i = 1; i<12;i++){
            this.notas[0]=this.notas[0]+this.notas[i];
        }
        this.promedio = this.notas[0]/12;
    }
    public void setEstudiantesEncimaPromedio(){
        int estudiantes=0;
        for (int i = 0; i<12;i++){
            if(this.notas[i]>this.getPromedio()){
                estudiantes++;
            }
        }
        this.estudiantesEncimaPromedio=estudiantes;
    }
    public double getPromedio(){
        
        return this.promedio;
    }
    public int getnroEstudiantesEncimaPromedio(){
        
        return this.estudiantesEncimaPromedio;
    }   
}
