package javabnb.backend;

import javax.swing.ImageIcon;
import java.awt.Image;
import javax.imageio.ImageIO;           
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase Inmueble que contiene los datos de un inmueble, como el titulo, el anfitrion, la direccion, el numero maximo de huespedes, el numero de habitaciones,
 * el numero de camas, el numero de baños, el tipo de propiedad, el precio por noche, la lista de servicios, la lista de fotos, la calificacion y la lista de reseñas.
 * 
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */

enum TipoInmueble {CASA, APARTAMENTO}

public class Inmueble implements Serializable {
    
    private String titulo;
    private Anfitrion anfitrion;
    private Direccion direccion;
    private int huespedesMax;
    private int habitaciones;
    private int camas;
    private int baños; 
    private TipoInmueble tipoInmueble; 
    private double precioNoche;
    private ArrayList<String> servicios;
    private ArrayList<ImageIcon> fotos = new ArrayList<ImageIcon>();
    private double calificacion;
    private ArrayList<Reseña> reseñas = new ArrayList<Reseña>();
    

    
    /**
     * Constructor de la clase Inmueble, se deben de introducir los datos del inmueble: titulo, anfitrion, direccion, numero maximo de huespedes, numero de habitaciones, 
     * numero de camas, numero de baños, tipo de propiedad (CASA o APARTAMENTO), precio por noche, lista de servicios, lista de fotos y calificacion
     *
     * @param titulo String con el titulo del inmueble
     * @param anfitrion objeto de la clase Anfitrion
     * @param direccion objeto de la clase Direccion
     * @param huespedesMax int con el numero maximo de huespedes
     * @param habitaciones int con el numero de habitaciones
     * @param camas int con el numero de camas
     * @param baños int con el numero de baños
     * @param tipoInmueble String con el tipo de propiedad (CASA o APARTAMENTO)
     * @param precioNoche double con el precio por noche
     * @param servicios lista de servicios ofrecidos en forma de ArrayList de String
     * @param fotos lista de fotos del inmueble en forma de ArrayList de ImageIcon
     * @param calificacion double con la calificacion del inmueble
     */
    public Inmueble(String titulo, Anfitrion anfitrion, Direccion direccion, int huespedesMax, int habitaciones, int camas, int baños, String tipoInmueble, double precioNoche, ArrayList<String> servicios, ArrayList<ImageIcon> fotos, double calificacion) {
        this.titulo = titulo;
        this.anfitrion = anfitrion;
        this.direccion = direccion;
        this.huespedesMax = huespedesMax;
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.baños = baños;
        if (tipoInmueble.toUpperCase().equals("CASA")) {
            this.tipoInmueble = TipoInmueble.CASA;
        } else if (tipoInmueble.toUpperCase().equals("APARTAMENTO")){
            this.tipoInmueble = TipoInmueble.APARTAMENTO;
        }
        this.precioNoche = precioNoche;
        this.servicios = servicios;
        this.fotos = fotos; // REVISAR a;adir arraylist entero de fotos?
        this.calificacion = 0; // Calificacion por defecto de 0
        anfitrion.addInmueble(this);
        GestorInmueble.addInmueble(this);
    }

    /**
     * Devuelve el valor de titulo
     *
     * @return el valor de titulo en forma de String
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el valor de titulo
     *
     * @param titulo nuevo valor de titulo en forma de String
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Devuelve el valor de anfitrion
     *
     * @return el valor de anfitrion de tipo Anfitrion
     */
    public Anfitrion getAnfitrion() {
        return anfitrion;
    }

    /**
     * Establece el valor de anfitrion
     *
     * @param anfitrion nuevo valor de anfitrion de tipo Anfitrion
     */
    public void setAnfitrion(Anfitrion anfitrion) {
        this.anfitrion = anfitrion;
    }

    /**
     * Devuelve el valor de direccion
     *
     * @return el valor de direccion de tipo Direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Establece el valor de direccion
     *
     * @param direccion nuevo valor de direccion de tipo Direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el numero maximo de huespedes
     *
     * @return el numero de huespedesMax en forma de int
     */
    public int getHuespedesMax() {
        return huespedesMax;
    }

    /**
     * Establece el numero maximo de huespedes
     *
     * @param huespedesMax nuevo numero de huespedesMax en forma de int
     */
    public void setHuespedesMax(int huespedesMax) {
        this.huespedesMax = huespedesMax;
    }

    /**
     * Devuelve el numero de habitaciones
     *
     * @return el numero de habitaciones en forma de int
     */
    public int getHabitaciones() {
        return habitaciones;
    }

