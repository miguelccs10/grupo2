## Por planejamento do projeto, espera-se que os seguintes objetivos sejam atingidos:

### - Seção 1 - Introdução:
A gestão manual de reservas de quadras esportivas frequentemente resulta em conflitos de agendamento, como a locação do mesmo espaço para diferentes usuários no mesmo horário. Esse problema causa transtornos. A ausência de um sistema automatizado e centralizado dificulta a organização, a transparência e a confiabilidade no processo de aluguel de quadras. Um sistema digitalizado pode resolver essas questões, oferecendo maior comodidade aos usuários e eficiência aos proprietários.
O problema central é a falta de um sistema que gerencie de forma eficiente e confiável as reservas de quadras esportivas, garantindo que não haja sobreposição de horários e simplificando o processo de escolha e pagamento. Atualmente, os processos manuais ou parcialmente automatizados resultam em erros de agendamento, falta de clareza sobre horários disponíveis e dificuldade para os usuários confirmarem reservas.
A motivação para o desenvolvimento deste sistema surge da necessidade de proporcionar uma solução prática e acessível para usuários que desejam alugar quadras esportivas, bem como para proprietários que buscam gerenciar seus espaços de forma eficiente. O sistema visa melhorar a experiência do usuário, reduzir erros operacionais e promover a automação do processo de reservas, contribuindo para a organização e a satisfação de todas as partes envolvidas.

---

### - Seção 2 - Plano:

**Objetivo geral:**  

Desenvolver um sistema de software que permita aos usuários cadastrarem-se, consultarem a disponibilidade de quadras esportivas, escolherem horários e tipos de quadras, visualizarem os valores associados e realizarem a reserva de forma automatizada, garantindo que não haja conflitos de agendamento.

**Objetivos Específicos:** 

Implementar um sistema de cadastro de usuários com informações básicas (nome e número de telefone) para autenticação e personalização.
Criar uma interface que exiba os tipos de quadras disponíveis (ex.: vôlei, futebol, basquete), horários livres e os respectivos preços.
Desenvolver uma lógica de back-end que impeça a sobreposição de reservas no mesmo horário e quadra.
Integrar um módulo de confirmação de reservas com notificações para o usuário.
Garantir a usabilidade do sistema com uma interface amigável e intuitiva para o front-end.
Documentar o desenvolvimento do projeto, incluindo modelagem, implementação e testes.

---

### - Seção 3 - Divisão de tarefas:
Tarefas (issues), atribuição de tarefa, responsabilidades, prazos, etc.

