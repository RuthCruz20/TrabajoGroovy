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
class Curso{
    def Curso (){}
    //ejercicio 1
    void resetearNotas(listaEst){
      for(int i=0; i<listaEst.size(); i++){
      listaEst.get(i).setCalificacion(0)
      }
    }
    
    //ejercicio2
    void agregarEstudiante(listaCurso, unEstudiante){
         //listaCurso += unEstudiante
         listaCurso.add(unEstudiante)
    }
    
    //ejercicio 4
    
    
    //ejercicio 5
    
    def estudiantesAprobados(lista){
        def aprobados =[]
        int i=0,l=lista.size()
        for(i = 0; i <l ; i++){
             if( lista.get(i).getCalificacion()>4){
              aprobados.add(lista.get(i))
             }
        }
        aprobados
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
        def curso1 = new Curso()
        def listaCurso = []
        def estudiante1 = new Estudiante('a_1',123,12,'Oruro',87)
        def estudiante2 = new Estudiante('a_2',222,22,'Cbba',36)
        def estudiante3 = new Estudiante('a_3',321,23,'Tucuman',66)
       
        println estudiante2.getNombre()
        
        listaCurso += [estudiante1,estudiante2]
        println listaCurso.get(0).getNombre()
        
        //resetearNotas
        curso1.resetearNotas(listaCurso)
        println "Calificacion: " + listaCurso.get(0).getCalificacion()
        
        //agregarEstudiante
        curso1.agregarEstudiante(listaCurso, estudiante3)
        def estudiante4 = new Estudiante('a_4',344,19,'Salta',66)
        curso1.agregarEstudiante(listaCurso, estudiante4)
        print "Iteracion dentro de la lista = "+" "
        for(i = 0; i < listaCurso.size(); i++){
             print listaCurso.get(i).getCiudadNatal() + " "
        }
        println ""
        println ''
        println listaCurso.get(3).getNombre()
        
        //Cantidad Estudiantes
        println "Estudiantes Inscritos: " + listaCurso.size()
        
    }