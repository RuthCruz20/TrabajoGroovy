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
    def existeEstudianteConNotaDiez(lista){
        def alumnoDiez
        int i=0,l=lista.size()
        for(i = 0; i <l ; i++){
             if( lista.get(i).getCalificacion()==10){
              return true
             }
        }
        return false 
    }
    
    //ejercicio8
    
    
    //ejercicio9
    def porcentajeDeAprobados(listaCurso){
        int cantEstudiantes = listaCurso.size()
        int cantAprobados = this.estudiantesAprobados(listaCurso).size()
        int cantDesaprobados = cantEstudiantes - cantAprobados 
        int porcentajeAprobados = (cantAprobados * 100) / cantEstudiantes 
        println porcentajeAprobados + "% Aprobados"
    }
    //ejercicio10
    def promedioDeCalificaciones(listaCurso){
        int cantEstudiantes = listaCurso.size()
        int sumaNotas = 0
        def promedio = 0
        for(int i = 0; i < listaCurso.size(); i++){
            sumaNotas += listaCurso.get(i).getCalificacion()
        }
        promedio = sumaNotas / cantEstudiantes
        println "Promedio Notas: " + promedio
    }
    //ejercicio 11
    
    
    //ejercicio 12
    
    
    //ejercicio 13
    def ciudadesExceptoCatamarca(){
        
    }
    //ejercicio 14
    def unDesastre(listaCurso){
        boolean desastre = false
        int cantEstudiantes = listaCurso.size()
        int cantAprobados = this.estudiantesAprobados(listaCurso).size()
        int cantDesaprobados = cantEstudiantes - cantAprobados 
        if(cantDesaprobados == cantEstudiantes){
            desastre = true
        }else{
            desastre = false
        }
        println "Desastre: " + desastre
    }
    //ejercicio 15
    
    
    
    
}
 static main(args){
        def curso1 = new Curso()
        def listaCurso = []
        def estudiante1 = new Estudiante('a_1',123,12,'Oruro',7)
        def estudiante2 = new Estudiante('a_2',222,22,'Cbba',3)
        def estudiante3 = new Estudiante('a_3',321,23,'Tucuman',6)
       
        println estudiante2.getNombre()
        
        listaCurso += [estudiante1,estudiante2]
        println listaCurso.get(0).getNombre()
        
        //resetearNotas
        curso1.resetearNotas(listaCurso)
        println "Calificacion: " + listaCurso.get(0).getCalificacion()
        
        //agregarEstudiante
        curso1.agregarEstudiante(listaCurso, estudiante3)
        def estudiante4 = new Estudiante('a_4',344,19,'Salta',6)
        curso1.agregarEstudiante(listaCurso, estudiante4)
        print "Iteracion dentro de la lista = "+" "
        for(i = 0; i < listaCurso.size(); i++){
             print listaCurso.get(i).getCiudadNatal() + " "
        }
        println ""
        println ''
        println listaCurso.get(3).getNombre()

        
        //Estudiantes
        curso1.porcentajeDeAprobados(listaCurso)
        curso1.existeEstudianteConNotaDiez(listaCurso)
        
        curso1.promedioDeCalificaciones(listaCurso)
        curso1.unDesastre(listaCurso)
        
    }