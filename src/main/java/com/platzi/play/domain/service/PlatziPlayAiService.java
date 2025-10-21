package com.platzi.play.domain.service;

import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;
import  dev.langchain4j.service.UserMessage;

@AiService
public interface PlatziPlayAiService {

    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de Gestion de Peliculas  {{plataform}}
            usa menos de 120 caracteres y hazlo con el estilo de platzi.
            """)
    String generateGreeting(@V("plataform") String plataform);
}
