package javabnb.backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.text.DecimalFormat;
//import java.util.Arrays;

/**
 * Clase que representa una reserva de un inmueble realizada por un cliente particular.
 * 
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Reserva implements Serializable{
    
    private Inmueble inmueble;
    private double importe; //el importe se calcula a partir de las fechas
    private TarjetaCredito tarjeta; 
    private ClienteParticular cliente;
    private LocalDate fechaReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    /**
     * Constructor de la clase Reserva se deben de introducir los datos de la reserva: inmueble, fecha de entrada, fecha de salida, fecha de reserva, tarjeta de crédito, importe
     * La fecha de reserva se establece automáticamente al día de la creación de la reserva(momento en el que se ejecuta el constructor)
´    *
     * @param inmueble objeto de la clase Inmueble
     * @param tarjeta objeto de la clase TarjetaCredito
     * @param fechaEntrada fecha de entrada de tipo LocalDate
     * @param fechaSalida fecha de salida de tipo LocalDate
     * @param cliente objeto de la clase ClienteParticular
     */
    public Reserva(Inmueble inmueble, TarjetaCredito tarjeta, ClienteParticular cliente, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.inmueble = inmueble;
        this.tarjeta = tarjeta;
        this.cliente = cliente;
        this.fechaReserva = LocalDate.now();
        try {
            if (comprobarFecha(fechaSalida, fechaEntrada)) {
                throw new IllegalArgumentException("La fecha de entrada debe ser anterior a la fecha de salida");
            }
            if (!GestorInmueble.inmuebleDisponible(inmueble,fechaEntrada,fechaSalida)) {
                throw new IllegalArgumentException("La fecha indicada ya ha sido reservada");
            }
            this.fechaEntrada = fechaEntrada;
            this.fechaSalida = fechaSalida;
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importe = calcularImporte();
        cliente.addReserva(this);
        GestorInmueble.addReserva(this);
    }
    

    /**
     * Devuelve el valor de inmueble
     * 
     * @return el valor de inmueble de tipo Inmueble
     */
    public Inmueble getInmueble() {
        return inmueble;
    }

    /**
     * Establece el valor de inmueble
     * 
     * @param inmueble nuevo valor inmueble de tipo Inmueble
     */
    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    /**
     * Devuelve el valor de importe
     * 
     * @return el valor de importe de tipo double
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Establece el valor de importe
     * 
     * @param importe nuevo valor de importe de tipo double
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    /**
     * Devuelve el valor de tarjeta
     * 
     * @return el valor de tarjeta de tipo TarjetaCredito
     */
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    /**
     * Establece el valor de tarjeta
     * 
     * @param tarjeta nuevo valor de tarjeta de tipo TarjetaCredito
     */
    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * Devuelve el valor de cliente
     * 
     * @return el valor de cliente de tipo ClienteParticular
     */
    public ClienteParticular getCliente() {
        return cliente;
    }

    /**
     * Establece el valor de cliente
     * 
     * @param cliente nuevo valor cliente de tipo ClienteParticular
     */
    public void setCliente(ClienteParticular cliente) {
        this.cliente = cliente;
    }

    /**
     * Devuelve el valor de fechaReserva
     * 
     * @return el valor de fechaReserva de tipo LocalDate
     */
    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Establece el valor de fechaReserva
     * 
     * @param fechaReserva nuevo valor fechaReserva de tipo LocalDate
     */
    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * Devuelve el valor de fechaEntrada
     * 
     * @return el valor de fechaEntrada de tipo LocalDate
     */
    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     *Establece el valor de fechaEntrada
     * 
     * @param fechaEntrada nuevo valor fechaEntrada de tipo LocalDate
     */
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * Devuelve el valor de fechaSalida
     * 
     * @return el valor de fechaSalida de tipo LocalDate
     */
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    /**
     *Establece el valor de fechasalida
     * 
     * @param fechaSalida nuevo valor fechaSalida de tipo LocalDate
     */
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Calcula el importe de la reserva en función de los días de estancia y el precio por noche del inmueble 
     * 
     * @return el importe de la reserva de tipo double
     */
    public double calcularImporte(){
        long dias = ChronoUnit.DAYS.between(this.fechaEntrada, this.fechaSalida);
        double precio = inmueble.getPrecioNoche() * dias;
    
        if (cliente.isVip()) {
            precio = 0.9*precio; }
        return precio;
        }
    
    /**
     * Comprueba que la fecha de fin ocurre despues de la fecha de inicio
     * 
     * @param inicio
     * @param fin
     * @return true si la fecha de inicio ocurre antes que la de fin, false en el caso contrario
     */
    public boolean comprobarFecha (LocalDate inicio, LocalDate fin){
        return fin.isAfter(inicio);
    }

    /**
     *  Genera un fichero de texto con los datos de la reserva
     * 
     * @param reserva objeto de la clase Reserva
     * @throws IOException 
     */
    public static void generarFactura(Reserva reserva) throws IOException {
        double importefactura = reserva.calcularImporte(); 
        long numeroTarjeta = reserva.getCliente().getTarjetaCredito().getNumeroTarjeta();
        DecimalFormat df = new DecimalFormat("#.##");
        LocalDate fecha = reserva.getFechaReserva();
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yy");        
        String fn = fecha.format(formatoCorto);
        String rutaFicheroFactura = "./Facturas/Factura--" + reserva.getInmueble().getTitulo().replace(' ','-')+ "__(" + fn.replace('/', '_') + ").txt";
        try {
            File dirFacturas = new File("./Facturas");

            if (!dirFacturas.exists()) {
                dirFacturas.mkdir();
            }
            
            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {
                salida.println("---------------------------- Factura de reserva ---------------------------");
                salida.println("\n");
                salida.println("-------------------------------- Fecha: " + fn + " -------------------------------");
                salida.println("\n");
                salida.println("Fecha de entrada: " + reserva.getFechaEntrada().format(formatoCorto));
                salida.println("Fecha de salida: "+ reserva.getFechaSalida().format(formatoCorto));
                salida.println("\n");
                salida.println("-------------------------------- Inmueble -------------------------------");
                salida.println("\n");
                salida.println("Nombre: " + reserva.getInmueble().getTitulo());
                salida.println("Dirección: " + reserva.getInmueble().getDireccion().toString());
                salida.println("Tipo: " + reserva.getInmueble().getTipoInmueble());
                salida.println("Huéspedes máximos: " + reserva.getInmueble().getHuespedesMax());
                salida.println("Habitaciones: " + reserva.getInmueble().getHabitaciones());
                salida.println("Camas: " + reserva.getInmueble().getCamas());
                salida.println("Baños: " + reserva.getInmueble().getBaños());
                salida.println("Servicios adicionales: " + String.join(", ", reserva.getInmueble().getServicios()));
                salida.println("\n");
                salida.println("--------------------------DATOS DEL CLIENTE-----------------------------------");
                salida.println("\n");
                salida.println("Nombre: " + reserva.getCliente().getNombre());
                salida.println("DNI: " + reserva.getCliente().getDni());
                salida.println("Teléfono: " + reserva.getCliente().getTelefono());
                salida.println("Correo: " + reserva.getCliente().getCorreo());
                salida.println("Tarjeta: " + TarjetaCredito.ocultarTarjeta(numeroTarjeta)); 
                salida.println("\n");
                salida.println("-----------------------------IMPORTE--------------------------------------");
                salida.println("\n");
                salida.println("Días de estancia: " + ChronoUnit.DAYS.between(reserva.getFechaEntrada(), reserva.getFechaSalida()));
                salida.println("Precio por noche: " + df.format(reserva.getInmueble().getPrecioNoche()) + "€");  
                if (reserva.getCliente().isVip()) { 
                    salida.println("Descuento VIP: -" + df.format(importefactura/0.9*0.1) + "€");
                }
                salida.println("Precio final: " + df.format(importefactura) + "€");
                salida.println("\n");
                salida.println("-------------------------------------------------------------------------------");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }

    /**
     * Método que crea un fichero de texto con los datos de la reserva dada una ruta de fichero
     * 
     * @param ruta donde se guardará el fichero
     * @throws IOException 
     */
    public void generarFactura(String ruta) throws IOException {
        double importefactura = importe; 
        long numeroTarjeta = cliente.getTarjetaCredito().getNumeroTarjeta();
        DecimalFormat df = new DecimalFormat("#.##");
        LocalDate fecha = fechaReserva;
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yy");        
        String fn = fecha.format(formatoCorto);
        String rutaFicheroFactura = ruta + "/Factura--" + inmueble.getTitulo().replace(' ','-')+ "__(" + fn.replace('/', '_') + ").txt";
        try {
            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {
                salida.println("---------------------------- Factura de reserva ---------------------------");
                salida.println("\n");
                salida.println("-------------------------------- Fecha: " + fn + " -------------------------------");
                salida.println("\n");
                salida.println("Fecha de entrada: " + fechaEntrada.format(formatoCorto));
                salida.println("Fecha de salida: "+ fechaSalida.format(formatoCorto));
                salida.println("\n");
                salida.println("-------------------------------- Inmueble -------------------------------");
                salida.println("\n");
                salida.println("Nombre: " + inmueble.getTitulo());
                salida.println("Dirección: " + inmueble.getDireccion().toString());
                salida.println("Tipo: " + inmueble.getTipoInmueble());
                salida.println("Huéspedes máximos: " + inmueble.getHuespedesMax());
                salida.println("Habitaciones: " + inmueble.getHabitaciones());
                salida.println("Camas: " + inmueble.getCamas());
                salida.println("Baños: " + inmueble.getBaños());
                salida.println("Servicios adicionales: " + String.join(", ", inmueble.getServicios()));
                salida.println("\n");
                salida.println("--------------------------DATOS DEL CLIENTE-----------------------------------");
                salida.println("\n");
                salida.println("Nombre: " + cliente.getNombre());
                salida.println("DNI: " + cliente.getDni());
                salida.println("Teléfono: " + cliente.getTelefono());
                salida.println("Correo: " + cliente.getCorreo());
                salida.println("Tarjeta: " + TarjetaCredito.ocultarTarjeta(numeroTarjeta));
                salida.println("\n");
                salida.println("-----------------------------IMPORTE--------------------------------------");
                salida.println("\n");
                salida.println("Días de estancia: " + ChronoUnit.DAYS.between(fechaEntrada, fechaSalida));
                salida.println("Precio por noche: " + df.format(inmueble.getPrecioNoche()) + "€");  
                if (cliente.isVip()) { 
                    salida.println("Descuento VIP: -" + df.format(importefactura/0.9*0.1) + "€");
                }
                salida.println("Precio final: " + df.format(importefactura) + "€");
                salida.println("\n");
                salida.println("-------------------------------------------------------------------------------");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }

    /**
     *  toString de la clase Reserva. 
     * 
     * @return String con los datos de la reserva
     */
    @Override
    public String toString() {
        return "Reserva{" + "Inmueble= " + inmueble.getTitulo() + ", importe= " + importe + ", tarjeta= " + tarjeta.getNumeroTarjeta() + ", cliente= " + cliente.getNombre() +", fecha de reserva= " + fechaReserva +  ",fechade entrada= "+ fechaEntrada + ", fecha de salida= " + fechaSalida +"}";
    }
}