    /**
     * Establece el numero de habitaciones
     *
     * @param habitaciones nuevo numero de habitaciones en forma de int
     */
    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * Devuelve el numero de camas
     *
     * @return el numero de camas en forma de int
     */
    public int getCamas() {
        return camas;
    }

    /**
     * Establece el numero de camas
     *
     * @param camas nuevo numero de camas en forma de int
     */
    public void setCamas(int camas) {
        this.camas = camas;
    }

    /**
     * Devuelve el numero de baños
     *
     * @return el numero de baños en forma de int
     */
    public int getBaños() {
        return baños;
    }

    /**
     * Establece el numero de baños
     *
     * @param baños nuevo numero de baños en forma de int
     */
    public void setBaños(int baños) {
        this.baños = baños;
    }

    /**
     * Devuelve el tipo de propiedad
     *
     * @return el tipo de propiedad en forma de TipoInmueble
     */
    public TipoInmueble getTipoInmueble() {
        return tipoInmueble;
    }

    /**
     * Establece el tipo de propiedad. Si el tipo de propiedad no es ni "CASA" ni "APARTAMENTO", imprime un mensaje de error
     *
     * @param tipoInmueble nuevo tipo de propiedad en forma de TipoInmueble: TipoInmueble.CASA o TipoInmueble.APARTAMENTO
     */
    public void setTipoInmueble(String tipoInmueble) {
        if (tipoInmueble.toUpperCase().equals("CASA")) {
            this.tipoInmueble = TipoInmueble.CASA;
        } else if (tipoInmueble.toUpperCase().equals("APARTAMENTO")){
            this.tipoInmueble = TipoInmueble.APARTAMENTO;
        } else {
            System.out.println("El tipo de inmueble no es válido. Debe ser 'CASA' o 'APARTAMENTO'.");
        }
    }

    /**
     * Devuelve el precio por noche
     *
     * @return el precio por noche en forma de double
     */
    public double getPrecioNoche() {
        return precioNoche;
    }

    /**
     * Establece el precio por noche
     *
     * @param precioNoche nuevo precio por noche en forma de double
     */
    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    /**
     * Devuelve la lista de servicios ofrecidos 
     * 
     * @return lista de servicios en forma de ArrayList de String
     */
    public ArrayList<String> getServicios() {
        return servicios;
    }

    /**
     * Establece la lista de servicios ofrecidos
     *
     * @param servicios nueva lista de servicios en forma de ArrayList de String
     */
    public void setServicios(ArrayList<String> servicios) {
        this.servicios = servicios;
    }

    /**
     * Añade un servicio a la lista de servicios ofrecidos 
     *
     * @param nuevoServicio nuevo servicio de la vivienda
     */
    public void addServicios(String nuevoServicio) {
        servicios.add(nuevoServicio);
    }

    /**
     * Elimina un servicio de la lista de servicios ofrecidos. Si el servicio no existe, imprime un mensaje de error
     * 
     */
    public void removeServicios(String servicio) {
        if (servicios.contains(servicio)) {
            servicios.remove(servicio);
        } else {
            System.out.println("El servicio no existe en la lista de servicios.");
        }

    }
    
    /* 
    Igual nos sirve en un futuro
    public void guardarFoto (String rutaArchivo) throws IOException {
        ImageIO.write(imagen, "jpg", new File(rutaArchivo));
    }
    */

    /**
     * Devuelve la lista de fotos del inmueble, no una copia
     * 
     * @return lista de fotos del inmueble en forma de ArrayList de ImageIcon
     */
    public ArrayList<ImageIcon> getFotos() {
        return fotos;
    }

    /**
     * Establece la lista de fotos del inmueble
     *
     * @param fotos nueva lista de fotos del inmueble en forma de ArrayList de ImageIcon
     */
    public void setFotos(ArrayList<ImageIcon> fotos) {
        this.fotos = fotos;
    }

    /**
     * Añade una foto a la lista de fotos del inmueble a partir de la ruta del archivo, y maneja las excepciones que puedan surgir.
     *
     * @param rutaArchivo ruta del archivo de la foto a añadir
     */
    public void addFoto(String rutaArchivo) {
        //Image imagen;
        try {
            File archivo = new File(rutaArchivo);
            if (!archivo.exists()) {
                throw new IOException("El archivo no existe");
            } else if (!archivo.isFile()) {
                throw new IOException("La ruta no corresponde a un archivo");
            } else if (!archivo.canRead()) {
                throw new IOException("No se puede leer el archivo");
            } else if (!archivo.getName().endsWith(".jpg") && !archivo.getName().endsWith(".jpeg") && !archivo.getName().endsWith(".png")) {
                throw new IOException("El archivo no es una imagen");
            }
            
            Image imagen = ImageIO.read(archivo);
            ImageIcon img = new ImageIcon(imagen);
            fotos.add(img);
        } catch (IOException ioe) {
            // Imprimir mensaje de error resaltado
            System.err.println("Error IO:" + ioe.getMessage());
            ioe.printStackTrace();
        }
    }

