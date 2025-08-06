# 📚 Biblioteca Java

Bem-vindo ao **Biblioteca Java**, um projeto desenvolvido para praticar e consolidar conceitos de **Programação Orientada a Objetos (POO)** em Java. Este sistema simula o gerenciamento de uma biblioteca, permitindo o cadastro de livros, usuários, empréstimos e devoluções, com foco em aplicar os princípios de encapsulamento, herança, polimorfismo e abstração.

Este projeto é ideal para estudantes e desenvolvedores iniciantes que desejam explorar POO em um contexto prático e didático.

## 🚀 Funcionalidades
- **📖 Cadastro de Livros**: Adicione, remova e liste livros no acervo.
- **👤 Gerenciamento de Usuários**: Registre e gerencie informações de usuários, como alunos ou professores.
- **📤 Empréstimos e Devoluções**: Controle empréstimos de livros e suas devoluções.
- **🔍 Consulta de Disponibilidade**: Verifique quais livros estão disponíveis ou emprestados.
- **🔎 Busca de Livros**: Pesquise livros por título, autor ou outros atributos.

## 🛠 Tecnologias Utilizadas
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) 
![Spring Boot](https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
## 📂 Estrutura do Projeto
O projeto segue uma organização modular, refletindo os conceitos de POO:
- **Classes Principais**:
  - `Livro`: Representa um livro com atributos como título, autor, ISBN e status.
  - `Usuario`: Modela um usuário da biblioteca (ex.: nome, ID, livros emprestados).
  - `Biblioteca`: Gerencia o acervo e os empréstimos.
  - `Emprestimo`: Registra detalhes de empréstimos (data, usuário, livro).
- **Pacotes**:
  - `model`: Contém as entidades do sistema.
  - `controller`: Lógica de negócios (ex.: regras de empréstimo).
  - `view`: Interface de usuário (atualmente via console).
  - `Main.java`: Ponto de entrada do programa.

### Estrutura de Diretórios
```
Biblioteca-java/
├── src/
│   ├── model/
│   │   ├── Livro.java
│   │   ├── Usuario.java
│   │   ├── Biblioteca.java
│   │   └── Emprestimo.java
│   ├── controller/
│   │   └── BibliotecaController.java
│   ├── view/
│   │   └── ConsoleView.java
│   └── Main.java
├── README.md
├── .gitignore
└── pom.xml (opcional, para projetos com Maven)
```

## 📋 Pré-requisitos
- **Java Development Kit (JDK)**: Versão 17 ou superior.
- **Git**: Para clonar o repositório.
- **IDE (recomendado)**: IntelliJ IDEA, Eclipse ou outra compatível com Java.
- **Maven** (opcional): Para gerenciamento de dependências, se utilizado.

## ▶ Como Executar
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/Guilherme-Pelissari/Biblioteca-java.git
   ```
2. **Acesse o diretório do projeto**:
   ```bash
   cd Biblioteca-java
   ```
3. **Compile o projeto**:
   - Com uma IDE: Importe o projeto e execute a classe `Main.java`.
   - Manualmente:
     ```bash
     javac src/*.java
     ```
4. **Execute o programa**:
   ```bash
   java src.Main
   ```
5. Siga as instruções exibidas no console para interagir com o sistema.

## 🎮 Exemplo de Uso
1. Inicie o programa e escolha uma opção no menu interativo (ex.: "Cadastrar Livro").
2. Insira os dados solicitados, como título e autor.
3. Registre um empréstimo associando um livro a um usuário.
4. Consulte o status de um livro para verificar sua disponibilidade.

## 🤝 Contribuições
Contribuições são bem-vindas! Este é um projeto de aprendizado, mas ideias e melhorias são sempre apreciadas. Para contribuir:
1. Faça um **fork** do repositório.
2. Crie uma **branch** para sua feature:
   ```bash
   git checkout -b feature/nova-funcionalidade
   ```
3. Realize suas alterações e faça **commit**:
   ```bash
   git commit -m "Adiciona nova funcionalidade"
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin feature/nova-funcionalidade
   ```
5. Abra um **Pull Request** no GitHub.

## 🔮 Melhorias Futuras
- **Persistência de Dados**: Implementar salvamento em arquivos JSON ou banco de dados.
- **Interface Gráfica**: Adicionar suporte a JavaFX ou Swing para uma UI mais amigável.
- **Testes Unitários**: Incluir testes com JUnit para garantir a robustez do código.
- **Validação Avançada**: Melhorar a validação de entradas no console.
- **Documentação**: Adicionar JavaDoc para classes e métodos.

## 📜 Licença
Este projeto está licenciado sob a [MIT License](LICENSE).

## 👨‍💻 Autor
**Guilherme Pelissari**  
📍 [GitHub](https://github.com/Guilherme-Pelissari)  
Entre em contato para sugestões ou colaborações!

---

⭐ Se achou este projeto útil, deixe uma estrela no repositório! ⭐
