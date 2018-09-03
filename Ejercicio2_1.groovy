class Estudiante{
    String nombre 
    def dni
    int edad
    String ciudadNatal
    def calificacion
    def Estudiante(nombre,dni,edad,ciudadNatal,calificacion){
        this.nombre=nombre
        this.dni=dni
        this.edad=edad
        this.ciudadNatal=ciudadNatal
        this.calificacion=calificacion
    }
   
}

class Curso extends Estudiante{
    def lista=[]
    //ejercicio 1
    
    
    //ejercicio2
    def agregarEstudiante(unEstudiante){
    
    }
    
    //ejercicio 3
    
    
    //ejercicio 4
    
    
    //ejercicio 5
    
    def estudiantesAprobados(){
        "hello $nombre"
    }
    //ejercicio 6
    
    //ejercicio7
    
    
    //ejercicio8
    
    
    //ejercicio9
    
    //ejercicio10
    
    
    //ejercicio 11
    
    
    //ejercicio 12
    
    
    //ejercicio 13
    
    
    //ejercicio 14
    
    
    //ejercicio 15
    
    
    
    
}
 static main(args){
        def estudiante1 = new Estudiante('a1',123,12,'cbba',66)
        def estudiante2 = new Estudiante('a2',123,12,'cbba',66)
        def estudiante3 = new Estudiante('a3',123,12,'cbba',66)
        println estudiante3.getNombre()
        
    }