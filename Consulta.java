package Hospital;

public class Consulta {
    private String data;
    private String hora;
    private Paciente paciente;

    public Consulta(String data, String hora, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}
