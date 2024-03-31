package Hospital;

public class Main {
    public static void main(String[] args) {
        // Criando pacientes
        Paciente paciente1 = new Paciente("João", "123.456.789-00");
        Paciente paciente2 = new Paciente("Maria", "987.654.321-00");

        // Criando consultas
        Consulta consulta1 = new Consulta("2024-03-27", "10:00", paciente1);
        Consulta consulta2 = new Consulta("2024-03-28", "11:00", paciente2);

        // Criando médico
        Medico medico = new Medico("Dr. Silva", "CRM12345");

        // Agendando consultas para o médico
        medico.agendarConsulta(consulta1);
        medico.agendarConsulta(consulta2);

        // Exibindo consultas marcadas para o médico
        medico.exibirConsultasMarcadas();

        // Cancelando uma consulta
        medico.cancelarConsulta(consulta1);

        // Exibindo consultas marcadas após o cancelamento
        medico.exibirConsultasMarcadas();

    }
}
