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
    def lista = []
    def Curso (){}
    
    //ejercicio 1
    void resetearNotas (){
    this.lista.each{it.calificacion=0}
    }
    //ejercicio2
    void agregarEstudiante(listaCurso, unEstudiante){
         listaCurso.add(unEstudiante)
    }
<<<<<<< HEAD
    //ejercicio 4
    
    //ejercicio 5   
=======
    
    //ejercicio 3
    def cantidadDeEstudiantesInscritos(){
        this.lista.size()
    }
    
    //ejercicio 4
    def estudiantes(){
    return lista
    }
    
    //ejercicio 5   

>>>>>>> 365066fcf3747aaa6542ed23524a2dfc2a970a37
    def estudiantesAprobados(lista){
        def aprobados =[]
        int i=0,l=this.cantidadDeEstudiantesInscritos(lista)
        for(i = 0; i <l ; i++){
             if( lista.get(i).getCalificacion()>4){
              aprobados.add(lista.get(i))
             }
        }
        aprobados
    }
    
    //ejercicio 6
    def existeEstudiante(){
    
    }
    
    
    //ejercicio7
    def existeEstudianteConNotaDiez(lista){
        def alumnoDiez
        int i=0,l=this.cantidadDeEstudiantesInscritos(lista)
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
        int i=0, l= this.cantidadDeEstudiantesInscritos(lista)
        for(i = 0; i <l ; i++){
             if( lista.get(i).getCiudadNatal().toUpperCase()!= 'CATAMARCA'){
              noCatamarquenios.add(lista.get(i))
             }
        }
        noCatamarquenios
    }
    
    //ejercicio 12
    def calificacionMasFrecuente(lista){
        def i=0, j=0, l= this.cantidadDeEstudiantesInscritos(lista)
        def frecuenciaTemp, frecuenciaModa = 0, moda = -1; 
        
        for (i=0; i < l-1; i++){
            frecuenciaTemp = 1
            for(j = i+1 ; j<l; j++){
                if(lista.get(i).getCalificacion() == lista.get(j).getCalificacion())
                    frecuenciaTemp ++                
            }
            if(frecuenciaTemp > frecuenciaModa){
                frecuenciaModa = frecuenciaTemp
                moda = lista.get(i).getCalificacion()
            }
        }
        //println "La calificacion: " + moda + " es mas frecuente y se repite: " + frecuenciaModa + " veces."
        moda
    }
    
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
    def frecuenciaDeEdades(lista){
        def mapa = [:]
        
        
    } 
    
    
}
 static main(args){
        def curso1 = new Curso()
        def listaCurso = []
        def estudiante1 = new Estudiante('a_1',123,12,'Oruro',5)
        def estudiante2 = new Estudiante('a_2',222,22,'Catamarca',3)
        def estudiante3 = new Estudiante('a_3',321,23,'Tucuman',5)
        def estudiante8 = new Estudiante('a_8',321,23,'Tucuman',5)
        def estudiante9 = new Estudiante('a_9',321,23,'Tucuman',6)
        def estudiante10 = new Estudiante('a_10',321,23,'Tucuman',3)
        def estudiante11 = new Estudiante('a_11',321,23,'Tucuman',10)
       
        println estudiante2.getNombre()
        
        listaCurso += [estudiante1,estudiante2,estudiante8,estudiante9,estudiante10,estudiante11]
        println listaCurso.get(0).getNombre()
        
        //resetearNotas
        //curso1.resetearNotas()
        
        //agregarEstudiante
        curso1.agregarEstudiante(listaCurso, estudiante3)
        def estudiante4 = new Estudiante('a_4',344,19,'Salta',5)
        curso1.agregarEstudiante(listaCurso, estudiante4)
        print "Iteracion dentro de la lista = "+" "
        for(i = 0; i < listaCurso.size(); i++){
             print listaCurso.get(i).getCiudadNatal() + " "
        }
        println ""
        println ''
        println listaCurso.get(3).getNombre()

        //Cantidad Estudiantes
        curso1.cantidadDeEstudiantesInscritos()
        
        //Estudiantes
        println "Estudiantes: " + curso1.estudiantes(listaCurso)
        
        
        
        curso1.porcentajeDeAprobados(listaCurso)
<<<<<<< HEAD

        curso1.existeEstudianteConNotaDiez(listaCurso) 

        curso1.existeEstudianteConNotaDiez(listaCurso)
=======
        curso1.existeEstudianteConNotaDiez(listaCurso) 
>>>>>>> 365066fcf3747aaa6542ed23524a2dfc2a970a37
        
        //curso1.promedioDeCalificaciones(listaCurso)
        curso1.unDesastre(listaCurso)
        
<<<<<<< HEAD
        
=======
        /*/11 no catamarqueños, devuelve lista de Estudiante
        curso1.estudiantesNoCatamarquenios(listaCurso).each{println it}*/
        
        //12 retorna la nota con mas frecuencia, ademas el metodo calcula la frecuencia
        //curso1.calificacionMasFrecuente(listaCurso)
>>>>>>> 365066fcf3747aaa6542ed23524a2dfc2a970a37
    }