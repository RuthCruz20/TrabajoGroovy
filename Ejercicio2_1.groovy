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
    
    //ejercicio 3
    def cantidadDeEstudiantesInscritos(listaEstud){
    listaEstud.size()
    }
    
    //ejercicio 4
    
    
<<<<<<< HEAD
    //ejercicio 5   
=======
    //ejercicio 5
<<<<<<< HEAD

=======
    
    
        
>>>>>>> ba149e8153d09bb1cc52a1a877f686376edac7f9
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
        println porcentajeAprobados
    }
    //ejercicio10
    
    
    //ejercicio 11
    def estudiantesNoCatamarquenios(lista){
        def noCatamarquenios =[]
        int i=0,l=lista.size()
        for(i = 0; i <l ; i++){
             if( lista.get(i).getCiudadNatal != "catamarca"){
              aprobados.add(lista.get(i))
             }
        }
        aprobados
    }
    
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

        //Cantidad Estudiantes
        println "Estudiantes Inscritos: " + curso1.cantidadDeEstudiantesInscritos(listaCurso)
        
        //Estudiantes
        curso1.porcentajeDeAprobados(listaCurso)
        curso1.existeEstudianteConNotaDiez(listaCurso) 
<<<<<<< HEAD
=======
=======
        curso1.existeEstudianteConNotaDiez(listaCurso)
        
        curso1.promedioDeCalificaciones(listaCurso)
        curso1.unDesastre(listaCurso)
        
>>>>>>> f49d541da9287dadba2c4b9c84c951b19de3d880
>>>>>>> 343222a9e1310a9b57603479a95b49cfc5e95058
    }