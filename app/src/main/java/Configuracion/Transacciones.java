package Configuracion;

public class Transacciones {

    // Nombre de la base de datos
    public static final String DBName = "DBContactPerson";

    // Creacion de las tablas de las bases de datos
    public static final String Tableentrevistas = "entrevistas";

    // Creacion de los campos de la base de datos
    public static final String id = "id";
    public static final String descripcion = "descripcion";
    public static final String nombres = "nombres";
    public static final String telefonos = "telefonos";
    public static final String notas = "notas";
    public static final String imagen = "imagen";

    // Creación de la sentencia SQL para crear la tabla entrevistas
    public static final String CreateTableentrevistas = "CREATE TABLE " + Tableentrevistas + " ("
            + id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + descripcion + " TEXT, "
            + nombres + " TEXT, "
            + telefonos + " TEXT, "
            + notas + " TEXT, "
            + imagen + " BLOB); ";

    // Sentencia SQL para eliminar la tabla entrevistas
    public static final String DropTableentrevistas = "DROP TABLE IF EXISTS " + Tableentrevistas + ";";

    // Sentencia SQL para seleccionar todos los registros de la tabla entrevistas
    public static final String SelectAllsentrevistas = "SELECT * FROM " + Tableentrevistas + ";";
}
