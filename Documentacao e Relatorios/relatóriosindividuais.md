## Ana Clara Leones da Silva

Quando o professor anunciou que realizaríamos um projeto de desenvolvimento de software, sugeri a criação de um sistema de reservas de quadras esportivas, motivado por uma experiência pessoal em que presenciei a locação da mesma quadra para duas pessoas diferentes, o que gerou conflitos e demonstrou a necessidade de uma solução automatizada e eficiente. Essa vivência me inspirou a propor um sistema que organizasse o processo de cadastro, autenticação e visualização de informações para locadores e locatários, garantindo maior confiabilidade e organização no gerenciamento de quadras.

Minha primeira contribuição foi a elaboração de um documento inicial contendo a motivação do projeto, um plano de desenvolvimento e o primeiro diagrama de casos de uso. Detalhei a justificativa para o sistema, descrevendo como ele atenderia às necessidades de locadores e locatários, e propus um plano de desenvolvimento incremental, que incluía a modelagem inicial. O diagrama de casos de uso inicial delineou as interações principais, como cadastro, login e visualização de quadras, servindo como base para a evolução do projeto.

Além disso, colaborei com sugestões na modelagem inicial das telas em conjunto com o [Miguel](https://github.com/miguelccs10), como a necessidade de uma tela de login intuitiva. Essas sugestões foram fundamentais para alinhar o design da interface com os requisitos funcionais, garantindo usabilidade e clareza.

Iniciei a modelagem da camada Model, definindo as classes principais (Usuario, Locador, Locatario, Database, UsuarioRepositorio). Essa modelagem inicial estabeleceu a estrutura de dados do sistema.

Com base no escopo da documentação fornecida pelo [Diniz](https://github.com/dinizanjos), que demonstrava a visão geral do sistema, e na implementação da estrutura Model-View-Controller (MVC) realizada pelo [Miguel](https://github.com/miguelccs10) e pela [Khalil](https://github.com/Khalielly), finalizei a documentação do software. Essa documentação incluiu seções sobre funcionalidades, tecnologias, instalação, uso, diagramas UML (classes, casos de uso, sequência e pacotes) e padrões de implementação.

Minhas contribuições, combinadas com o trabalho em equipe, resultaram em um sistema que atende aos requisitos iniciais de cadastro, autenticação e visualização de quadras fictícias, utilizando Java, JavaFX e ORMLite. A experiência reforçou a importância da colaboração e da aplicação dos princípios de Programação Orientada a Objetos, além de destacar a relevância de uma documentação clara para o sucesso do projeto.

## Danielly

# Relatório Pessoal – Desenvolvimento do Sistema de Locação de Quadras

## Introdução

Durante o desenvolvimento do sistema de locação de quadras, participei ativamente em diversas frentes do projeto, desde a modelagem inicial até a implementação do backend, passando pela organização da equipe e contribuição na documentação geral. Nosso objetivo foi propor uma solução funcional e acessível para facilitar a locação de quadras esportivas, considerando que não encontramos ferramentas disponíveis que atendessem bem a essa demanda.

## Atividades Realizadas

### 1. Modelagem

- Desenvolvi o **diagrama de classes**, estruturando a arquitetura base do sistema.
- Colaborei na construção do **diagrama de casos de uso**, ajudando a mapear os principais fluxos e funcionalidades.

### 2. Implementação Backend

- Fui responsável pela implementação das **classes modelo** (`Usuario`, `Locador`, `Locatario`, `Reserva`, entre outras), utilizando ORMLite para integração com banco de dados.
- Desenvolvi parte dos **controllers**, conectando a lógica de negócio com a interface do usuário.
- Auxiliei na **estruturação e integração do banco de dados**.
- Colaborei nas decisões sobre as **credenciais utilizadas na autenticação**, propondo abordagens seguras e funcionais.

### 3. Documentação e Organização

- Atuei como **líder do projeto**, organizando as tarefas e acompanhando a execução das entregas.
- Contribuí com a **revisão e complementação da documentação**, garantindo clareza e padronização técnica.
- Supervisei o progresso do grupo, **identificando pendências e redistribuindo atividades** quando necessário.

## Conclusão

Minha participação neste projeto envolveu tanto a parte técnica quanto a liderança e organização da equipe. Pude aplicar conhecimentos de modelagem, desenvolvimento e gestão de projetos, fortalecendo minhas habilidades em trabalho colaborativo e desenvolvimento de sistemas reais.


## Diniz

Durante o desenvolvimento do projeto de Programação Orientada a Objetos (POO), cuja proposta consistia na criação de um aplicativo para locação de quadras esportivas, fui responsável pela elaboração da documentação do sistema. Essa atividade teve como objetivo principal registrar de forma clara e estruturada as diretrizes iniciais do projeto, servindo como base para o trabalho dos demais integrantes do grupo.
O documento elaborado inicialmente reuniu informações fundamentais, tais como os objetivos do sistema, a proposta de funcionamento, a estrutura básica das classes, além de sugestões de funcionalidades futuras a serem implementadas. Esse material serviu como referência comum entre os membros, contribuindo significativamente para a organização do projeto e para o alinhamento das etapas de desenvolvimento.
A documentação também exerceu um papel essencial na comunicação interna do grupo, permitindo que todos tivessem uma visão abrangente e atualizada do andamento do projeto. Após sua criação, o documento foi disponibilizado de forma colaborativa, possibilitando que cada integrante adicionasse descrições mais específicas de suas respectivas contribuições. Isso garantiu maior precisão e completude ao material final.
Portanto, a documentação não apenas auxiliou na coordenação e planejamento das atividades, mas também forneceu um norte técnico para as decisões tomadas ao longo do processo de desenvolvimento, consolidando-se como uma ferramenta estratégica dentro do projeto.

## Heitor

**RELATÓRIO DE DESEMPENHO INDIVIDUAL - Heitortxl**

1.Atuação e objetivos

Em nosso projeto, fui designado para validação e testes para garantir um bom funcionamento do sistema no geral e fazer atualizações que melhorassem o desempenho, escalabilidade e segurança do mesmo.

2.Contribuições técnicas

Minha primeira contribuição foi a confecção do primeiro diagrama de sequências juntamente com o [Diniz](https://github.com/dinizanjos), que foi importante para vizualização de como se daria a interação dos locadores e locatários com o sistema.
Além disso, ao final do projeto contribui com a refatoração do código na classe main, para impedir a criação de múltiplas instâncias do banco de dados e assim tornar o projeto mais escalável.

3. Aprendizados
 Esse projeto foi de grande importância para meu aprendizado por me colocar de frente com um problema real e me fazer investigar a melhor forma possível para resolvê-lo, além de melhorar minha habilidade em procurar pontos de melhoria nos códigos,implementar mudanças para melhorar o desempenho do mesmo e trabalhar em equipe mantendo o repositório organizado para que todos possam navegar e adicionar suas contribuições.

## Miguel

**RELATÓRIO DE DESEMPENHO INDIVIDUAL - miguelccs10**

**1. Resumo de Atuação e Objetivos**

No projeto, fui designado para as funções de Desenvolvedor Front-end e Gerente de Projeto Técnico. Meu objetivo principal foi traduzir os requisitos do sistema em uma aplicação funcional, construindo desde as telas de interação com o usuário (frontend) até a lógica de manipulação de dados e regras de negócio (backend). Meu escopo de trabalho envolveu a criação e manutenção da interface com o usuário, garantindo uma experiência funcional e intuitiva, e simultaneamente, a gestão do repositório, documentação e a integração do trabalho da equipe para assegurar a coesão e o progresso do projeto.

**2. Detalhamento das Contribuições Técnicas**

Meu trabalho pode ser dividido em três grandes frentes:

* **Estruturação da Aplicação e Lógica de Negócio:** Iniciei o desenvolvimento com o upload das classes já existentes de modelo (`e97806a`) e a lógica para reserva de quadras, onde também realizei a correção de bugs iniciais (`fa7bc07`). Um dos desafios foi ajustar a rotina de autenticação para garantir que cada tipo de usuário fosse direcionado ao seu dashboard correto, trabalho refletido no commit `659513f`.

* **Desenvolvimento da Interface e Experiência do Usuário:** Criei as telas essenciais da aplicação, desde as primeiras versões (`45ec723`, `892f6c1`) até a adição de novas interfaces conforme a necessidade do projeto (`6c77d79`, `f7f1e64`).

* **Gestão de Versão e Documentação:** Dediquei atenção à organização do repositório, configurando o `.gitignore` para otimizar o versionamento (`b16468e`, `659513f`) e removendo arquivos desnecessários do rastreamento (`4638a20`). Também mantive a documentação e os recursos visuais do projeto atualizados (`b6baf92`, `c3ddf97`, `abb1f6c`, `f97f236`, `2f9cec8`) e gerenciei a integração de código através de pull requests (`96f4716`, `66ec358`).

**3. Evolução e Aprendizados**

Este projeto foi fundamental para o meu desenvolvimento prático. A necessidade de depurar problemas complexos, como a falha de autenticação, aprimorou minha capacidade de análise e resolução de problemas. A gestão do repositório e a organização da documentação me ensinaram sobre a importância de manter um ambiente de desenvolvimento limpo e compreensível para toda a equipe. Como próximos passos, busco aprofundar meus conhecimentos em validações de segurança e design de interfaces mais intuitivas.
