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
        int i=0,l=this.cantidadDeEstudiantesInscritos()
        for(i = 0; i <l ; i++){
             if( lista.get(i).getCalificacion()>4){
              aprobados.add(lista.get(i))
             }
        }
        aprobados
    }
    
    //ejercicio 6
    def existeEstudiante(unEstudiante){
        this.lista.contains(unEstudiante)
    }
    
    
    //ejercicio7
    def existeEstudianteConNotaDiez(){
        def alumnoDiez
        int i=0,l=this.cantidadDeEstudiantesInscritos()
        for(i = 0; i <l ; i++){
             if( lista.get(i).getCalificacion()==10){
              return true
             }
        }
        return false 
    }
    
    //ejercicio8
    def existeEstudianteLlamado(unNombre){
        for(int i = 0; i <cantidadDeEstudiantesInscritos() ; i++){
             if(this.lista.get(i).getNombre().contains(unNombre)){
              return true
             }
        }
        false 
    }
    
    //ejercicio9
    def porcentajeDeAprobados(){
        int cantAprobados = estudiantesAprobados().size()
        int cantDesaprobados = cantidadDeEstudiantesInscritos() - cantAprobados 
        int porcentajeAprobados = (cantAprobados * 100) /  cantidadDeEstudiantesInscritos()  
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
    //def frecuenciaDeEdades(lista){
      //  def mapa = [:]
       
    //} 
    
}
 static main(args){
        def curso1 = new Curso()
        //agregarEstudiante
        def estudiante1 = new Estudiante('a_1',123,12,'Oruro',5)
        curso1.agregarEstudiante(estudiante1)
        def estudiante2 = new Estudiante('a_2',344,19,'Cbba',6)
        curso1.agregarEstudiante(estudiante2)
        def estudiante3 = new Estudiante('a_3',344,19,'Salta',1)
        curso1.agregarEstudiante(estudiante3)
        def estudiante4 = new Estudiante('a_4',344,19,'Catamarca',10)
        curso1.agregarEstudiante(estudiante4)
        def estudiante5 = new Estudiante('a_5',344,19,'Puno',1)
        curso1.agregarEstudiante(estudiante5)
        def estudiante6 = new Estudiante('a_6',344,19,'Puno',1)
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
        
        println "5.- Estudiantes aprobados= "+ curso1.estudiantesAprobados()
        
        //Existe Estudiante
        println "6. " + curso1.existeEstudiante(estudiante1)
        println "6. " + curso1.existeEstudiante("estudiante")
        
        
        println "7.- ConNota10= " + curso1.existeEstudianteConNotaDiez()
        //ExisteEstudianteNombre
        println "8. " + curso1.existeEstudianteLlamado(estudiante1.getNombre())
        println "8. " + curso1.existeEstudianteLlamado("lolo")
        
        //curso1.existeEstudianteConNotaDiez(listaCurso) 
        
        //curso1.unDesastre(listaCurso)
        
        println "Aprobados "+ curso1.estudiantesAprobados().nombre
        curso1.porcentajeDeAprobados()
        
        //promedioclificaciones
        curso1.promedioDeCalificaciones()
        
        //ListaEstudiantesNoCatamarc
        curso1.estudiantesNoCatamarquenios()
        
        //calificacionFrecuente
        println "12.- CalificacionFrecuente = " + curso1.calificacionMasFrecuente()
        
        curso1.estudiantesNoCatamarquenios().nombre
        //ListaCiudadesEstudiantesSinCatamarca
        curso1.ciudadesExceptoCatamarca()
        //Desastre
        println "14. Desastre: " + curso1.unDesastre()
        
        /*/11 no catamarqueños, devuelve lista de Estudiante
        curso1.estudiantesNoCatamarquenios(listaCurso).each{println it}*/
        
        //12 retorna la nota con mas frecuencia, ademas el metodo calcula la frecuencia
        //curso1.calificacionMasFrecuente(listaCurso)
    }