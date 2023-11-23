package miPrincipal;

public class Fecha {
    // Atributos
    private int year;
    private int mes;
    private int dia;

    public Fecha( int year, int mes, int dia)
    {
        setYear( year );
        setMes( mes );
        setDia( dia );
    }

    // Metodos set/get
    public void setYear( int year )
    {
        // El atributo year debe ser mayor o igual que 0 (cero)
        // Caso contrario, lanzar excepcion tipo FechaException
    }

    public void setMes( int mes )
    {
        // El mes debe estar en el rango de 1 - 12
        // Caso contrario, lanzar excepcion tipo FechaException
    }

    public void setDia( int dia )
    {
        // El dia debe estar en el rango de 1 al último del mes correspondiente
        // No es necesario validar bisiesto
        // Caso contrario, lanzar excepcion tipo FechaException
    }

    public int getYear()
    {
        return 0;
    }

    public int getMes()
    {
        return 0;
    }

    public int getDia()
    {
        return 0;
    }

    // Metodo toString()
    public String toString()
    {
        // Regresar solo la cadena con formato dd/mm/yyyy
        String resultado = String.format("");
        return resultado;
    }
}