- [Diniz](https://github.com/dinizanjos): Documentação.  
- [Khalil](https://github.com/Khalielly): Back-end.  
- [Heitor](https://github.com/Heitortxl): VAlidação e Testes.  
- [Miguel](https://github.com/miguelccs10) e [Clara](https://github.com/claraleones): front-end / gerenciamento

---

### - Seção 4 - Modelagem inicial:
A modelagem do sistema será composta por:

## - Diagramas de classes

Esse diagrama foi feito por: [Khalil](https://github.com/Khalielly)
Essa é apenas a primeira versão do diagrama.

![Diagrama UML](https://www.plantuml.com/plantuml/png/ZLMnSjim3Dtv5JmlLPjeoAfBSyavkNRmaCPfTrY2RVOeKY4X3qapzmlw1Htw8VwnYX9CIP6JInQ500Yyzm2Obvx0KLrgGOeqoci56mSbo0BbN8Ftw6KgbyeJTiOlwD3a2aeqP8DXONFO_zl_RG_VQYWSU24qhaas0KvjjYGBvJ0dPOqG7-JdOtzolhXQBc-MnxqY3r3aTr-3KrO-2IbFL959PKX8cHfROYQNv9JPX3DXKzwQaGrBK7fey6YsC3Ia8UiQ7j7DeG1FpYOVCxcpgWWEg0aDgHnSCafrAaU9cXihQpM22PSsI3SXE2IAXKuyqZqZJ5v2FLHy5imvo5jOrt9EqHJeCBT3sBcfVaveRBXBZXioPB9JlWQj7i5TRPg4NIVRY8NoT7w77jqEBa9etWbnI9CSHKUn9sbUhKTGnkKuyxHK59uDoKDRBkDnEfLRwqAHJ7xj_caIS6Y7qkIe8TvstJV6z3s9mED4FxrBikZZ2HmvMQJeJEhkcqas36ArylIs41mIGN14Txxe2NI6oIgGgaRJKOLnkRKk29V9mjOhZS7k2QZsmqZT3LfscBXEc0ZeMldA6hLIMXLGO580DGclWV00aNlJaW3YdY_REecnExiSbHofIxS3c84p0uriEVU4ReyYdBOjoNjLOkiR8uv3q4ycEhLM-PJRU8bNsZxKs8_Ng9qhTEmnlOj9DR202RKG0x2U4gSxIebzFRCTQElkBO5-gudCAtUgHwiF6vhrotegtx5WKO7fWhtmMhDMhWGtiBC2tFtuwyVc7v7DiLxVmePVbx4qh4Aym5h5y5wj4iaMTgABmsucuuqfuBajAsTtO0W7g9zVVxRkRXPN-z_xFw--NEBmQ9t_IjEuMoDZx8iGx9UpivbiFBDFiyEYPxAotjTAnEX1K1ocJ399mPRM6uBE1faShj5Xwb4UYulBbabZ1H-EvgdG4Peyf8cQ3WCvTwneA8HUeYdgKly7)


```plantuml
@startuml
title Diagrama de Classes - Sistema de Gerenciamento de Locação de Quadras

left to right direction

' ===================== CLASSES =====================
class Usuario {
  +id: int
  -nome: String
  -telefone: String
  -email: String
  -senha: String
  --
  +fazerCadastro(): void
  +autenticar(email: String, senha: String): boolean
  +getEmail(): String
  +setTelefone(telefone: String): void
}

class Locador {
  -endereco: String
  -cnpj: String
  --
  +gerenciarQuadras(): void
  +visualizarAgendamentos(): List<Reserva>
  +cadastrarQuadra(): void
}

class Locatario {
  -cpf: String
  --
  +visualizarReservas(): List<Reserva>
  +fazerReserva(quadra: Quadra, horario: Horario): Reserva
  +cancelarReserva(reserva: Reserva): boolean
}

class Sistema {
  --
  +gerenciarQuadras(): void
  +gerenciarUsuarios(): void
  +cadastrarUsuario(usuario: Usuario): void
  +listarReservas(): List<Reserva>
  +listarQuadras(): List<Quadra>
}

class Quadra {
  +id: int
  -tipo: String
  -precoPorHora: double
  -status: String
  -locador: Locador
  --
  +listarDisponibilidade(data: Date): List<Horario>
  +atualizarStatus(novoStatus: String): void
  +getPrecoPorHora(): double
}

class Horario {
  +id: int
  -data: Date
  -hora: Time
  -disponibilidade: boolean
  --
  +verificarDisponibilidade(): boolean
  +bloquearReserva(): void
  +liberarResernva(): void
  +getDataHora(): DateTime
}

class Reserva {
  +id: int
  -dataReserva: Date
  -valorTotal: double
  -status: String
  --
  +criarReserva(locatario: Locatario, quadra: Quadra, horario: Horario): boolean
  +cancelarReserva(): boolean
  +confirmar(): boolean
  +getStatus(): String
  +getValorTotal(): double
}

class Pagamento {
  +id: int
  -valor: double
  -dataPagamento: Date
  -metodo: String
  --
  +realizarPagamento(): boolean
  +getComprovante(): String
}

' ===================== RELAÇÕES =====================

Usuario <|-- Locador
Usuario <|-- Locatario

Locador "1" -- "*" Quadra : possui
Locatario "1" -- "*" Reserva : realiza
Reserva "*" -- "1" Quadra : refere-se a
Reserva "*" -- "1" Horario : no
Horario "*" -- "1" Quadra : pertence a
Pagamento "*" -- "1" Reserva : referente a
@enduml
```
- Diagramas de sequência;

![Diagrama de sequência](https://www.plantuml.com/plantuml/png/VP8nJiGm44NxdC9ba98BRB7Q0Y4A6k04i_RixaY99ypO4U8sY8AAK-HYX2GEMGdJZjxx_b_9GGD8Y6rJW0qive4jE9QY6wzagGCVp3Dfm1QsjuaBmxiG5yNYc7gVKBCp3P_9br7Z15L6qL_WfaX0FSB9sndB_aJIml0vVB1nEDkPPEM6B0MGnmXEG6z9E_RK8scvUM2_wJXQnwWsesou-de3QO2VEY-pPjolbrc2htGa-Kl8hS46BR5FtKfo-H4z2ft8WjopJ3UTyEo0IyAM8iDNhdgMJQMlW-_W3UK95QM7Cfdvte9dqY2mAkIMtCgGcuURQgtmpoAP0zO_na7cGoGmFJs21_Gkjiqt)



- Casos de uso;

Esse diagrama foi feito por: Ana Clara Leones
Esta é apenas a primeira versão do diagrama
![Diagrama de caso de uso](https://www.plantuml.com/plantuml/png/RP0zJWCn48LxdsAqVOhyX185HNGqW7A0mPui8tazn3DEWpWCP-5YE8iHoqBvdhxtnduxDSnMXkWY7GrC87F_R10uapUMv1nwamntuZ58dYZxUCyiq9n7LgC1dRlaCFMHeBk9fIyK8H2S2eQCsi6h0oXA7hK2jsSspE0b7IERN43yodI02eVzLQKFt_GU0whb6hWVsngpROqpHgfPnYSsRZdb7aWfdojscbQjVbL9qXAjCe7rHH8_SUI0WHgy_lVk_Eh6lRcs3ImMr-EVVjPhrlQljNHjyQPNCxsUwOtRKGfbY9y0)
  
