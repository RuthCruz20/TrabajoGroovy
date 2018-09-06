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
    void agregarEstudiante(unEstudiante){
         this.lista.add(unEstudiante)
         print "2. Estudiante " + unEstudiante+" aumentado"
         println ''
    } 
     
    //ejercicio 3
    def cantidadDeEstudiantesInscritos(){
        this.lista.size()
    }
    
    //ejercicio 4
    def estudiantes(){
        lista
    }
    
    //ejercicio 5  
    def estudiantesAprobados(){
        def aprobados = []
        int i=0,l=this.cantidadDeEstudiantesInscritos()
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
    def existeEstudianteLlamado(){
    
    }
    
    //ejercicio9
    def porcentajeDeAprobados(){
        int cantEstudiantes = lista.size()
        int cantAprobados = estudiantesAprobados().size()
        int cantDesaprobados = cantidadDeEstudiantesInscritos() - cantAprobados 
        int porcentajeAprobados = (cantAprobados * 100) / cantEstudiantes 
        println "9. Porcentaje aprobados " + porcentajeAprobados + " %"
    }
    
    //ejercicio10
    def promedioDeCalificaciones(){
        int prom = 0, sumaNotas = 0
        for(int i = 0 ; i < this.lista.size(); i++){
            sumaNotas += lista.get(i).calificacion
        }
        prom = sumaNotas / cantidadDeEstudiantesInscritos()
        println "10. Promedio calificaciones: " + prom
    }
    
    //ejercicio 11
    def estudiantesNoCatamarquenios(){
        def noCatamarquenios =[]
        int i=0, l= this.cantidadDeEstudiantesInscritos()
        for(i = 0; i <l ; i++){
             if(lista.get(i).ciudadNatal.toUpperCase()!= 'CATAMARCA'){
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
        def listaSinCatamarca = []
        //for(int i = 0; i < estudiantes){
        
        //}
        def noCatamarca = lista.findAll {it.ciudadNatal.toLowerCase() != 'catamarca'}
        def ciudades = noCatamarca.collect {it.ciudadNatal}
        println "CITYS WE "+ ciudades
    }
    
    //ejercicio 14
    def unDesastre(){
        boolean desastre = false
        int cantAprobados = estudiantesAprobados().size()
        int cantDesaprobados = this.cantidadDeEstudiantesInscritos() - estudiantesAprobados().size()
        if(cantDesaprobados == cantidadDeEstudiantesInscritos()){
            desastre = true
        }else{
            desastre = false
        }
        println "14. Desastre: " + desastre
    }
    //ejercicio 15
    def frecuenciaDeEdades(lista){
        def mapa = [:]
        
        
    } 
    
    
}
 static main(args){
        def curso1 = new Curso()
        def estudiante1 = new Estudiante('a_1',123,12,'Oruro',5)
        /*def estudiante2 = new Estudiante('a_2',222,22,'Catamarca',3)
        def estudiante3 = new Estudiante('a_3',321,23,'Tucuman',5)
        def estudiante8 = new Estudiante('a_8',321,23,'Tucuman',5)
        def estudiante9 = new Estudiante('a_9',321,23,'Tucuman',6)
        def estudiante10 = new Estudiante('a_10',321,23,'Tucuman',3)
        def estudiante11 = new Estudiante('a_11',321,23,'Tucuman',10)*/
       
        //println estudiante2.getNombre()
        
        /*listaCurso += [estudiante1,estudiante2,estudiante8,estudiante9,estudiante10,estudiante11]
        println listaCurso.get(0).getNombre()*/
        
        //resetearNotas
        //curso1.resetearNotas()
        
        //agregarEstudiante
        curso1.agregarEstudiante(estudiante1)
        def estudiante2 = new Estudiante('a_2',344,19,'Cbba',6)
        curso1.agregarEstudiante(estudiante2)
        def estudiante3 = new Estudiante('a_3',344,19,'Salta',1)
        curso1.agregarEstudiante(estudiante3)
        def estudiante4 = new Estudiante('a_4',344,19,'Catamarca',1)
        curso1.agregarEstudiante(estudiante4)
         def estudiante5 = new Estudiante('a_5',344,19,'Puno',1)
        curso1.agregarEstudiante(estudiante5)

        //Cantidad Estudiantes
        println "Cantidad De Estudiantes Inscritos: " + curso1.cantidadDeEstudiantesInscritos()
         
        println "Estudiantes: " + curso1.estudiantes()
        curso1.promedioDeCalificaciones()
        println "AprobaDOS "+ curso1.estudiantesAprobados().nombre
        //curso1.existeEstudianteConNotaDiez(listaCurso) 
        curso1.porcentajeDeAprobados()
        curso1.unDesastre()
        
        curso1.estudiantesNoCatamarquenios().nombre
        
        curso1.ciudadesExceptoCatamarca()
        /*/11 no catamarqueños, devuelve lista de Estudiante
        curso1.estudiantesNoCatamarquenios(listaCurso).each{println it}*/
        
        //12 retorna la nota con mas frecuencia, ademas el metodo calcula la frecuencia
        //curso1.calificacionMasFrecuente(listaCurso)
    }