    /**
     * Añade una foto a la lista de fotos del inmueble a partir de un objeto ImageIcon
     *
     * @param foto foto a añadir a la lista de fotos del inmueble de tipo ImageIcon
     */
    public void addFoto(ImageIcon foto) {
        fotos.add(foto);
    }

    /**
     * Elimina una foto de la lista de fotos del inmueble. Si la foto no existe, imprime un mensaje de error
     *
     * @param foto foto a eliminar de la lista de fotos del inmueble de tipo ImageIcon
     */
    public void removeFoto(ImageIcon foto) {
        if (fotos.contains(foto)) {
            fotos.remove(foto);
        } else {
            System.out.println("La foto no existe en la lista de fotos.");
        }
    }


    /* @code
     * Para el frontend
        JFrame ventana = new JFrame();
        for (ImageIcon imagen : fotos) {
            JLabel etiquetaImagen = new JLabel();
            etiquetaImagen.setIcon(new ImageIcon(imagen));

            ventana.add(etiquetaImagen);
        }
     */

    /**
     * Devuelve la calificacion de la vivienda redondeada a un decimal
     *
     * @return la calificacion de la vivienda en forma de double
     */
    public double getCalificacion() {
        return Math.round(calificacion * 10) / 10.0;
    }

    /**
     * Actualiza la calificacion de la vivienda a partir de las reseñas. Si no hay reseñas, imprime un mensaje de error
     *
     */
    public void updateCalificacion() {
        if (reseñas.isEmpty()) {
            System.out.println("No hay reseñas para calcular la calificación de la vivienda.");
            return;
        } else {
            double calificacionTotal = 0;
            for (Reseña reseña : reseñas) {
                calificacionTotal += reseña.getCalificacion();
            }
            try {
                this.calificacion = calificacionTotal / reseñas.size();
            } catch (ArithmeticException e) {
                // Manejo division entre zero error
                System.err.println("Error: Division by zero => No hay reseñas para calcular la calificación de la vivienda");
                System.err.println("    Codigo de error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    /**
     * Devuelve la lista de reseñas de la vivienda
     *
     * @return lista de reseñas de la vivienda en forma de ArrayList de Reseña
     */
    public ArrayList<Reseña> getReseñas() {
        return reseñas;
    }

    /**
     * Establece la lista de reseñas de la vivienda, y actualiza la calificacion de la vivienda y el atributo superanfitrion del anfitrion
     *
     * @param reseñas nueva lista de reseñas de la vivienda en forma de ArrayList de Reseña
     */
    public void setReseñas(ArrayList<Reseña> reseñas) {
        this.reseñas = reseñas;
        this.updateCalificacion();
        anfitrion.updateSuperanfitrion();
    }

    /**
     * Añade una reseña a la lista de reseñas. Y actualiza la calificacion de la vivienda y el atributo superanfitrion del anfitrion
     *
     * @param reseña nueva reseña de la vivienda del cliente de tipo Reseña
     */ 
    public void addReseña(Reseña reseña) {
        reseñas.add(reseña);
        this.updateCalificacion();
        anfitrion.updateSuperanfitrion();
    }

    /**
     * Elimina una reseña de la lista de reseñas. Si la reseña no existe, imprime un mensaje de error, y actualiza la calificacion de la vivienda 
     * y el atributo superanfitrion del anfitrion
     *
     * @param reseña reseña a eliminar de la vivienda de tipo Reseña
     */
    public void removeReseña(Reseña reseña) {
        if (reseñas.contains(reseña)) {
            reseñas.remove(reseña);
            this.updateCalificacion();
            anfitrion.updateSuperanfitrion();
        } else {
            System.out.println("La reseña no existe en la lista de reseñas.");
        }
    }
    
    /**
     * Devuelve una representacion en forma de String de la vivienda
     *
     * @return representacion de la vivienda en forma de String
     */
    @Override
    public String toString() {
        return "Inmueble{" +
            "titulo='" + titulo + '\'' +
            ", direccion=" + direccion +
            ", huespedesMax=" + huespedesMax +
            ", habitaciones=" + habitaciones +
            ", camas=" + camas +
            ", baños=" + baños +
            ", tipoInmueble=" + tipoInmueble +
            ", precioNoche=" + precioNoche +
            ", servicios=" + servicios +
            ", calificacion=" + calificacion +
            '}';
    }  
    
}
