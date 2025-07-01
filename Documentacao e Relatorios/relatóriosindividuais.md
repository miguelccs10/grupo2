## Ana Clara Leones da Silva

Quando o professor anunciou que realizaríamos um projeto de desenvolvimento de software, sugeri a criação de um sistema de reservas de quadras esportivas, motivado por uma experiência pessoal em que presenciei a locação da mesma quadra para duas pessoas diferentes, o que gerou conflitos e demonstrou a necessidade de uma solução automatizada e eficiente. Essa vivência me inspirou a propor um sistema que organizasse o processo de cadastro, autenticação e visualização de informações para locadores e locatários, garantindo maior confiabilidade e organização no gerenciamento de quadras.

Minha primeira contribuição foi a elaboração de um documento inicial contendo a motivação do projeto, um plano de desenvolvimento e o primeiro diagrama de casos de uso. Detalhei a justificativa para o sistema, descrevendo como ele atenderia às necessidades de locadores e locatários, e propus um plano de desenvolvimento incremental, que incluía a modelagem inicial. O diagrama de casos de uso inicial delineou as interações principais, como cadastro, login e visualização de quadras, servindo como base para a evolução do projeto.

Além disso, colaborei com sugestões na modelagem inicial das telas em conjunto com o [Miguel](https://github.com/miguelccs10), como a necessidade de uma tela de login intuitiva. Essas sugestões foram fundamentais para alinhar o design da interface com os requisitos funcionais, garantindo usabilidade e clareza.

Iniciei a modelagem da camada Model, definindo as classes principais (Usuario, Locador, Locatario, Database, UsuarioRepositorio). Essa modelagem inicial estabeleceu a estrutura de dados do sistema.

Com base no escopo da documentação fornecida pelo [Diniz](https://github.com/dinizanjos), que demonstrava a visão geral do sistema, e na implementação da estrutura Model-View-Controller (MVC) realizada pelo [Miguel](https://github.com/miguelccs10) e pela [Khalil](https://github.com/Khalielly), finalizei a documentação do software. Essa documentação incluiu seções sobre funcionalidades, tecnologias, instalação, uso, diagramas UML (classes, casos de uso, sequência e pacotes) e padrões de implementação.

Minhas contribuições, combinadas com o trabalho em equipe, resultaram em um sistema que atende aos requisitos iniciais de cadastro, autenticação e visualização de quadras fictícias, utilizando Java, JavaFX e ORMLite. A experiência reforçou a importância da colaboração e da aplicação dos princípios de Programação Orientada a Objetos, além de destacar a relevância de uma documentação clara para o sucesso do projeto.

## Danielly

## Diniz

## Heitor

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
