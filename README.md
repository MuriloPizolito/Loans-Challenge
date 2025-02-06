<h1 align="center">Avaliador de empréstimos</h1>

<h4> O avaliador de empréstimos é uma API REST desenvolvida em Java com Spring Boot. 
O projeto tem como objetivo criar um sistema para análise e recomendação de modalidades de empréstimo,  
implementando as operações básicas de consulta, com base em critérios como idade, salário e localização do cliente.  
A API processa essas informações e retorna ao cliente as opções de empréstimos disponíveis.
O projeto possui uma documentação interativa com o Swagger para facilitar a integração </h4>


### 🔗 Regras de Negócio
A API analisa a elegibilidade para os seguintes tipos de empréstimos, considerando salário, idade e localização:

### 🏦 Tipos de Empréstimos

| **Tipo**                    | **Taxa de Juros** | **Requisitos**                                                                                                     |
|-----------------------------|-------------------|--------------------------------------------------------------------------------------------------------------------|
| **Empréstimo Pessoal**      | 4%                | Salário ≤ R\$ 3.000 **OU** (Salário entre R\$ 3.000 e R\$ 5.000 **E** menos de 30 anos **E** residir em São Paulo) |
| **Empréstimo Consignado**   | 2%                | Salário ≥ R\$ 5.000                                                                                                |
| **Empréstimo com Garantia** | 3%                | Salário ≤ R\$ 3.000 **OU** (Salário entre R\$ 3.000 e R\$ 5.000 **E** menos de 30 anos **E** residir em São Paulo) |


## 🚀 Tecnologias
- **JAVA**
- **Spring Framework:**
    - **Spring Web:** Para criação de endpoints REST.
- **Maven** - Para gerenciamento de dependências e automação de build.
- **Swagger:** Ferramenta usada para explorar todos os endpoints da API, e disponibilizar uma documentação interativa e acessível da API REST.

## Endpoints
- **POST/customer-loans**
-  Recebe as informações do cliente e retorna os empréstimos disponíveis.

![Imagem  ]() 
// foto swagger

## Contato
- murilopizolito@gmail.com