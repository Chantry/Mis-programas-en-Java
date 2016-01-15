
/**
 * 
 * @author Daniela García Baeza
 *
 */
public class Alumno {

		private String nombre;
		private String edad;
		private String telefono;
		private String direccion;
		private String sexo;
		private String estatura;
		private String peso;
		private String curp;
		private String rfc;
		private String estadocivil;
		
		/**
		 * Este es un constructor vacio
		 */
		public Alumno(){} //metodo por defecto con este te aseguras que no se meta a tu info

	/**
	 * Este es un constructor con parametros	
	 */
   public Alumno(String nombre, String edad, String telefono, String direccion, String sexo, String estatura,
				String peso, String curp, String rfc, String estadocivil) {

			this.nombre = nombre;
			this.edad = edad;
			this.telefono = telefono;
			this.direccion = direccion;
			this.sexo = sexo;
			this.estatura = estatura;
			this.peso = peso;
			this.curp = curp;
			this.rfc = rfc;
			this.estadocivil = estadocivil;
		}

   /** 
    * 
    * Introduce el nombre de la persona en fromato String
    * 
    * 
    */
   
		public String getNombre() {
			return nombre;
		}

		
/**
 * 
 * regresa el parametro nombre 
 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

/**
 * 
 * Introduce la edad de la persona en formato String
 */
		public String getEdad() {
			return edad;
		}

/**
 * 
 * regresa el parametro edad
 */
		public void setEdad(String edad) {
			this.edad = edad;
		}

/**
 * 
 * Introduce el telefono de la persona en formato String
 */
		public String getTelefono() {
			return telefono;
		}
/**
 * 
 * regresa el parametro telefono
 */
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

/**
 * 
 * Introduce la direccion de la persona en formato String
 */
		public String getDireccion() {
			return direccion;
		}

/**
 * 
 * regresa el parametro Direccion
 */
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

/**
 * 
 * Introducce el sexo de la persona en formato String
 */
		public String getSexo() {
			return sexo;
		}

/**
 * 
 * regresa el parametro sexo
 */
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
/** 
 * 
 * Introduce la estatura de la persona en fromato String
 */

		public String getEstatura() {
			return estatura;
		}

/**
 * 
 * regresa el parametro estatura
 */
		public void setEstatura(String estatura) {
			this.estatura = estatura;
		}

/** 
 * 
 * Introducce el peso de la persona en formato String
 */
		public String getPeso() {
			return peso;
		}

/**
 * 
 * regresa el parametro estatura
 */
		public void setPeso(String peso) {
			this.peso = peso;
		}

/**
 * 
 * Introducce el CURP de la persona en formato String
 */
		public String getCurp() {
			return curp;
		}

/**
 * 
 * regresa el parametro curp
 */
		public void setCurp(String curp) {
			this.curp = curp;
		}

/** 
 * 
 * Introducce el RFC de la persona en formato String
 */
		public String getRfc() {
			return rfc;
		}


		public void setRfc(String rfc) {
			this.rfc = rfc;
		}

/**
 * 
 * Introducce el Estado cicil de la persona en formato String
 */
		public String getEstadocivil() {
			return estadocivil;
		}


		public void setEstadocivil(String estadocivil) {
			this.estadocivil = estadocivil;
		}


		
	}


