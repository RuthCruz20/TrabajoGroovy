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
         print "2. Estudiante " + unEstudiante.nombre+" aumentado"
         println ''
    } 
     
    //ejercicio 3
    def cantidadDeEstudiantesInscritos(){
        this.lista.size()
    }
    
    //ejercicio 4
    def estudiantes(){
        this.lista
    }
    
    //ejercicio 5  
    def estudiantesAprobados(){
        def aprobados = []
        for (estudiante in this.lista){
            if( estudiante.getCalificacion()>4){
              aprobados.add(estudiante)
             }
        }
        aprobados
    }
    
    //ejercicio 6
    def existeEstudiante(unEstudiante){
        this.lista.contains(unEstudiante)
    }
    
    
    //ejercicio7
    boolean existeEstudianteConNotaDiez(){
        return this.lista.any{it.calificacion==10}
    }
    
    //ejercicio8
    boolean existeEstudianteLlamado(unNombre){
        return this.lista.any{it.nombre.equals(unNombre)}
    }
    
    //ejercicio9
    def porcentajeDeAprobados(){
        int cantAprobados = estudiantesAprobados().size()
        int cantDesaprobados = cantidadDeEstudiantesInscritos() - cantAprobados 
        int porcentajeAprobados = (cantAprobados * 100) /  cantidadDeEstudiantesInscritos()  
        println "9. Porcentaje aprobados " + porcentajeAprobados + " %"
    }
    
    //ejercicio10
    double promedioDeCalificaciones(){
        def sumaNotas = this.lista.inject(0.0){suma,lista->suma+=lista.calificacion}
        return sumaNotas/this.lista.size()
    }
    
    //ejercicio 11
    def estudiantesNoCatamarquenios(){
        def noCatamarquenios =[]
         for (estudiante in this.lista){
            if( estudiante.getCiudadNatal().toUpperCase()!= 'CATAMARCA'){
               noCatamarquenios.add(estudiante)
             }
        }
        noCatamarquenios
    }
    
    //ejercicio 12
    def calificacionMasFrecuente(){
        def i=0, j=0, l= this.cantidadDeEstudiantesInscritos()
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
        def noCatamarca = lista.findAll {it.ciudadNatal.toLowerCase() != 'catamarca'}
        def ciudades = noCatamarca.collect {it.ciudadNatal}
        println "13. "+ ciudades.toUnique()
    }
    
    //ejercicio 14
   def unDesastre(){
       boolean desastre = false
       int estDesaprobados = cantidadDeEstudiantesInscritos() -  estudiantesAprobados().size()
       if(estDesaprobados ==  estudiantesAprobados().size()){
           desastre = true
       }else{
           desastre = false
       }
       return desastre
   }
    //ejercicio 15
    def frecuenciaDeEdades(){
        def mapa = [:]
        def listaSet = [] as Set
        int frecuencia=0
        for (estudiante in this.lista)
          listaSet.add(estudiante.getEdad())
        
        
        for (edad in listaSet){
            frecuencia=0
            for (estudiante in this.lista){
              if(estudiante.getEdad()==edad){
                  frecuencia ++
              }
          }
          mapa <<[ "$edad A�os ": frecuencia]
          
          }
          mapa
        
    } 
    
}
 static main(args){
        def curso1 = new Curso()
        
        //agregarEstudiante
        def estudiante1 = new Estudiante('a_1',123,19,'Oruro',5)
        curso1.agregarEstudiante(estudiante1)
        def estudiante2 = new Estudiante('a_2',344,18,'Cbba',6)
        curso1.agregarEstudiante(estudiante2)
        def estudiante3 = new Estudiante('a_3',344,19,'Salta',1)
        curso1.agregarEstudiante(estudiante3)
        def estudiante4 = new Estudiante('a_4',344,17,'Catamarca',10)
        curso1.agregarEstudiante(estudiante4)
        def estudiante5 = new Estudiante('a_5',344,19,'Puno',1)
        curso1.agregarEstudiante(estudiante5)
        def estudiante6 = new Estudiante('a_6',344,17,'Puno',1)
        curso1.agregarEstudiante(estudiante6)
         def estudiante7 = new Estudiante('a_7',344,19,'Puno',1)
        curso1.agregarEstudiante(estudiante7)

        
        /*listaCurso += [estudiante1,estudiante2,estudiante8,estudiante9,estudiante10,estudiante11]
        println listaCurso.get(0).getNombre()*/
        
        //resetearNotas
        //curso1.resetearNotas()
        
        //Cantidad Estudiantes
        println "3. Cantidad De Estudiantes Inscritos: " + curso1.cantidadDeEstudiantesInscritos()
        
        //Estudiantes
        println "4. Estudiantes: " + curso1.estudiantes()
        
        //Aprobados
        println "5. Aprobados: "+ curso1.estudiantesAprobados().nombre

        println "5.- Estudiantes aprobados= "+ curso1.estudiantesAprobados()

        
        //Existe Estudiante
        println "6. " + curso1.existeEstudiante(estudiante1)
        println "6. " + curso1.existeEstudiante("estudiante")
        
        //Nota Diez
        println "7. Estudiantes Con Nota Diez: " + curso1.existeEstudianteConNotaDiez() 
        
        
        println "7.- ConNota10= " + curso1.existeEstudianteConNotaDiez()

        //ExisteEstudianteNombre
        println "8. " + curso1.existeEstudianteLlamado(estudiante1.getNombre())
        println "8. " + curso1.existeEstudianteLlamado("lolo")
        
<<<<<<< HEAD
        println "Aprobados "+ curso1.estudiantesAprobados().nombre
=======
        //curso1.promedioDeCalificaciones(listaCurso)

        //curso1.existeEstudianteConNotaDiez(listaCurso) 
        
        //curso1.unDesastre(listaCurso)
        
>>>>>>> f7e3039b7954c9ee7e995141479a33a83ec6c0d5
        curso1.porcentajeDeAprobados()
        
        //promedioclificaciones
        println "10. Promedio Calificaciones: " + curso1.promedioDeCalificaciones()
        
        //ListaEstudiantesNoCatamarc
        curso1.estudiantesNoCatamarquenios()
        
        //calificacionFrecuente
        println "12.- CalificacionFrecuente = " + curso1.calificacionMasFrecuente()
        
        curso1.estudiantesNoCatamarquenios().nombre
        //ListaCiudadesEstudiantesSinCatamarca
        curso1.ciudadesExceptoCatamarca()
        //Desastre
        println "14. Desastre: " + curso1.unDesastre()
        
        /*/11 no catamarque�os, devuelve lista de Estudiante
        curso1.estudiantesNoCatamarquenios(listaCurso).each{println it}*/
        
        //12 retorna la nota con mas frecuencia, ademas el metodo calcula la frecuencia
        //curso1.calificacionMasFrecuente(listaCurso)
        
        //15 Retorna un mapa con clave la edad y como valor su frecuencia
        curso1.frecuenciaDeEdades().each {println it} 
        //resetearNotas
        curso1.resetearNotas()
    }