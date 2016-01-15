import javax.swing.JOptionPane;

public class AppDatos {

	public static void main(String[] args) {

		Alumno al = new Alumno("Daniela","22","5537556447","Ojo de Agua","Femenino","1.56","53","GABD930818MMCRNZ01","GARCDA","Soltera");
		JOptionPane.showMessageDialog(null,
				String.format("Hola %s \n tu edad es %s \n tu telefono es %s \n tu direccion es %s \n tu sexo es %s \n tu estatura es %s \n tu peso es %s \n tu curp es %s \n tu rfc es %s \n tu estado civil es",al.getNombre(),al.getEdad(),al.getTelefono(),al.getDireccion(),al.getSexo(),al.getEstatura(),al.getPeso(),al.getCurp(),al.getRfc(),al.getEstadocivil()));
			

	}

}
