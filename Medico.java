package Hospital;

import java.util.ArrayList;

public class Medico {
    private String nome;
    private String crm;
    private ArrayList<Consulta> consultas;

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
        this.consultas = new ArrayList<>();
    }

    public void agendarConsulta(Consulta consulta){
        consultas.add(consulta);
    }
    public void cancelarConsulta(Consulta consulta){
        consultas.remove(consulta);
    }
    public void exibirConsultasMarcadas() {
        System.out.println("Consultas marcadas para o médico " + nome + " (CRM: " + crm + "):");
        for (Consulta consulta : consultas) {
            System.out.println("Data: " + consulta.getData() + ", Hora: " + consulta.getHora() +
                    ", Paciente: " + consulta.getPaciente().getNome());
        }
    }
}
