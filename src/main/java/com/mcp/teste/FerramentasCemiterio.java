package com.mcp.teste;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.stereotype.Service;

@Service
public class FerramentasCemiterio {

    @McpTool(
        name = "consultar_disponibilidade",
        description = "Consulta a disponibilidade fictícia de jazigos. "
                    + "Apenas demonstração, sem acesso ao banco."
    )
    public String consultarDisponibilidade() {
        return """
            Cemitério Municipal Exemplo:
            Total de jazigos: 500
            Ocupados: 380
            Disponíveis: 120
            """;
    }
}
