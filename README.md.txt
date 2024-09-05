# Controle Financeiro - Spring MVC

Este é um projeto de **Controle Financeiro** desenvolvido em **Java** com **Spring MVC**. O objetivo do projeto é permitir que o usuário gerencie suas contas a pagar e a receber de forma eficiente.

## Funcionalidades

- Gerenciamento de contas a pagar
- Gerenciamento de contas a receber
- Criação, edição e exclusão de contas
- Relatórios financeiros
- Filtragem de contas por data, status (paga/pendente), entre outros

## Requisitos

Para executar este projeto, você precisará dos seguintes softwares:

- **Java Development Kit (JDK) 8 ou superior**: [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Apache Tomcat 10**: [Download Tomcat 10](https://tomcat.apache.org/download-10.cgi)
- **PostgreSQL 15.5**: [Download PostgreSQL 15.5](https://www.postgresql.org/download/)

## Configuração do Ambiente

### 1. Baixar e configurar o Apache Tomcat

1. Faça o download do [Apache Tomcat 10](https://tomcat.apache.org/download-10.cgi).
2. Extraia o conteúdo do arquivo baixado em um diretório de sua preferência.
3. Defina a variável de ambiente `CATALINA_HOME` apontando para o diretório onde você extraiu o Tomcat.
4. Inicie o servidor Tomcat utilizando o comando:
   ```bash
   $CATALINA_HOME/bin/startup.sh   # Para Linux/Mac
   $CATALINA_HOME/bin/startup.bat  # Para Windows
