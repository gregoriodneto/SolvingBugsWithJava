📌 Descrição da Implementação

Foi implementado um sistema de recompensas para um servidor de jogo utilizando Java puro, aplicando o padrão Strategy para encapsular regras de negócio específicas por tipo de jogador.

O fluxo simula uma API simples com:

Entrada de dados via camada de “controller”

Processamento da regra de negócio em um serviço

Estratégias específicas para cálculo de recompensa

Cada tipo de jogador (Normal, VIP, Admin) possui sua própria implementação de estratégia, eliminando condicionais de regra de negócio no serviço e tornando o sistema extensível para novos tipos de jogador sem impacto nas camadas centrais.